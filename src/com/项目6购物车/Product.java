package com.��Ŀ6���ﳵ;
//��Ʒ��Ϣ��
public class Product {
	private String pId;//��Ʒ���
	private String pName;//��Ʒ����
	private float salePrice;//��Ʒ���ۼ�
	private float discount = 1.0f;//��Ʒ�ۿ�
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
		return "��Ʒ��Ϣ��"+pId+"��"+pName+"��"+salePrice+"��"+discount;
	}
}
