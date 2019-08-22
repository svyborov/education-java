package com.bercut.homework4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Parser {
    static ClassOfStudents getStudents() throws IOException {
        InputStream a = new FileInputStream("/Users/svyborov/IdeaProjects/eduJava/Bank/src/com/bercut/homework4/marks.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(a))) {
            String line;
            ClassOfStudents students = new ClassOfStudents();
            while ((line = br.readLine())!= null) {
                String[] dataArray = line.split(" ");
                List<Integer> marks = new ArrayList<>();
                for (String s : dataArray) {
                    if (checkInt(s)) {
                        Integer mark = Integer.valueOf(s);
                        marks.add(mark);
                    }
                }
                Student student = new Student(dataArray[0], dataArray[1], marks, dataArray[2]);
                students.addStudent(student);
            }
            return students;
        }
    }

    private static boolean checkInt(String string) {
        try {
            Integer.parseInt(string);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
