package com.iquestgroup.braneamadalin.w3p4;

/**
 * An Ice Wizard type NPC
 */
public class IceWizard extends Non-Player-Character{

public IceWizard(int health,int attack,int defence){
        super(health,attack,defence);
        this.setRace("Ice Wizard");
        System.out.println("Created monster of race "+getRace()+" health:"+getHealthPoints()+" attack:"+getAttackStrength()+" defence"+getDefence());

        }

/**
 * The Ice Wizard shoots a Frost Bolt at the Hero
 */
public void frostBolt(){
        PlayerCharacter hero=PlayerCharacter.getINSTANCE();
        hero.setHealthPoints(hero.getHealthPoints()-10);
        System.out.println("Ice Wizard casts FrostBall");
        }

        }
