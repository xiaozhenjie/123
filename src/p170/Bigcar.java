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
		System.out.println("��ͳ����������");
	}
	public void flameout(){
		System.out.println("��ͳ�������Ϩ��");
	}
	public void left(){
		System.out.println("��ͳ���ת");
	}
	public void right(){
		System.out.println("��ͳ���ת");
	}
	public int passenger(){
		if(person<0||person>50){
			System.out.print("��������Ϊ�����򳬹�50��");
			return 0;
		}else{
			return person;
		}
	}
	public String printInfo(){
		String str="��ͳ�����Ϊ��"+power;
		if(passenger()!=0){
			str+="��������"+person+"��";
		}
		return str;
	}
}
