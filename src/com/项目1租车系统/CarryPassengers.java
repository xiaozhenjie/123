package com.项目1租车系统;

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
		return "\t载人："+passengers+"人";
	}
	public void printInfo(){
		System.out.println(name+"\t"+money+"元/天 "+printPassengers());
	}

}
