package com.iquestgroup.remotelearning.w1.p2.Part3;

public class Reseller {

    public Domain gotContacted(Customer customer,Customer.infoPackage infoPackage)
    {
   Registrar registrar = new Registrar();
   return contactRegistrar(registrar,infoPackage);
    }

    private Domain contactRegistrar(Registrar registrar,Customer.infoPackage infoPackage)
    {
return  registrar.gotContacted(this,infoPackage);
    }

}
