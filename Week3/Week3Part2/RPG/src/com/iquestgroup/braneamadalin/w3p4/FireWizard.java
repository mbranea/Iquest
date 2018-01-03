package com.iquestgroup.braneamadalin.w3p4;

/**
 * A fireWizard type NPC
 */
public class FireWizard extends Non-Player-Character{

public FireWizard(int health,int attack,int defence){
        super(health,attack,defence);
        this.setRace("Fire Wizard");
        System.out.println("Created monster of race "+getRace()+" health:"+
        +getHealthPoints()+" attack:"+getAttackStrength()+" defence"+getDefence());

        }

/**
 * The wizard fires a fireball at the hero
 */
public void fireball(){
        PlayerCharacter hero=PlayerCharacter.getINSTANCE();
        hero.setHealthPoints(hero.getHealthPoints()-10);
        System.out.println("Fire Wizard casts Fireball");
        }
        }
