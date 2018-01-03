package com.iquestgroup.braneamadalin.w3p4;

/**
 * Cyclops type NPC
 */
public class RockSkinCyclops extends Non-Player-Character{

public RockSkinCyclops(int health,int attack,int defence){
        super(health,attack,defence);
        this.setRace("Rock Skin Cyclops");
        System.out.println("Created monster of race "+getRace()+" health:"+getHealthPoints()+" attack:"+getAttackStrength()+" defence"+getDefence());
        }

/**
 * The cyclops increases his defence stat
 */
public void castRockSkin(){

        System.out.println("Rock Cyclops uses Rock Skin");
        this.setDefence(this.getDefence()+5);
        }


        }
