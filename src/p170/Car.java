package p170;

public class Car implements Vehicle,Interpassenger{
	private int power;
	private int person;
	Car(){
		power=5;
		person=3;
	}
	Car(int power,int person){
		this.power=power;
		this.person=person;
	}
	public void setPower(int power){
		this.power=power;
	}
	public void setPerson(int person){
		this.person=person;
	}
	public int getPower(){
		return power;
	}
	public int getPerson(){
		return person;
	}
	public void fire(){
		System.out.println("小客车发动机点火");
	}
	public void flameout(){
		System.out.println("小客车发动机熄火");
	}
	public void left(){
		System.out.println("小客车左转");
	}
	public void right(){
		System.out.println("小客车右转");
	}
	public int passenger(){
		if(person<0||person>7){
			System.out.print("小客车承载人数小于0或大于7");
			return 0;
		}else{
			return person;
		}
	}
	public String printInfo(){
		String str="小客车的功率为："+power;
		if(passenger()!=0){
			str+="，承载了"+person+"人。";
		}
		return str;
	}
}
