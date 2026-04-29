package com.base;

import com.buisness_layer.Product_Buisness;

public class Product {
   private String productId;
   private String productType;
   private String productBrand;
   private double productPrice;
   private int productQuantity;
   public Product(String productType, String productBrand, double productPrice, int productQuantity) {
	super();
	this.productId = productId;
	this.productType = productType;
	this.productBrand = productBrand;
	this.productPrice = productPrice;
	this.productQuantity = productQuantity;
	this.productId=Product_Buisness.generateProductId(productType,productBrand);
   }
   @Override
   public String toString() {
	return "Product [productId=" + productId + ", productType=" + productType + ", productBrand=" + productBrand
			+ ", productPrice=" + productPrice + ", productQuantity=" + productQuantity + "]";
   }
   public String getProductBrand() {
	return productBrand;
   }
   public String getProductId() {
	return productId;
   }
   public String getProductType() {
	return productType;
   }
   public double getProductPrice() {
	return productPrice;
   }
   public int getProductQuantity() {
	return productQuantity;
   }
   public void setProductId(String productId) {
	this.productId = productId;
   }
   public void setProductType(String productType) {
	this.productType = productType;
   }
   public void setProductBrand(String productBrand) {
	this.productBrand = productBrand;
   }
   public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
   }
   public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
   }
   
   
   
   
}
