package com.bercut.jstack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JStackRunner {
    public static void main(String[] args) throws IOException {
        Process p = new ProcessBuilder("jstack", args[0]).start();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()))) {
            String line;
            boolean previousEmptyString = false;
            while ((line = br.readLine())!= null) {
                System.out.println("Новая строка");
                System.out.println(line);
                if (line.length() == 0) {
                    previousEmptyString = true;
                    continue;
                }
                if (previousEmptyString) {
                    previousEmptyString = false;
                    System.out.println(line.length());
                    System.out.println(line.substring(0, 1));
                    if (line.substring(0, 1).equals("\"")) {
                        System.out.println(line);
                    }
                }

            }
        }
    }
}
