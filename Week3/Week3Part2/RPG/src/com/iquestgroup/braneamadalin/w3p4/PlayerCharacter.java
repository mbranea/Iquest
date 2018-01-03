package com.iquestgroup.braneamadalin.w3p4;

/**
 * The Hero Class. Operates as singleton
 */
public class PlayerCharacter extends Character {

    private static final PlayerCharacter INSTANCE = new PlayerCharacter();

    private int experience;
    private String name;

    private PlayerCharacter() {
        super();
    }

    /**
     * Initialising the hero Character
     *
     * @param name           Name
     * @param healthPoints   HealthPoints
     * @param attackStrength AttackPower
     * @param defence        Defence Stat
     */
    public static void initialize(String name, int healthPoints, int attackStrength, int defence) {
        INSTANCE.experience = 0;
        INSTANCE.name = name;
        INSTANCE.setHealthPoints(healthPoints);
        INSTANCE.setAttackStrength(attackStrength);
        INSTANCE.setDefence(defence);
        System.out.println("Hero " + INSTANCE.name + "arrived." + "health: " + INSTANCE.getHealthPoints() + "attack:"
                + INSTANCE.getAttackStrength() + "defence:" + INSTANCE.getDefence());
    }

    public static PlayerCharacter getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "experience=" + experience +
                ", name='" + name + '\'' +
                '}';
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setName(String name) {
        this.name = name;
    }
}
