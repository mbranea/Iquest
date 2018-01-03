package com.iquestgroup.remotelearning.w1.p2.Part1;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public  static void main(String args[]) throws IOException {

        String[] stringArray = ReadFromFile.readLinesFromTextFile("E:\\Users\\Madalin\\IdeaProjects\\P2\\src\\com\\iquestgroup\\remotelearning\\w1\\p2\\Part1\\W1P1input.txt");
        Set<String> stringSet = new HashSet<>();
        for(int i=0;i<=stringArray.length-1;i++)
        {
            stringSet.add(stringArray[i]);
        }

        for(String string : stringSet)
        {
            System.out.println(string);


        }
       //Set nu accepta duplicate
    }
}
