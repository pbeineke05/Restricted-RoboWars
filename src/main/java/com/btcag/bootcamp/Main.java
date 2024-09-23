package com.btcag.bootcamp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName;
        char playerRobot;
        long length = 0, height = 0, roboX = 0, roboY = 0;

        System.out.println("Herzlich Willkommen Spieler!");
        System.out.println("Wie lautet dein Name?");
        userName = scanner.nextLine();

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

        System.out.println();
        System.out.println("Wähle deinen RoboChampion!");
        System.out.println("[1] Ѻ");
        System.out.println("[2] Ω");
        System.out.println("[3] ₼");
        System.out.println("Oder wähle einen Custom Robot:");

        playerRobot = scanner.nextLine().charAt(0);

        while (playerRobot > 48) {
            while (playerRobot < 52) {
                while (playerRobot == 49) playerRobot = 'Ѻ';
                while (playerRobot == 50) playerRobot = 'Ω';
                while (playerRobot == 51) playerRobot = '₼';
            }
            break;
        }

        System.out.println("Gute Wahl! Du spielst nun als " + playerRobot + ".");
        System.out.println("Wie groß soll das Spielfeld sein? Eingabe in dem Format 'x,y'");
        String temp = scanner.nextLine();

        int i = 0;
        String tempLength = "", tempHeight = "";
        while (temp.charAt(i) != ',') {
            tempLength += temp.charAt(i);
            i++;
        }
        i++; //Überspringen des Kommas
        while (i < temp.length()) {
            tempHeight += temp.charAt(i);
            i++;
        }

        /*
        Der folgende Bereich versucht diese Funktionen im Rahmen der gegebenen Einschränkungen umzusetzen
        length = Long.parseLong(tempLength);
        height = Long.parseLong(tempHeight);*/

        int lengthLength = tempLength.length() - 1;
        length += tempLength.charAt(lengthLength) - '0';
        lengthLength--;
        while (lengthLength > -1) {
            length += ((tempLength.charAt(lengthLength) - '0') * (10L * (tempLength.length() - lengthLength - 1)));
            lengthLength--;
        }

        int heightLength = tempHeight.length() - 1;
        height += tempHeight.charAt(heightLength) - '0';
        heightLength--;
        while (heightLength > -1) {
            height += ((tempHeight.charAt(heightLength) - '0') * (10L * (tempHeight.length() - heightLength - 1)));
            heightLength--;
        }

        System.out.println("Wo soll der Robo starten? Eingabe in dem Format 'x,y'");
        temp = scanner.nextLine();

        i = 0;
        String tempRoboX = "", tempRoboY = "";
        while (temp.charAt(i) != ',') {
            tempRoboX += temp.charAt(i);
            i++;
        }
        i++; //Überspringen des Kommas
        while (i < temp.length()) {
            tempRoboY += temp.charAt(i);
            i++;
        }

        /*
        Der folgende Bereich versucht diese Funktionen im Rahmen der gegebenen Einschränkungen umzusetzen
        roboX = Long.parseLong(tempRoboX);
        roboY = Long.parseLong(tempRoboY);*/

        int roboXLength = tempRoboX.length() - 1;
        roboX += tempRoboX.charAt(roboXLength) - '0';
        roboXLength--;
        while (roboXLength > -1) {
            roboX += ((tempRoboX.charAt(roboXLength) - '0') * (10L * (tempRoboX.length() - roboXLength - 1)));
            roboXLength--;
        }

        int roboYLength = tempRoboY.length() - 1;
        roboY += tempRoboY.charAt(roboYLength) - '0';
        roboYLength--;
        while (roboYLength > -1) {
            roboY += ((tempRoboY.charAt(roboYLength) - '0') * (10L * (tempRoboY.length() - roboYLength - 1)));
            roboYLength--;
        }

        System.out.println("Das Spielfeld ist " + length + "breit und " + height + "hoch.");
        System.out.println("Der Robo startet auf Position " + roboX + "," + roboY + ".");
    }
}