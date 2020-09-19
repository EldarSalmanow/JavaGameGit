package com.prog;

public class Enemy extends ObjectGame {
    private int level;

    public Enemy(int x, int y, int level) {
        super(x, y, 0, 0);
        this.level = level;
        initEnemy();
    }

    private void initEnemy() {
        int level = getLevel();
        if (level == 1) {
            this.setHealth(40);
            this.setAttack(10);
        }
        else if (level == 2) {
            this.setHealth(60);
            this.setAttack(15);
        }
        else if (level == 3) {
            this.setHealth(80);
            this.setAttack(20);
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
