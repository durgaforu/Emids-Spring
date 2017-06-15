package com.price;

import org.springframework.stereotype.Repository;

// Dependency
@Repository("priceMatrixDao")
public class PriceMatrixImpl implements PriceMatrix {

	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrix Object is Created..");
	}


	@Override
	public double getItemPrice(String itemCode) {
		// Code to connect to DB and fetch itemPrice

		return 100.00;
	}

}
