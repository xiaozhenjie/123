package com.��Ŀ1�⳵ϵͳ;

public class CarryPassengers extends Car implements IPassengers{
	private int passengers;
	CarryPassengers(String name,int money,int passengers){
		super(name,money);
		this.passengers=passengers;
	}
	public int getPassengers() {
		return passengers;
	}
	public String printPassengers() {
		return "\t���ˣ�"+passengers+"��";
	}
	public void printInfo(){
		System.out.println(name+"\t"+money+"Ԫ/�� "+printPassengers());
	}

}
