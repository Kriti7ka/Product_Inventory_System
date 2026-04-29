package com.buisness_layer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import com.base.Product;

public class Product_Buisness {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Product> productList = new ArrayList<>();
	
	
	public static int generateOTP() {
		Random r = new Random();
		int genOTP = r.nextInt(99999);
		return genOTP;
	}

	public static void addProduct() {
		System.out.println("Enter the Product Type: ");
		String productType = sc.next();
		System.out.println("Enter the Product Brand: ");
		String productBrand=sc.next();
		System.out.println("Enter the Product Price: ");
		double productPrice = sc.nextDouble();
		System.out.println("Enter the product quantity: ");
		int productQuantity = sc.nextInt();
		Product p = new Product(productType,productBrand,productPrice,productQuantity);
		productList.add(p);
		System.out.println(p);
		System.out.println("Product added successfully!!🛒🛒");
	}
	
	
	public static String generateProductId(String productType, String productBrand) {
		String productId = ""+productType.substring(0,3);
		Random r = new Random();
		productId = productId + r.nextInt(999)+ productBrand.substring(productBrand.length()-3);
		return productId.toUpperCase();
	}
	public static void viewAllProducts() {
		if(productList.isEmpty()) {
			System.out.println("Operation can't be performed. \n List is Empty😛");
		}
		else {
			System.out.printf("\u001B[34m"+"-----------------------------------------------------------------"+"\u001B[0m");
			System.out.printf("\u001B[30m"+"%-15s | %-15s | %-15s | %-15s | %-13s |%n","Product ID ","Product Type","Product Brand","Product Price","Product Quantity"+"\u001B[0m");
			System.out.printf("\u001B[34m"+"-----------------------------------------------------------------"+"\u001B[0m");
			for(Product p : productList) {
				System.out.printf("\u001B[31m"+"%-15d | %-15s | %-15s | %-15s | %-13s |%n",p.getProductId(),p.getProductType(),p.getProductBrand(),p.getProductPrice(),p.getProductQuantity()+"\u001B[0m");
				System.out.printf("\u001B[34m"+"-----------------------------------------------------------------"+"\u001B[0m");
				System.out.println(p);
			}
		}
	}
	public static void removeProduct() {
		if(productList.isEmpty()) {
			System.out.println("List is empty...\n Product can't be able to remove....");
		}
		else {
			System.out.println("Enter the Product Id: ");
			String productId = sc.next();
			Iterator<Product> itr = productList.iterator();
			Product product = null;
			while(itr.hasNext()) {
				Product cp = itr.next();
				if(cp.getProductId().equalsIgnoreCase(productId)) {
					product=cp;  
					itr.remove();
				}
			}
			if(product==null)
				System.out.println("Invalid Product Id.....😂");
			else
				System.out.println(product+"\n Removed Succesfully.... ");
		}
	}
	
	public static void searchProduct() {
		if(productList.isEmpty()) {
			System.out.println("List is Empty...");
		}
		else {
			System.out.println("Enter the Product Id: ");
			String productId = sc.next();
			Product product = null;
			for(Product cp : productList) {
				if(cp.getProductId().equalsIgnoreCase(productId))
					product= cp;
			}
			if(product==null) {
				System.out.println("\u001B[31m"+"Invalid Product Id.....😂");
			    System.out.println("\u001B[0m");
			}
			else
				System.out.println(product);
		}
	}
	
	public static Product updateProduct() {
		if(productList.isEmpty()) {
			System.out.println("List can't be Updated....");
		}
		else {
			System.out.println("Enter the Product Id: ");
			String productId = sc.next();
			Product product = null;
			for(Product p: productList) {
				if(p.getProductId()==productId) {
					System.out.println("Enter the Updated Price");
					double updatedPrice = sc.nextDouble();
					p.setProductPrice(updatedPrice);
					return p;
				}
			}
		}
		return null;
		
	}
	public static void animateString(String s) throws InterruptedException 
	{	
		for(int i=0;i<s.length();i++) {
//			System.out.print("\u001B[1m"+"\u001B[40m"+"\u001B[35m"+s.charAt(i));
			System.out.print("\u001B[1;35m"+s.charAt(i));
			Thread.sleep(150);
		}
		System.out.println("\u001B[0m");
	}
	
}
