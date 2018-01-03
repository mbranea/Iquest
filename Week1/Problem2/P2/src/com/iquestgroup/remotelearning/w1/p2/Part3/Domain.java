package com.iquestgroup.remotelearning.w1.p2.Part3;

import java.util.List;
import java.util.Random;

public class Domain {

    String domainCode;
    String domainName;
    String domainDetails;
    List<String> domainHosts;


    public Domain(String name, String details, List<String> hosts) {
        Random r = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        String alphabet = "123xyz";
        for (int i = 0; i < 8; i++) {

            stringBuffer.append(alphabet.charAt(r.nextInt(alphabet.length())));

        }
        this.domainCode = stringBuffer.toString();
        this.domainDetails = details;
        this.domainHosts = hosts;
        this.domainName = name;

    }

    @Override
    public String toString() {
        return "Domain{" +
                "domainCode='" + domainCode + '\'' +
                ", domainName='" + domainName + '\'' +
                ", domainDetails='" + domainDetails + '\'' +
                ", domainHosts=" + domainHosts +
                '}';
    }
}
