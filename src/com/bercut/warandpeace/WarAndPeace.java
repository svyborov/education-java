package com.bercut.warandpeace;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WarAndPeace {
    static void getCount(int maxLength, int minLength) throws IOException { // Map<String, Integer>
        InputStream a = new FileInputStream("/Users/svyborov/IdeaProjects/eduJava/Bank/src/com/bercut/warandpeace/vim1.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(a))) {
            String line;
            Map<String, Integer> wordsCount = new HashMap<>();
            int totalCounter = 0;
            while ((line = br.readLine())!= null) {
                System.out.println(line);
                String[] dataArray = line.split(" ");
                for (String s : dataArray) {
                    String correctString = delNoDigOrLet(s);
                    if (correctString.length() >= minLength && correctString.length() <= maxLength) {
                        totalCounter++;
                        if (wordsCount.containsKey(correctString)) {
                            Integer conter = wordsCount.get(correctString);
                            conter++;
                            wordsCount.put(correctString, conter);
                        } else {
                            wordsCount.put(correctString, 1);
                        }
                    }
                }
            }
            wordsCount.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue())
                    .forEach(System.out::println);;

            System.out.println("Всего слов: " + totalCounter);
        }

    }

    private static String delNoDigOrLet (String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character .isLetterOrDigit(s.charAt(i)))
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
