package org.com;

import java.util.Scanner;

public class Areaofcircle {
	public static void main(String[] args) {
		float r,area;
		
		System.out.println("Enter Radius of Circle:");
		Scanner s = new Scanner(System.in);
		r=s.nextFloat();
		
		area = (float) (22.0/7 * r * r);
		
		
		System.out.printf("Area of Circle with Radius %4f is %.4f ",r,area);
	}

}
