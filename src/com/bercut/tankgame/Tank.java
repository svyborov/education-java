package com.bercut.tankgame;

public class Tank {
    int ammo;
    Game game;

    Tank(int ammo, Game game) {
        this.ammo = ammo;
        this.game = game;
    }

    public void fire() {
        System.out.println("Пиу!");
    }


}
