package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] temps = new double[7];
        double total = 0;
        double average;


        for(int i=temps.length-1; i>=0; i--){
            System.out.print("What was the temperature "+i+" days ago? ");
            temps[i] = scan.nextDouble();
        }

        System.out.println("\b");
        System.out.println("These are all of the numbers you have input: ");
        for(int i=0; i<temps.length; i++){
            System.out.print(temps[i]+"  ");
        }

        for(int i=0; i < temps.length; i++){
            total = total+temps[i];
        }
        average = total/temps.length;

        System.out.println("The average temp is "+average);




    }
}
