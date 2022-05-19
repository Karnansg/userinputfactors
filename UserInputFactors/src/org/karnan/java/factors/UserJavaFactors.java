package org.karnan.java.factors;

import java.util.Scanner;

public class UserJavaFactors {

	public static void main(String[] args) {
		
		boolean firstFactor = false;
		boolean secondFactor = false;
		
		UserJavaFactors userJfactors = new UserJavaFactors();		
		int[]values = userJfactors.userValues();
		int sNum = values[0];
		int bNum = values[1];
		int foNum1 = values[2];
		int foNum2 = values[3];				
		
		for(int i=sNum; i<=bNum; i++)
		{
			
			  firstFactor = userJfactors.factorOfNum1(i,foNum1); secondFactor =
			  userJfactors.factorOfNum2(i,foNum2);			  	  
			  
			  if((firstFactor==true) & (secondFactor==true)) {
				  System.out.println("" + i + " is a factor of " + foNum1);				
			  }

			  else if ((firstFactor==false) & (secondFactor ==true)) {
				  System.out.println("" + i + " is a factor of " + foNum2);				
			  }	

			  else if ((firstFactor==true) & (secondFactor ==false)) {
				  System.out.println("" + i + " is a factor of " + foNum1);				
			  }
			  else {
				  System.out.println(i);				
			  }				
		}		
	}
	
	//method to ask user to input the values.
	public int[]userValues(){
         int[]values = new int[4];
         Scanner sc = new Scanner(System.in);
 		 int sNum;
 		 int bNum;
 		 int fofNum1;
 		 int fofNum2;
 		 System.out.println("Enter the range of values, a small number followed by a bigger number: ");
 		 System.out.println("Enter the small number: ");		
 		 sNum = sc.nextInt();
 		 System.out.println("Enter the big number: ");		
 		 bNum = sc.nextInt();	
 		 System.out.println("Enter the 1st number in the range for which you want to find the factor: ");
 		 fofNum1 = sc.nextInt();
 		 System.out.println("Enter the 2nd number in the range for which you want to find the factor: ");
 		 fofNum2 = sc.nextInt(); 		 
 		 
 		 values[0] = sNum;
 		 values[1] = bNum;
 		 values[2] = fofNum1;
 		 values[3] = fofNum2;	  		
 		 
		 return values;
	}
	

	public boolean factorOfNum1(int num,int foNum1) {
		int result = num%foNum1;
		boolean factor = false;
		if(result!=0) {
			factor=false;
		}

		else if (result==0) {
			factor=true;
		}

		return factor;
	}

	public boolean factorOfNum2(int num, int foNum2) {
		int result = num%foNum2;
		boolean factor = false;
		if(result!=0) {
			factor=false;
		}

		else if (result==0) {
			factor=true;
		}		
		return factor;
	}	
}