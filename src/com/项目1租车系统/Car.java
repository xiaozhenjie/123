package com.��Ŀ1�⳵ϵͳ;

public abstract class Car {
	protected String name;
	protected int money;
	Car(String name,int money){
		this.name=name;
		this.money=money;
	}
	public String getName(){
		return name;
	}
	public int getMoney(){
		return money;
	}
	public abstract void printInfo();
}
