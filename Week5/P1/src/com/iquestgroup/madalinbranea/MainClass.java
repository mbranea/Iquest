package com.iquestgroup.madalinbranea;

import java.util.Date;

public class MainClass {

    public static void main(String args[]) {

        Date today = new Date();

        System.out.println(DateTransformer.transform(today));

    }
}
