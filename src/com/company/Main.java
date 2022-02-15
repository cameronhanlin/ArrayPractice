package com.company;


import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] tempsF = new double[7];
        double[] tempsC = new double[7];
        double total = 0;
        double average;
        double celcius;



        for(int i=tempsF.length-1; i>=0; i--){ // collect inputs
            System.out.print("What was the temperature "+i+" days ago in Fahrenheit? ");
            tempsF[i] = scan.nextDouble();
        }

        System.out.println("\b");
        System.out.println("These are all of the numbers you have input: ");
        for(double x: tempsF){ //print the inputs in F
            System.out.print(x+"F ");
        }

        System.out.println("\b");
        System.out.println("These are all of the numbers you have input in Celsius: ");
        for(int i=0; i<tempsF.length; i++){ //convert and fill celsius array
            celcius = (tempsF[i]-32)/1.8;
            celcius = Math.round(celcius*10);
            tempsC[i] = celcius/10;
        }
        for(double x: tempsC){ //output the temps in C
            System.out.print(x+"C ");
        }

        for(int i=0; i < tempsF.length; i++){ // calculates the total of the array in F
            total = total+tempsF[i];
        }
        average = total/tempsF.length;

        System.out.println("\b");
        System.out.println("The average temp is "+average+"F, and "+(average-32)/1.8+"C ");


    }
}
