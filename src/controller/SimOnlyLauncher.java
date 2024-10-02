package controller;

import model.Verbruik;

import javax.management.MBeanServerBuilder;
import java.util.Scanner;

/**
 * @author Furkan Altay
 * Purpose for the class
 */
public class SimOnlyLauncher {

    public static void main(String[] args) {
        Scanner toetsenbord = new Scanner(System.in);
        Verbruik augustusVerbruik = new Verbruik("Augustus", 4500);
        System.out.println(augustusVerbruik.berekenKosten());
        System.out.println(augustusVerbruik.toonVerbruik());

        Verbruik[] verbruikArray = new  Verbruik[4];
        verbruikArray[0] = new Verbruik("Juli");
        verbruikArray[1] = new Verbruik("Augustus");
        verbruikArray[2] = new Verbruik("September");
        verbruikArray[3] =  new Verbruik("Oktober");

        Verbruik[] mbArray = new Verbruik[4];

        for (int teller = 0; teller < verbruikArray.length; teller++) {
            System.out.println("Geef je dataverbruik in MB per maand: ");
            System.out.printf("%s :", verbruikArray[teller].getMaand());
            int mb = toetsenbord.nextInt();
            verbruikArray[teller].setHoeveelheidMB( mb);
        }

        System.out.printf("%-10s %4s %5s %16s\n","MAAND" ,"MB" ,"KOSTEN","");
        for (int teller = 0; teller < verbruikArray.length; teller++) {
            System.out.printf("%-10s %4d %6.2f %16s\n",verbruikArray[teller].getMaand() ,verbruikArray[teller].getHoeveelheidMB() ,verbruikArray[teller].berekenKosten(),verbruikArray[teller].toonVerbruik());

        }

    }
}
