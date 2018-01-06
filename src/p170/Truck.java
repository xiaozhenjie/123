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
		System.out.println("�������������");
	}
	public void flameout(){
		System.out.println("����������Ϩ��");
	}
	public void left(){
		System.out.println("������ת");
	}
	public void right(){
		System.out.println("������ת");
	}
	public double carry(){
		if(weight>55||weight<0){
			System.out.print("����Ϊ���������55��");
			return 0;
		}else{
			return weight;
		}
	}
	public String printInfo(){
		String str="��������Ϊ��"+power;
		if(carry()!=0){
			str+="������"+weight+"�ֻ���";
		}
		return str;
	}

}
