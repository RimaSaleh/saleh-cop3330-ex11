/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //initializing total of USD
        double total;

        //print statement asking for amount of euros be inputted
        System.out.println( "How many euros are you exchanging? " );
        //number will be inputted and stored as "euros"
        int euros = scanner.nextInt();

        //print statement asking for the exchange rate be inputted
        System.out.println( "What is the exchange rate?" );
        //number will be inputted and stored as "exchange_rate"
        double exchange_rate = scanner.nextDouble();

        //converting
        total = euros * exchange_rate;

        //output for conversion (euro to usd)
        System.out.format( "%d euros at an exchange rate of %f is: ", euros, exchange_rate );
        System.out.format( "%.2f U.S. dollars.",total);
    }
}
