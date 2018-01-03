package com.iquestgroup.braneamadalin.p2;

public class MainClass {
    public static void main(String args[]) {
        Frog frog = new Frog();
        frog.jump();
        Amphibian froggie = (Amphibian) frog;
        froggie.jump();
    }

}
