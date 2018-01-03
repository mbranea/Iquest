package com.iquestgroup.remotelearning.w1.p2.Part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ConnectionManager {

    List<Connection> freeList = new ArrayList<Connection>();
    List<Connection> usedList = new ArrayList<Connection>();
    public ConnectionManager() {
        for (int i = 0; i <= 9; i++)
        {
         freeList.add(new Connection(i+""));
        }
    }
    public ConnectionManager(boolean var) {
        //empty freeList
    }
    public Connection getConnection()
    {
        if(freeList.size()==0)
        {
            return null;
        }
        Random random = new Random();
        Connection intermediary = freeList.get(random.nextInt(freeList.size()));
        this.freeList.remove(intermediary);
        this.usedList.add(intermediary);
        return intermediary;

    }

    public void returnConnection(Connection connection)
    {
        if(!connection.equals(null)) {
            this.usedList.remove(connection);
            this.freeList.add(connection);
        }
    }

}
