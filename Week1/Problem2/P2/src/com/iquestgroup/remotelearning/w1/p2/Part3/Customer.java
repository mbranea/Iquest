package com.iquestgroup.remotelearning.w1.p2.Part3;

import java.util.List;

public class Customer {
Domain newDomain = null;
    public class infoPackage
    {
        String domainName;

        public String getDomainName() {
            return domainName;
        }

        public String getDetails() {
            return details;
        }

        public List<String> getHosts() {
            return hosts;
        }

        String details;
        List<String> hosts;

        public infoPackage(String name,String details,List<String> hosts)
        {
            this.domainName=name;
            this.details=details;
            this.hosts=hosts;
        }

    }

    public Domain contactReseller(Reseller reseller,infoPackage infoPackage)
    {
this.newDomain= reseller.gotContacted(this,infoPackage);
return  this.newDomain;
    }

    public infoPackage generatePackage(String name,String details,List<String> hosts)
    {
      return  new infoPackage(name,details,hosts);
    }

}
