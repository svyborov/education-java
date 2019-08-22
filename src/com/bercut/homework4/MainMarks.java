package com.bercut.homework4;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainMarks {
    public MainMarks() {
    }

    public static void main(String[] args) throws IOException {
        ClassOfStudents students = Parser.getStudents();
        List<Student> topStudents = students.getTopStudents(3);

        System.out.println("Лучше студенты: ");
        for (Student topStudent : topStudents) {
            System.out.println(topStudent);
        }
        Map<String, Double> avgSexMarks = students
                .getListOfStudents()
                .stream()
                .collect(Collectors.groupingBy(
                        Student::getSex, Collectors.averagingDouble(Student::getAvgMark)));
        System.out.println("Средний бал по полу: " + avgSexMarks);

        List<Student> studentsWithAvgMark = students
                .getListOfStudents()
                .stream()
                .filter(e->e.getAvgMark() > 4.76)
                .collect(Collectors.toList());

        System.out.println(studentsWithAvgMark);

        /*

        Найти и вывести только тех студентов, средний балл которых превышает проходной балл X, где X=4.76
         */

    }
}

