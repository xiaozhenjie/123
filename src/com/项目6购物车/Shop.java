package com.��Ŀ6���ﳵ;
//��Ʒ��װ�� ��������Ʒ����Ϣ������
public class Shop {
	private Product product;//��Ʒ��Ϣ
	private int num;//��Ʒ����
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
	//�����Ʒ
	public void add(){this.num++;}
	public void add(int number){
		this.num+=number;
	}
	//������Ʒ
	public void reduce(){this.num--;};
	public void reduce(int number){
		this.num-=number;
	}
	//��ǰ�������ƷС��
	public float subTotal(){
		return product.getSalePrice()*product.getDiscount()*num;
	}
}
