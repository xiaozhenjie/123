package com.��Ŀ6���ﳵ;

import java.util.ArrayList;
import java.util.List;
//������ �����ڹ���һ���������Ʒ�ֿ�
public class Supermarket {
	public static List<Product>products=new ArrayList<Product>();
	//��̬��ʼ����Ʒ��Ϣ
	static{
		products.add(new Product("PH1001","�л�����",20.0f,0.8f));
		products.add(new Product("XH2345","ũ��ɽȪ",2.0f,1f));
		products.add(new Product("BM2022","���ݴ���",108.0f,1f));
		products.add(new Product("PH3021","��������",20.0f,0.9f));
		products.add(new Product("XH7001","�������",2.5f,1f));
	}
}
