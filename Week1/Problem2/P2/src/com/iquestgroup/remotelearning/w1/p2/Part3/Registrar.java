package com.iquestgroup.remotelearning.w1.p2.Part3;

public class Registrar {

    public Domain gotContacted(Reseller reseller,Customer.infoPackage infoPackage)
    {
        Registry registry = new Registry();
        return contactRegistry(registry,infoPackage);
    }

    private Domain contactRegistry(Registry registry,Customer.infoPackage infoPackage)
    {
return registry.registerDomain(infoPackage);

    }


}
