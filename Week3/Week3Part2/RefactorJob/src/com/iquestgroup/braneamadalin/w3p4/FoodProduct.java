package com.iquestgroup.braneamadalin.w3p4;

import java.util.Date;

/**
 * A foodproduct
 */
public class FoodProduct extends Product {

    protected Date expirationDate;
    protected int noCalories;


    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getNoCalories() {
        return noCalories;
    }

    public void setNoCalories(int noCalories) {
        this.noCalories = noCalories;
    }

}
