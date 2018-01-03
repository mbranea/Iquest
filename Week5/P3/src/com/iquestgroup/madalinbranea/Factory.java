//Nu am inteles cerinta prea bine. Am facut un exemplu de class loading doar.

package com.iquestgroup.madalinbranea;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.CodeSource;
import java.security.ProtectionDomain;

public class Factory {
    public URL getClassURL(){

        try{

            File file = new File("E:\\GIT\\madalin.branea\\W5_P3_Alternate\\src");

            //convert the file to URL format
            URL url = file.toURI().toURL();
            URL[] urls = new URL[]{url};

            //load this folder into Class loader
            ClassLoader cl = new URLClassLoader(urls);

            Class  cls = cl.loadClass("com.iquestgroup.madalinbranea.MyClass");

            //print the location from where this class was loaded
            ProtectionDomain pDomain = cls.getProtectionDomain();
            CodeSource cSource = pDomain.getCodeSource();
            URL urlfrom = cSource.getLocation();
            System.out.println(urlfrom.getFile());

            return urlfrom;

        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
