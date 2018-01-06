class Yuangong{
	int id=0;
	String name="";
	String sex="";
	int age=0;
	float wages=0.0f;//工资
	float award=0.0f;//奖金
	float takehome=0.0f;//实发工资

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
			System.out.print("工号：未知\t");
		}else{
			System.out.print("工号："+id+"\t");
		}
		if(name.equals("")){
			System.out.print("姓名：未知\t");
		}else{
			System.out.print("姓名："+name+" \t");
		}
		if(sex.equals("")){
			System.out.print("性别：未知\t");
		}else{
			System.out.print("性别："+sex+" \t");
		}
		if(age==0){
			System.out.print("年龄：未知\t");
		}else{
			System.out.print("年龄："+age+" \t");
		}
		if(wages==0){
			System.out.print("工资：未知\t");
		}else{
			System.out.print("工资："+wages+"\t");
		}
		if(award==0){
			System.out.print("奖金：未知\t");
		}else{
			System.out.print("奖金："+award+"\t");
		}
		if(takehome==0||award==0||wages==0){
			System.out.print("实发工资：未知");
		}else{
			System.out.print("实发工资："+takehome);
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
		Yuangong y3=new Yuangong(16215,"张三");
		y3.printYuanGong();
		Yuangong y4=new Yuangong(16203,"李四","男");
		y4.printYuanGong();
		Yuangong y5=new Yuangong(16207,"王五","女",18);
		y5.printYuanGong();
		Yuangong y6=new Yuangong(17209,"小明","男",19,1234);
		y6.printYuanGong();
		Yuangong y7=new Yuangong(23124,"小红","女",21,3424,1244);
		y7.printYuanGong();

		
	}

}
