package com.iquestgroup.braneamadalin.w3p4;


/**
 * A techproduct
 */
public class TechProduct extends Product {

    protected int warranty; // number of years

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

}
