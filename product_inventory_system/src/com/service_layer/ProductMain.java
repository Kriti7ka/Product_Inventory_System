package com.service_layer;

import java.util.Scanner;

import com.base.Product;
import com.buisness_layer.Product_Buisness;
import com.validation_layer.DataValidation;

public class ProductMain {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Product_Buisness.animateString("     Welcome to JSP- Product Inventory System🙇🙏🏻‍️");
//		System.out.println("Welcome to JSP- Product Inventory System");
		System.out.println();
		System.out.println("Login to the Inventory");
		System.out.println("Enter the Mobile number: ");
		long mobileNUmber = sc.nextLong();
		
		if(DataValidation.validateMobileNumber(mobileNUmber))
		{
			int genOtp = Product_Buisness.generateOTP();
			System.out.println("Your OTP: "+genOtp);
			System.out.println("Enter the OTP: ");
			int enOtp = sc.nextInt();
			
			if(enOtp==genOtp) {
				System.out.println("Login Successful!!!🙂‍↔️");
			while(true) {
				System.out.println("Select Operation");
				System.out.println("1. Add Product");
				System.out.println("2. Remove Product");
				System.out.println("3. View Product");
				System.out.println("4. Search an Product");
				System.out.println("5. Update Product");
				System.out.println("6. Exit");
				int option = sc.nextInt();
				switch(option) {
				case 1: {
					Product_Buisness.addProduct();
				};break;
				case 2: {
				 Product_Buisness.removeProduct();
				};break;
				case 3: {
					Product_Buisness.viewAllProducts();
				};break;
				case 4: {
					 Product_Buisness.searchProduct();
				};break;
				case 5: {
					Product_Buisness.updateProduct();
				};break;
				case 6: {
					System.out.println("Thank you..🙇‍♀️☺️");
					System.exit(0);
				};break;
				
				default: {
					System.out.println("Invalid Option \n Try Again");
				};
				}
			}
			}
			else {
				System.out.print("Invalid OTP \n Try again after sometime😂");
			}
		}
		else
			System.out.print("Invalid Mobile Number");
	}

}
