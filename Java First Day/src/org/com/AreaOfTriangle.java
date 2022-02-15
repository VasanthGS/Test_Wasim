package org.com;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		int base =0;
		int height =0;
		int area = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of base  of triangle: ");
		base = s.nextInt();
		
		System.out.println("Enter the height of triangle: ");
		height = s.nextInt();
		
		area =(base * height)/2;
		
		System.out.println("The area of triangle is : "+area);
	}

}
