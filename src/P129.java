class Yuangong{
	int id=0;
	String name="";
	String sex="";
	int age=0;
	float wages=0.0f;//����
	float award=0.0f;//����
	float takehome=0.0f;//ʵ������

	Yuangong(){
		
	}
	Yuangong(int id){
		this.id=id;
		takehome=wages+award;
	}
	Yuangong(int id,String name){
		this.id=id;
		this.name=name;
		takehome=wages+award;
	}
	Yuangong(int id,String name,String sex){
		this.id=id;
		this.name=name;
		this.sex=sex;
		takehome=wages+award;
	}
	Yuangong(int id,String name,String sex,int age){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.age=age;
		takehome=wages+award;
	}
	Yuangong(int id,String name,String sex,int age,float wages){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.wages=wages;
		takehome=wages+award;
	}
	Yuangong(int id,String name,String sex,int age,float wages,float award){
		this.id=id;
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.wages=wages;
		this.award=award;
		takehome=wages+award;
	}
	void printYuanGong(){
		if(id==0){
			System.out.print("���ţ�δ֪\t");
		}else{
			System.out.print("���ţ�"+id+"\t");
		}
		if(name.equals("")){
			System.out.print("������δ֪\t");
		}else{
			System.out.print("������"+name+" \t");
		}
		if(sex.equals("")){
			System.out.print("�Ա�δ֪\t");
		}else{
			System.out.print("�Ա�"+sex+" \t");
		}
		if(age==0){
			System.out.print("���䣺δ֪\t");
		}else{
			System.out.print("���䣺"+age+" \t");
		}
		if(wages==0){
			System.out.print("���ʣ�δ֪\t");
		}else{
			System.out.print("���ʣ�"+wages+"\t");
		}
		if(award==0){
			System.out.print("����δ֪\t");
		}else{
			System.out.print("����"+award+"\t");
		}
		if(takehome==0||award==0||wages==0){
			System.out.print("ʵ�����ʣ�δ֪");
		}else{
			System.out.print("ʵ�����ʣ�"+takehome);
		}
		System.out.println();
	}
}
public class P129 {

	public static void main(String[] args) {

		Yuangong y1=new Yuangong();
		y1.printYuanGong();
		Yuangong y2=new Yuangong(16205);
		y2.printYuanGong();
		Yuangong y3=new Yuangong(16215,"����");
		y3.printYuanGong();
		Yuangong y4=new Yuangong(16203,"����","��");
		y4.printYuanGong();
		Yuangong y5=new Yuangong(16207,"����","Ů",18);
		y5.printYuanGong();
		Yuangong y6=new Yuangong(17209,"С��","��",19,1234);
		y6.printYuanGong();
		Yuangong y7=new Yuangong(23124,"С��","Ů",21,3424,1244);
		y7.printYuanGong();

		
	}

}
