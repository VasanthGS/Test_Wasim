package org.com;

import java.util.Scanner;

public class Distance2Point {
	public static void main(String[] args) {
		int x1,y1,x2,y2;
		double dist =0;
		Scanner s = new Scanner(System.in);
		System.out.println("Ener coordinates of point 1 (x1,y1):");
		System.out.println("Enter x1");
		x1 = s.nextInt();
		System.out.println("Enter y1");
		y1 = s.nextInt();

		System.out.println("Enter coordinates of points 2(x2,y2):");
		System.out.println("Enter x2");
		x2 = s.nextInt();
		System.out.println("Enter y2");
		y2 = s.nextInt();
		dist = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2 ));
		System.out.println("the distance between these two given points is :"+dist);

	}

}
