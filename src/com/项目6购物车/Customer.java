package com.��Ŀ6���ﳵ;

import java.util.HashMap;
import java.util.Map;

//�˿���
public class Customer {
	//��HashMap���⹺�ﳵ
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
			//��������� �� ��������һ��Shop���� ���ٷ��빺�ﳵ
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
			//��������� �� ��������һ��Shop���� ���ٷ��빺�ﳵ
			Shop newShop = new Shop(p);
			String newKey = p.getpId();
			buyCar.put(newKey, newShop);
		}
	}
	//�˿��ӵ�������Ʒ
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
		//KeySet������м�ֵ�ļ��� �� ��������ΪSet
		for(String key:buyCar.keySet()){
			Shop shop  = buyCar.get(key);
			money+=shop.subTotal();
		}
		return money;
	}
	public void list(){
		System.out.println("***********��Ʒ�嵥************");
		System.out.println("���\t��Ʒ���\t��Ʒ����\tԭ�ۼ�\t�ۿ���\t���ۼ�\t����\tС��");
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
		System.out.println("            �ܽ��="+totalMoney());
	}
}
