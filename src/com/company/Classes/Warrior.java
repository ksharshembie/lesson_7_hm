package com.company.Classes;

public class Warrior extends Hero {

    public Warrior(String name, int health, int damage, SuperPower superPower) {
        super(name, health, damage, superPower);
    }

    public void applySuperAbility() {
        System.out.println(this.getName() + " applied warrior power: " + this.getSuperPower());
    }
}
