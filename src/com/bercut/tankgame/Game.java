package com.bercut.tankgame;

import java.util.Arrays;
import java.util.Random;

public class Game {
    Tank [][] gameField;
    Tank findTankAt(int x, int y) {
        System.out.println(Arrays.deepToString(gameField));

        System.out.println(gameField.length);
        System.out.println(gameFieldSize);
        System.out.println(x);
        System.out.println(y);
        return gameField[x][y];
    }

    final Random random = new Random();
    int gameFieldSize = 3;

    void startGame() {
        Abrams abrams = new Abrams(15, this);
        T90 t90 = new T90(15, this);

        gameField = new Tank[gameFieldSize][gameFieldSize];
        int abramsX = random.nextInt(gameFieldSize);
        int abramsY = random.nextInt(gameFieldSize);

        System.out.println(abramsX + " " + abramsY);


        int t90X = random.nextInt(gameFieldSize);
        int t90Y = random.nextInt(gameFieldSize);

        System.out.println(t90X + " " + t90Y);

        gameField[abramsX][abramsY] = abrams;
        gameField[t90X][t90Y] = t90;

        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
        abrams.fire();
        t90.fire();
    }
}
