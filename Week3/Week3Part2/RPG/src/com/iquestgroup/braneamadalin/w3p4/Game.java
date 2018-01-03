package com.iquestgroup.braneamadalin.w3p4;

public class Game {


    public static void main(String args[]) {
        PlayerCharacter.initialize("Jack", 100, 15, 10);
        PlayerCharacter hero = PlayerCharacter.getINSTANCE();
        RockSkinCyclops cyclops1 = new RockSkinCyclops(30, 10, 10);
        RockSkinCyclops cyclops2 = new RockSkinCyclops(35, 10, 10);
        cyclops1.castRockSkin();
        cyclops2.castRockSkin();
        FireWizard wizard1 = new FireWizard(20, 5, 5);
        wizard1.fireball();
        hero.attack(cyclops1);


    }
}
