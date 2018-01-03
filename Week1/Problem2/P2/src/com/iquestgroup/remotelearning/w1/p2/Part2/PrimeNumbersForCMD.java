package com.iquestgroup.remotelearning.w1.p2.Part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeNumbersForCMD {



        public static boolean isPrime(long nr) throws FileNotFoundException
        {   File file = new File("E:\\Users\\Madalin\\IdeaProjects\\P2\\src\\com\\iquestgroup\\remotelearning\\w1\\p2\\Part2\\Primes.txt");
            Scanner scanner = new Scanner(file);
            //fisierul contine primele 10000 de numere prime, cautare in fisiere e mai rapid decat calculare de prim din cate stiu
            long limitNumber = Long.parseLong(scanner.next());
            while ((scanner.hasNextInt())&&(nr>limitNumber))
            {
                limitNumber = Long.parseLong(scanner.next());

            }
            if(nr==limitNumber)
                return true;
            else return false;

        }

        public static void main(String args[]) throws FileNotFoundException
        {
           long number = Long.parseLong(args[0]);
            if(number>3) {
                System.out.print("1  2, -PRIME, 3, -PRIME, 4 ");
            }//parea mai eficient decat sa verific numerele foarte mici

            for(long ctr=5;ctr<=number;ctr++)
            {
                if(ctr%2==0)
                {
                    System.out.print(ctr+" ");
                }else if(isPrime(ctr))
                {
                    System.out.print(ctr+"-PRIME ");
                }else System.out.print(ctr+" ");

            }
// Solutia e foarte rapida, 30 de secunde afiseaza totul corect pana la 25000.
            // Poate fi si mai rapida daca se tine minte locatia in fisier ca sa nu mai necesite parcurgere in fiecare iteratie
        }


    }



