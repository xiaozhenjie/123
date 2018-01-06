package p173;

public class Teacherclass implements Commonteacher{//½ÌÊ¦Àà
	String name;
	char sex;
	Teacherclass(){
		name="ÕÅÈý";
		sex='ÄÐ';
	}
	Teacherclass(String name,char sex){
		this.name=name;
		this.sex=sex;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSex(char sex){
		this.sex=sex;
	}
	public String getName(){
		return name;
	}
	public char getSex(){
		return sex;
	}
	public void giveLassons(){
		System.out.println("ÊÚ¿ÎÁË°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡");
	}
	public void scientific(){
		System.out.println("¿ÆÑÐÁË°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡");
	}
	public void course() {
		System.out.println("¿Î³Ì½¨Éè°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡");
	}
	public void banZhuRen() {
		System.out.println("°àÖ÷ÈÎ°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡°¡");
	}
	public void printInfo(){
		System.out.println("Ãû×Ö£º"+name+"£¬ÐÔ±ð£º"+sex);
	}
}
