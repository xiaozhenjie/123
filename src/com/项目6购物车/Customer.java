package com.项目6购物车;

import java.util.HashMap;
import java.util.Map;

//顾客类
public class Customer {
	//用HashMap虚拟购物车
	private Map<String,Shop>buyCar = new HashMap<String,Shop>();
	public Map<String, Shop> getBuyCar() {
		return buyCar;
	}

	public void setBuyCar(Map<String, Shop> buyCar) {
		this.buyCar = buyCar;
	}

	public void put(Product p){
		String key = p.getpId();
		if(buyCar.containsKey(key)){
			Shop shop = buyCar.get(key);
			shop.add();
		}else{
			//如果不存在 ， 则新捆绑一个Shop对象 ，再放入购物车
			Shop newShop = new Shop(p);
			String newKey = p.getpId();
			buyCar.put(newKey, newShop);
		}
	}
	public void put(Product p,int number){
		String key = p.getpId();
		if(buyCar.containsKey(key)){
			Shop shop = buyCar.get(key);
			shop.add(number);
		}else{
			//如果不存在 ， 则新捆绑一个Shop对象 ，再放入购物车
			Shop newShop = new Shop(p);
			String newKey = p.getpId();
			buyCar.put(newKey, newShop);
		}
	}
	//顾客扔掉部分商品
	public void throwOut(Product p){
		String key = p.getpId();
		if(buyCar.containsKey(key)){
			Shop shop = buyCar.get(key);
			shop.reduce();
			if(shop.getNum()<=0){
				buyCar.remove(key);
			}
		}
	}
	public void throwOut(Product p,int number){
		String key = p.getpId();
		if(buyCar.containsKey(key)){
			Shop shop = buyCar.get(key);
			shop.reduce(number);
			if(shop.getNum()<=0){
				buyCar.remove(key);
			}
		}
	}
	public float totalMoney(){
		float money = 0.0f;
		//KeySet获得所有键值的集合 ， 返回类型为Set
		for(String key:buyCar.keySet()){
			Shop shop  = buyCar.get(key);
			money+=shop.subTotal();
		}
		return money;
	}
	public void list(){
		System.out.println("***********商品清单************");
		System.out.println("序号\t商品编号\t商品名称\t原售价\t折扣率\t现售价\t数量\t小计");
		int index = 1;
		for(String key:buyCar.keySet()){
			Shop shop = buyCar.get(key);
			Product p = shop.getProduct();
			System.out.println(" "+index+":\t"+p.getpId()+"\t"
					+p.getpName()+"\t"+p.getSalePrice()+"\t"+p.getDiscount()+"\t"
					+p.getDiscount()*p.getSalePrice()+"\t"
					+shop.getNum()+"\t"+shop.subTotal());
			index++;
		}
		System.out.println("*****************************");
		System.out.println("            总金额="+totalMoney());
	}
}
