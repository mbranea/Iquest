package com.iquestgroup.remotelearning.w1.p2.Part3;

public class Registry {

    public Domain registerDomain(Customer.infoPackage infoPackage)
    {
        return new Domain(infoPackage.getDomainName(),infoPackage.getDetails(),infoPackage.getHosts());
    }

}
