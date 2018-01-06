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
		System.out.println("С�ͳ����������");
	}
	public void flameout(){
		System.out.println("С�ͳ�������Ϩ��");
	}
	public void left(){
		System.out.println("С�ͳ���ת");
	}
	public void right(){
		System.out.println("С�ͳ���ת");
	}
	public int passenger(){
		if(person<0||person>7){
			System.out.print("С�ͳ���������С��0�����7");
			return 0;
		}else{
			return person;
		}
	}
	public String printInfo(){
		String str="С�ͳ��Ĺ���Ϊ��"+power;
		if(passenger()!=0){
			str+="��������"+person+"�ˡ�";
		}
		return str;
	}
}
