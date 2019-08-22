package com.bercut.homework4;

import java.util.List;

public class Student {
    private String firstName;
    private String secondName;
    private List<Integer> marks;
    private String sex;

    Student(String firstName, String secondName, List<Integer> marks, String sex) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.marks = marks;
        this.sex = sex;
    }


    double getAvgMark() {
        int i = 0;
        double sum = 0;
        for (; i < marks.size(); i++) {
           int mark = marks.get(i);
           sum += mark;
        }
        return sum / i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", marks=" + marks +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
