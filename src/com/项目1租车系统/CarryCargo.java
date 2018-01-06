package com.项目1租车系统;

public class CarryCargo extends Car implements ICargo{
	private int cargo;
	CarryCargo(String name,int money,int cargo){
		super(name,money);
		this.cargo=cargo;
	}
	public int getCargo() {
		return cargo;
	}
	public String printCargo() {
		return "\t载货："+cargo+"吨";
	}
	public void printInfo(){
		System.out.println(name+"\t"+money+"元/天"+printCargo());
	}
}
