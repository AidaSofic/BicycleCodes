package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        int First = Integer.parseInt(scan.next());
        int Second = Integer.parseInt(scan.next());

        if (First % 2 == 0 || Second % 2 != 0){ //checking if first number is divisible with 2 OR
                                                //is the second number is not divisible with 2
            System.out.print ("yes");           //if either of this conditions are true, then the thief will open the lock
        } else {
                System.out.print ("no");
            }
    }}

