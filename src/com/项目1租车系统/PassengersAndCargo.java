package com.��Ŀ1�⳵ϵͳ;

public class PassengersAndCargo extends Car implements IPassengers,ICargo{
	private int passengers;
	private int cargo;
	PassengersAndCargo(String name,int money,int passengers,int cargo){
		super(name,money);
		this.passengers=passengers;
		this.cargo=cargo;
	}
	public int getCargo() {
		return cargo;
	}
	public int getPassengers() {
		return passengers;
	}
	public String printPassengers() {
		return "\t���ˣ�"+passengers+"��";
	}
	public String printCargo() {
		return "���ػ���"+cargo+"��";
	}
	public void printInfo(){
		System.out.println(name+"\t"+money+"Ԫ/��"+printPassengers()+printCargo());
	}

}
