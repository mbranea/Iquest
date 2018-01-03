package com.iquestgroup.braneamadalin.w3p4;

/**
 * Generic NPC
 */
public class Non-Player-Character extends Character {

    private String race;

    public Non-Player-Character(int health, int attack, int defence) {
        super(health, attack, defence);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "race='" + race + '\'' +
                '}';
    }
}
