package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Amount: ");
		double total = kb.nextDouble();
		System.out.print("Tendered: ");
		double tender = kb.nextDouble();
		
		
		if (tender < total) {
			System.out.println("That's not enough, leave.");
		}
		
		else if (tender == total){
			System.out.println("Thanks, come again.");
		}
		
		
		else if (tender > total) {
		
			tender = ((tender - total) + 0.001); 	//the .001 is added to fix the double
			//System.out.println("Your total change is " + tender);
			
			if (tender / 20 > 1.00) {
				System.out.println((int) (tender / 20) + " twenty dollar bills "); 
				tender = tender % 20;
			}
			
			if (tender / 10 > 1.00) {
				System.out.println((int) (tender / 10) + " ten dollar bills "); 
				tender = tender % 10;
			}
			
			if (tender / 5 > 1.00) {
				System.out.println((int) (tender / 5) + " five dollar bills "); 
				tender = tender % 5;
			}
			
			if (tender / 1 > 1.00) {
				System.out.println((int) (tender / 1) + " one dollar bills "); 
				tender = tender % 1;
			}
			
			if (tender / .25 > 1.00) {
				System.out.println((int) (tender / .25) + " quarters "); 
				tender = tender % .25;
			}
			
			if (tender / .10 > 1.00) {
				System.out.println((int) (tender / .10) + " dimes "); 
				tender = tender % .10;
			}
			
			if (tender / .05 > 1.00) {
				System.out.println((int) (tender / .05) + " nickels "); 
				tender = tender % .05;
			}
			
			if (tender / .01 > 1.00) {
				System.out.println((int)(tender  / .01) + " pennies "); 
				tender = tender % .01;
			}
			
		}

	}
	
}

//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
