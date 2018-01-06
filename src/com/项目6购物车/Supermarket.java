package com.项目6购物车;

import java.util.ArrayList;
import java.util.List;
//超市类 ，用于构建一个虚拟的商品仓库
public class Supermarket {
	public static List<Product>products=new ArrayList<Product>();
	//静态初始化商品信息
	static{
		products.add(new Product("PH1001","中华牙膏",20.0f,0.8f));
		products.add(new Product("XH2345","农夫山泉",2.0f,1f));
		products.add(new Product("BM2022","碧螺春茶",108.0f,1f));
		products.add(new Product("PH3021","黑人牙膏",20.0f,0.9f));
		products.add(new Product("XH7001","红茶饮料",2.5f,1f));
	}
}
