package com.项目6购物车;
//商品信息类
public class Product {
	private String pId;//商品编号
	private String pName;//商品名称
	private float salePrice;//商品零售价
	private float discount = 1.0f;//商品折扣
	public Product(){}
	public Product(String pId,String pName,float salePrice,float discount){
		this.pId=pId;
		this.pName=pName;
		this.salePrice=salePrice;
		this.discount=discount;
	}
	public String getpId() {
		return pId;
	}
	public void setpId(String pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(float salePrice) {
		this.salePrice = salePrice;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String toString(){
		return "商品信息："+pId+"，"+pName+"，"+salePrice+"，"+discount;
	}
}
