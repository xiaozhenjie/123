package p170;

public class Truck implements Vehicle,Intercarry{
	private int power;
	private double weight;
	Truck(){
		power=10;
		weight=40;
	}
	Truck(int power,double weight){
		this.power=power;
		this.weight=weight;
	}
	public void setPower(int power){
		this.power=power;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
	public int getPower(){
		return power;
	}
	public double getWeight(){
		return weight;
	}
	public void fire(){
		System.out.println("卡车发动机点火");
	}
	public void flameout(){
		System.out.println("卡车发动机熄火");
	}
	public void left(){
		System.out.println("卡车左转");
	}
	public void right(){
		System.out.println("卡车右转");
	}
	public double carry(){
		if(weight>55||weight<0){
			System.out.print("载重为负数或大于55吨");
			return 0;
		}else{
			return weight;
		}
	}
	public String printInfo(){
		String str="卡车功率为："+power;
		if(carry()!=0){
			str+="，载了"+weight+"吨货物";
		}
		return str;
	}

}
