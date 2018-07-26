package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double taxRate =0;
        double grandTotal=0;
        double subTotal=0;
        System.out.println("Enter the tax rate");
         taxRate=keyboard.nextDouble();

        System.out.println("How many items would you like to enter?");
        int size=keyboard.nextInt();

        double[] prices= new double[size];

        for(int i=0;i<prices.length;i++){
            System.out.println("Enter the price of item # "+(i+1));
            prices[i]=keyboard.nextDouble();

            if(prices[i]==0.0){
                break;
            }else {
                subTotal=subTotal+prices[i];
            }
        }
        System.out.println("------------------------------\n Receipt");
        for (int i=0;i<prices.length;i++){
            System.out.println(prices[i]);
        }

        grandTotal=(taxRate*subTotal)+subTotal;

        System.out.println(subTotal+" sub-total");
        System.out.println(taxRate*subTotal+" tax");
        System.out.println(grandTotal+" grand total");

    }
}
