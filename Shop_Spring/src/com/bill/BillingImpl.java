package com.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.price.PriceMatrix;
import com.price.PriceMatrixImpl;

// Dependent
@Service("bill")
public class BillingImpl {

	/*
	 * Design Issues ---------------
	 * 
	 * 1. Too many Dependncy Object creations --> Per of app gets down why this
	 * issue? -------------- --> Creating a Depenendency obj in Depenedent class.
	 * Sol: Deont Creaate Dependency obk in Dependent
	 * 
	 * How to get Dependency obj? ---------------------------- --> Use JNDI --> JNDI
	 * loc is tightkky binded with Obj
	 * 
	 * Best Solution? ---------------- 1. Dont Craete, and Dont search. Insted Ask
	 * some one to inject it... (IOC) Injecting a Dependency to the Dependent obj is
	 * called DI
	 * 
	 * 
	 * 
	 * 
	 */

	@Autowired
	private PriceMatrix price;

	

	public double getCartTotal(String[] cart) {

		double total = 0.0;

		// PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);

		}

		return total;

	}

}
