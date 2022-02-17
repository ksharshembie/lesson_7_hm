package com.company.Classes;

public class Medic extends Hero {
    private int healPoints;

    public Medic(String name, int health, SuperPower superPower, int healPoints) {
        super(name, health, superPower);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void applySuperAbility() {
        System.out.println(this.getName() + " applied power: " + this.getSuperPower());
    }

    public void increase_experience() {
        healPoints += healPoints * 0.1;
    }
}
