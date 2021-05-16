package com.skilldistillery;

import java.util.Scanner;


public class MakeChange {
	//adding these static variables will come in handy while working with them in our methods
	static double total, tender;
	static String change = "";
	static int counter = 0;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Amount: ");
		total = kb.nextDouble();
		System.out.print("Tendered: ");
		tender = kb.nextDouble();
		
		if (tender < total) {
			System.out.println("That's not enough, get out of here, hippie.");
		} //if
		
		else if (tender == total){
			System.out.println("No change necessary. Thanks, come again.");
		} //else if
		
		else if (tender > total) {
			tender = ((tender - total) + 0.001);	
			//the .001 is added to fix the doubles operation problem in java 
			//This integer will also track how many bills are returned

			//If change is leftover, the program will run through until it reaches 'zero' 
			//and then prints out the total amount saved in the change String
			if (tender / 20 > 1.00) {
				//casting integer on the division will show us how many times 20 will 
				//fit into the tender amount leftover without having to call Math.floor()
				counter = (int) (tender / 20);
				change = counter + " twenty dollar bill";				
				plural();
				addComma();
				tender = tender % 20;
			}
			
			if (tender / 10 > 1.00) {
				counter = (int) (tender / 10);
				change += counter + " ten dollar bill";
				plural();
				addComma();
			  	tender = tender % 10;
			}
			
			if (tender / 5 > 1.00) {
				counter = (int) (tender / 5);
				change += counter + " five dollar bill";
				plural();
				addComma();
				tender = tender % 5;
			}
			
			if (tender / 1 > 1.00) {
				counter = (int) (tender / 1);
				change += counter + " one dollar bill";
				plural();
				addComma();
				tender = tender % 1;
			}
			
			if (tender / .25 > 1.00) {
				counter = (int) (tender / .25);
				change += counter + " quarter"; 
				plural();
				addComma();
				tender = tender % .25;
			}
			
			if (tender / .10 > 1.00) {
				counter = (int) (tender / .10);
				change += counter + " dime"; 
				plural();
				addComma();
				tender = tender % .10;
			}
			
			if (tender / .05 > 1.00) {
				counter = (int) (tender / .05);
				change += counter + " nickel"; 
				plural();
				addComma();
				tender = tender % .05;
			}
			
			if (tender / .01 > 1.00) {
				counter = (int) (tender / .01);
				if (counter > 1) {
					change += counter + " pennies";
				}
				else {
					change += counter + " penny";
				}
			}
			change += ".";
			System.out.println(change);
	
		} //end else if
		
		else {
			System.out.println("That's not correct, please try again");
		}
	
	}
	
	
	public static void plural() {
		if (counter > 1) {
			change += "s";
		}
	}
	
	public static void addComma() {
		if (tender > 0.0099) {	
			//checking for values above .009 will ensure that all change is accounted for
			change += ", ";
			System.out.println(tender);
		}
	}
	
}
	

//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
