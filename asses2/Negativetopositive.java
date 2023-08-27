package asses2;

import java.util.Scanner;

public class Negativetopositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NegativeNumber;
		int PositiveNumber;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		{
			System.out.println("Enter a Negative Number");
			
			NegativeNumber = sc.nextInt();
			if(NegativeNumber<0);
			
			PositiveNumber = NegativeNumber*(-1);
			System.out.println("PsositiveNumber"+PositiveNumber);
		}
		
		
		
	
	}



	}


