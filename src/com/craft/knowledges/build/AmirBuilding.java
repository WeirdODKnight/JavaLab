package com.craft.knowledges.build;

import java.util.ArrayList;
import java.util.Scanner;

public class AmirBuilding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> length = new ArrayList<Integer>();
		ArrayList<Integer> width = new ArrayList<Integer>();
		ArrayList<Integer> height = new ArrayList<Integer>();
		int n = 0;
		int sum = 0;
		System.out.println("Enter the number of your building!");
		Scanner input = new Scanner(System.in);
		n=input.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.println("Enter the " + (i+1) + " length");
			length.add(input.nextInt());
			System.out.println("Enter the " + (i+1) + " width");
			width.add(input.nextInt());
			System.out.println("Enter the " + (i+1) + " height");
			height.add(input.nextInt());
		}
		
		for (int i=0; i<n; i++) {
			sum = sum + length.get(i)+width.get(i)+height.get(i);
		}
		System.out.println(sum);
	}

}
