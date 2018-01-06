package com.项目1租车系统;

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
		return "\t载人："+passengers+"人";
	}
	public String printCargo() {
		return "，载货："+cargo+"吨";
	}
	public void printInfo(){
		System.out.println(name+"\t"+money+"元/天"+printPassengers()+printCargo());
	}

}
