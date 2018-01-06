package com.项目6购物车;
//商品包装类 ，包括商品的信息和数量
public class Shop {
	private Product product;//商品信息
	private int num;//商品数量
	public Shop(){}
	public Shop(Product p){
		this.product=p;
		this.num=1;
	}
	public Shop(Product p,int num){
		this.product=p;
		this.num=num;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//添加商品
	public void add(){this.num++;}
	public void add(int number){
		this.num+=number;
	}
	//减少商品
	public void reduce(){this.num--;};
	public void reduce(int number){
		this.num-=number;
	}
	//当前捆绑的商品小计
	public float subTotal(){
		return product.getSalePrice()*product.getDiscount()*num;
	}
}
