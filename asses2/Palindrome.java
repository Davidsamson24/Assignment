package asses2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0,temp;
		int n =63636;
		temp =n;
		while(n>0) {
			i=n%10;
			sum=(sum*10)+i;
			n=n/10;	
		}
		if(temp==sum)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome");

	}

	}


