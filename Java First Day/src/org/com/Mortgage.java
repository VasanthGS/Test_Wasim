package org.com;

import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		// create Scanner class object to read input
		Scanner scan = new Scanner(System.in);

		// variables
		double principle = 0.0;
		double rate = 0.0;
		double time = 0.0;
		double payment = 0.0;

		// take input values
		System.out.print("Enter Principal Amount: ");
		principle = scan.nextDouble(); // 100000
		System.out.print("Enter Interest Rate: ");
		rate = scan.nextDouble(); //6
		System.out.print("Enter Time (in years): ");
		time = scan.nextDouble(); //30

		// calculate monthly payment
		payment = calculator(principle, rate, time);
		// payment = calculator(100000,6,30);

		// display result
		System.out.println("Monthly Payment = " + payment);

		// close scan
		scan.close();

	}

	// method for Mortgage calculator
	public static double calculator(double principle, double rate, 
			double time) {
		// convert rate for month format 
		rate = (rate/100)/12;
		// rate = (6/100)/12; //0.005

		// convert time in the terms of months
		time = time * 12;
		// time = 30 * 12; // 360


		// M = P [{r*(1+r)^n}/{(1+r)^n – 1}]
		double payment = principle * (  (rate * Math.pow(1+rate, time))
				/ (Math.pow(1+rate, time) - 1) ); 

		// doubel payment = 100000 * ( (     0.005 * pow (1 +0.005 ,360)) / pow( 1+ 0.005 , 360) -1 );     


		return payment;
	}

}