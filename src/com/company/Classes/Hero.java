package com.company.Classes;

public abstract class Hero implements HavingSuperAbility {
    private String name;
    private int health;
    private int damage;
    private SuperPower superPower;

    public Hero(String name, int health, int damage, SuperPower superPower) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }

    public Hero(String name, int health, SuperPower superPower) {
        this.name = name;
        this.health = health;
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public SuperPower getSuperPower() {
        return superPower;
    }

    public void setSuperPower(SuperPower superPower) {
        this.superPower = superPower;
    }
}
