package com.bercut.tankgame;

public class T90 extends Tank {
    int x;
    int y;

    T90(int ammo, Game game) {
        super(ammo, game);
    }

    @Override
    public void fire() {
        if (ammo > 0) {
            ammo--;
            Tank enemyTank = game.findTankAt(x, y);
            System.out.println("Огонь Батарея!");
            if (enemyTank != null) {
                if (enemyTank == this) {
                    System.out.println("Самоуничтожился");
                } else {
                    System.out.println("Вражеский танк убит");
                }
            }
            if (y == game.gameFieldSize - 1) {
                if (x != game.gameFieldSize - 1) {
                    x++;
                    y = 0;
                }
            } else {
                y++;
            }
        } else {
            System.out.println("Пустой!");
        }
    }
}
