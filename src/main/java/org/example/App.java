package org.example;

import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Colton Flynn
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner Obj = new Scanner(System.in);

        System.out.print( "Enter the principal: ");
        int principal = Integer.parseInt(Obj.nextLine());
        System.out.print( "Enter the rate of interest: ");
        double rate = Double.parseDouble(Obj.nextLine());
        System.out.print( "Enter the number of years: ");
        int years = Integer.parseInt(Obj.nextLine());

        double total = principal*(1 + ((.01*rate)*years));

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.0f.", years, rate, total);

        //System.out.printf("%d euros at an exchange rate of %.4f is\n" +
                //"%.2f U.S. dollars.", euros,rate,dollars);
    }
}