package com.bercut.homework3;

public class HomeWork3 {
    public static void main(String[] args) {
        System.out.println(getSpeed(1000, 60));
        System.out.println(getSpeed(2000, 60));

        System.out.println(getAbbreviation("Санкт-Петербургский Государственный Технический Институт им. Патриса Лумумбы"));


    }

    static double getSpeed(double distance, double time) {
        return (distance/1000) / (time/60);
    }

    static String getAbbreviation(String fullName) {
        String[] arrName = fullName.split("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arrName.length; i++) {
            String ch = arrName[i];
            String chUpper = arrName[i].toUpperCase();
            if (Character.isLetter(ch.charAt(0)) && ch.equals(chUpper)) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
