package com.iquestgroup.remotelearning.w1.p2.Part3;

import java.util.Arrays;

public class MainClass {
//se cere un domain de catre Customer, cerere care merge din obiect in obiect pana ajunge la Registry, iar pe aceeasi cale prin returns
    // se intoarce un obiect de tip Domain cu un cod generat random care ii e dat domainului si printat.

    public static void main(String args[]){
        Customer customer = new Customer();
        Reseller reseller = new Reseller();
       Domain domain = customer.contactReseller(reseller,customer.generatePackage("ExampleName","ExampleDetails",
                Arrays.asList(new String[]{"host1","host2"})));
System.out.println(domain);

    }

}
