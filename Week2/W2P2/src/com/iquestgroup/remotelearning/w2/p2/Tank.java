package com.iquestgroup.remotelearning.w2.p2;

import java.util.Stack;

public class Tank extends Stack<String> {
    @Override
    public void finalize() throws Throwable {

        if (this.isEmpty()) {
            System.out.println("testingTankEmpty GC is called");
            super.finalize();

        } else if (!this.isEmpty()) {
            System.out.println("testingTankNotEmpty GC is not called");
        }
    }


}
