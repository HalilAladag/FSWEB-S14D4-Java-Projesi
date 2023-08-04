package com.workintech.rpg;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Grumpy Troll", 100, 20.0);
        System.out.println("Troll Attack Damage: " + troll.attack());
    }
}
