package com.iquestgroup.braneamadalin.w3p4;

/**
 * A generic Character
 */
public class Character {

    private int healthPoints;
    private int attackStrength;
    private int defence;

    public Character(int healthPoints, int attackStrength, int defence) {
        this.healthPoints = healthPoints;
        this.attackStrength = attackStrength;
        this.defence = defence;
    }

    public Character() {
    }

    /**
     * The current Character attacks another character
     *
     * @param defender The defending character
     */
    public void attack(Character defender) {
        defender.setHealthPoints(defender.getHealthPoints() - (this.getAttackStrength() - defender.getDefence()));
        System.out.println(this + "ATTACKS " + defender);
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public String toString() {
        return "Character{" +
                "healthPoints=" + healthPoints +
                ", attackStrength=" + attackStrength +
                ", defence=" + defence +
                '}';
    }
}
