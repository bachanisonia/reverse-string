package com.learnjava.corejava;

import java.util.Scanner;

import com.learnjava.corejava.reversestring.ReverseString;

public class ReverseStringExample {

	public static void main(String[] args) {

		String outputStr = null;
		System.out.println("Enter the input String : ");
		
		Scanner input = new Scanner(System.in);
		
		char[] inputString = input.nextLine().toCharArray();
		
		ReverseString rs = new ReverseString();
		
		outputStr = rs.reverseString(inputString);
		System.out.println("The reversed String is : " + outputStr);

	}

}
