package com.bercut.homework4;

import java.util.ArrayList;
import java.util.List;

class ClassOfStudents {


    private List<Student> listOfStudents = new ArrayList<>();

    ClassOfStudents() {

    }

    void addStudent(Student student) {
        listOfStudents.add(student);
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }
    List<Student> getTopStudents(int count) {
        List<Student> topStudents = new ArrayList<>(listOfStudents);

        Student temp;
        for (int i = 0; i < topStudents.size(); i++)
        {
            for (int j = i + 1; j < topStudents.size(); j++)
            {
                if (topStudents.get(i).getAvgMark() > topStudents.get(j).getAvgMark())
                {
                    temp = topStudents.get(i);
                    topStudents.set(i, topStudents.get(j));
                    topStudents.set(j, temp);
                }
            }
        }
        return topStudents.subList(topStudents.size() - count, topStudents.size());
    }
}

