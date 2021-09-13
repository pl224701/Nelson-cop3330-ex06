/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */


package org.example;
import java.util.Scanner;
import java.util.Date;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("What is your current age? ");
        String str1=sc.nextLine();
        System.out.print("At what age would you like to retire? ");
        String str2=sc.nextLine();
        int n1=Integer.parseInt(str1);
        int n2=Integer.parseInt(str2);
        int n3=n2-n1;
        Date d = new Date();
        int year=1900+d.getYear();
        int n4=year+n3;
        System.out.printf("You have %d years left until you can retire.\n",n3);
        System.out.printf("It's %d, so you can retire in %d.",year,n4);
    }
}
