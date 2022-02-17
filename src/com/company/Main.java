package com.company;

import com.company.Classes.*;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic("Doctor Strange", 100, 10, SuperPower.Astral_Projection);
        Medic medic = new Medic("Avicenna", 120, SuperPower.Treatment, 10);
        Warrior warrior = new Warrior("Thanos", 200, 30, SuperPower.Double_Edged_Sword);
        Hero[] heroes = {magic, warrior, medic};
        for (Hero person : heroes) {
            person.applySuperAbility();
            if (person instanceof Medic) {
                ((Medic) person).increase_experience();
                System.out.println("Healh Points: " + ((Medic) person).getHealPoints());
            }
        }
    }
}
