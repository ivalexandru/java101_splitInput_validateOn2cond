package com.sarmale;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //success party (true) if 10-20 cups, unless it's weekend, caz in care 15-25 (both times inclusive)
        String theInput = scanner.nextLine();
        String[] separated = theInput.split(" ");
        int totalNrOfCups = Integer.parseInt(separated[0]);
        boolean isItWeekend = Boolean.parseBoolean(separated[1]);
        System.out.println(oneToRuleThemAll(isItWeekend, totalNrOfCups));
    }

    public static boolean oneToRuleThemAll(boolean b, int nrOfCups) {
        if (b) {
            return b && (nrOfCups >= 15 && nrOfCups <= 25);
        } else {
            return !b && (nrOfCups >= 10 && nrOfCups <= 20);
        }
    }
}


