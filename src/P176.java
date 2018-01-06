
public class P176 {
	private String name;
	private int age;
	private char sex;
	P176(){
		name="张三";
		age=18;
		sex='男';
	}
	P176(String name,int age,char sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setSex(char sex){
		this.sex=sex;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public char getSex(){
		return sex;
	}
	public class Student{
		private long id;
		private boolean isBin;
		Student(){
			name="李四";
			age=20;
			sex='女';
			id=1234l;
			isBin=false;
		}
		Student(String name,int age,char sex,long id,boolean isBin){
			this.id=id;
			this.isBin=isBin;
		}
		public void setId(long id){
			this.id=id;
		}
		public void setIsBin(boolean isBin){
			this.isBin=isBin;
		}
		public long getId(){
			return id;
		}
		public boolean getIsBin(){
			return isBin;
		}
		public void printInfo(){
			System.out.println("【内部类方法】 名字是："+name+"，年龄："+age+"，性别："+sex+"，学号："+id+"，是否服兵役"+isBin);
		}
	}
	public void printInfo(){
		System.out.println("【外部类方法】名字："+name+"，年龄："+age+"，性别："+sex);
		System.out.println("【调用内部类方法】");
		Student s=new Student();
		s.printInfo();
	}
	
	public static void main(String[] args) {
		P176 p=new P176();
		p.printInfo();

	}

}
