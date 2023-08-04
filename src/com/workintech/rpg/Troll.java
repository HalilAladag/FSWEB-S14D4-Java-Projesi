package com.workintech.rpg;

public class Troll extends Monster {
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }
    public double bleed() {
        return getDamage()*0.25;
    }

    public double poison() {
        return getDamage()*0.3;
    }
}
