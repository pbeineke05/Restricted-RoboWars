package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich Willkommen Spieler!");
        System.out.println("Wie lautet dein Name?");
        String userName = scanner.nextLine();

        System.out.println("Viel Spaß beim Spielen " + userName + "!");
        System.out.println("                                  .''.");
        System.out.println("      .''.      .        *''*    :_\\/_:     .");
        System.out.println("     :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.");
        System.out.println(" .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-");
        System.out.println(":_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'");
        System.out.println(": /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *");
        System.out.println(" '..'  ':::'     * /\\ *     .'/.\\'.   '");
        System.out.println("     *            *..*         :");
        System.out.println();

        System.out.println("Drücke eine beliebige Taste zum Fortfahren");
        scanner.nextLine();


    }
}