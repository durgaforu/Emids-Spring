package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bill.BillingImpl;
import com.price.PriceMatrix;
import com.price.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		String[] cart1 = { "P001", "P002", "P003" };
		String[] cart2 = { "P001", "P002" };

		BillingImpl bill = ac.getBean("bill", BillingImpl.class);

		double tot = bill.getCartTotal(cart1);

		System.out.println("--- Cart 1 Total: " + tot);
		tot = bill.getCartTotal(cart2);

		System.out.println("--- Cart 2 Total: " + tot);

	}

}
