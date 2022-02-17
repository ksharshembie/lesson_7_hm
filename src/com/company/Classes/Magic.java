package com.company.Classes;

public class Magic extends Hero {

    public Magic(String name, int health, int damage, SuperPower superPower) {
        super(name, health, damage, superPower);
    }

    public void applySuperAbility() {
        System.out.println(this.getName() + " applied magic power: " + this.getSuperPower());
    }

}
