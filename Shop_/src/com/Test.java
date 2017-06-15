package com;

import com.bill.BillingImpl;
import com.price.PriceMatrix;
import com.price.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };

		PriceMatrix price=new PriceMatrixImpl();
		
		
		/* ----------------------------*/
		
		BillingImpl bill = new BillingImpl();

		/*---------------------------------*/
		
	
		bill.setPrice(price); // Dependency to Dependent
		
		
		
		double total = bill.getCartTotal(cart1);

		System.out.println("Cart 1 Total is : " + total);
		
		
		total = bill.getCartTotal(cart2);

		System.out.println("Cart 2 Total is : " + total);
		
		
		
		
		
		
		
		

	}

}
