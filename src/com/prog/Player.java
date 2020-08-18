package com.prog;

public class Player extends Object{
    private String name;

    public Player(String name) {
        super(0, 0, 100, 15);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
