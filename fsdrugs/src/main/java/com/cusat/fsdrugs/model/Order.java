package com.cusat.fsdrugs.model;

public class Order {
	private String orderId;
	private String productId;
	private int totalItem;
	private String userId;
	private String sellerId;
	private String soldDate;
	private float totalPrice;
	private String orderDate;
	private String cancelDate;
	private String soldProduct;
	private String status;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public int getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getSoldDate() {
		return soldDate;
	}
	public void setSoldDate(String soldDate) {
		this.soldDate = soldDate;
	}
	
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	public String getCancelDate() {
		return cancelDate;
	}
	public void setCancelDate(String cancelDate) {
		this.cancelDate = cancelDate;
	}
	
	public String getSoldProduct() {
		return soldProduct;
	}
	public void setSoldProduct(String soldProduct) {
		this.soldProduct = soldProduct;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
