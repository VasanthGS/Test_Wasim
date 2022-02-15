package org.com;

import java.util.Scanner;

public class CompundInterest {
	public static void main(String[] args) {
		
		double P, R ,N ,I;
		double result;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principal value: ");
		P=s.nextDouble();
		System.out.println("Enter Rate of interest: ");
		R=s.nextDouble();
		System.out.println("Enter No of Years: ");
		N=s.nextDouble();
		
		I=R/100;
		result=P*Math.pow(1+I, N);
		System.out.printf("Compund interest %.2f",result);	
	}

}
