package com.��Ŀ1�⳵ϵͳ;

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
		return "\t�ػ���"+cargo+"��";
	}
	public void printInfo(){
		System.out.println(name+"\t"+money+"Ԫ/��"+printCargo());
	}
}
