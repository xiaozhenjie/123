package p170;

public class Bigcar implements Vehicle,Interpassenger{
	private int power;
	private int person;
	Bigcar(){
		power=8;
		person=10;
	}
	Bigcar(int power,int person){
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
		System.out.println("大客车发动机点火");
	}
	public void flameout(){
		System.out.println("大客车发动机熄火");
	}
	public void left(){
		System.out.println("大客车左转");
	}
	public void right(){
		System.out.println("大客车右转");
	}
	public int passenger(){
		if(person<0||person>50){
			System.out.print("承载人数为负数或超过50人");
			return 0;
		}else{
			return person;
		}
	}
	public String printInfo(){
		String str="大客车功率为："+power;
		if(passenger()!=0){
			str+="，承载了"+person+"人";
		}
		return str;
	}
}
