package com.dipu;

public class creditCard {
	
	public static void main(String [] args)
	{
		String name = "Dipu saha";
		String cvv="100";
		
		//class validates the user credentials 
		verifyDetails obj = new verifyDetails(name,cvv);
		
		boolean statusOfName = obj.verifyName();	
		
		boolean statusOfCvv = obj.verifyCvv();
		
		System.out.println(statusOfName);
		System.out.println(statusOfCvv);	
	}
}