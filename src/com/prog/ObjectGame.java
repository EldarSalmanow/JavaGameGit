package com.prog;

public class ObjectGame {
    private int x, y; // позиция на карте
    private int health, attack; // количество жизней и сила атаки

    public ObjectGame(int x, int y, int health, int attack) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.attack = attack;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}
