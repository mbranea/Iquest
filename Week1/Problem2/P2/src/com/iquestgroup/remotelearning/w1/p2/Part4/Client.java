package com.iquestgroup.remotelearning.w1.p2.Part4;

import java.util.Scanner;

public class Client {

    public static void main(String args[])
    {
        Connection currentConnection = null;
        ConnectionManager manager = new ConnectionManager();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 to get connection");
        System.out.println("2 to release connection");
        System.out.println("3 to kill application");

        while(true)
        {
            if(sc.next().equals("1"))
            {
                if(currentConnection==null) {
                    currentConnection = manager.getConnection();
                }
                if(currentConnection==null) {
                    System.out.println("No connections available");


                }else
                    { System.out.println(currentConnection.toString());}
            }else if(sc.next().equals("2"))
            {
                manager.returnConnection(currentConnection);
            }else if(sc.next().equals("3")){
                manager.returnConnection(currentConnection);
                System.exit(1);
            }else System.out.println("Please enter a valid command");

        }
    }


}
