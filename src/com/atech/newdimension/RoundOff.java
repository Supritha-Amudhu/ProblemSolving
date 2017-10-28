package com.atech.newdimension;

import java.util.Scanner;

public class RoundOff {

	public static void main(String[] args) {
		float number=0;
		int result = 0;
		RoundOff round = new RoundOff();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be rounded off:");
		number = scan.nextFloat();
		result = round.numberRoundOff(number);
		System.out.println(result + " is the rounded off result.");
	}
	public int numberRoundOff(float number){
		int resultNumber=0, modulo=0, balanceToBeAdded=0;
		if(number<100){
			resultNumber = 100;
		}
		else{
			if((modulo = (int) (number%100))<50){
				resultNumber = (int) (number-modulo);
			}
			else if((modulo = (int) (number%100))>=50){
				balanceToBeAdded = (100-modulo);
				resultNumber = (int) (number + balanceToBeAdded);
			}
			
		}
		return resultNumber;
	}

}
