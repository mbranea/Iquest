package com.iquestgroup.remotelearning.w1.p2.Part4;

public class Connection {
String ConnectionID;
    public Connection(String id)
    {
this.ConnectionID=id;
    }

    @Override
    public String toString() {
        return this.ConnectionID;
    }
}
