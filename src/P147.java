class Oneclass{
	private int x;
	private int y;
	Oneclass(){
		x=10;
		y=20;
	}
	Oneclass(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void method(){
		System.out.println("Oneclass类中的method()方法被调用了");
		System.out.println("x="+getX()+",y="+getY());
		System.out.println("Oneclass类中的method()方法调用结束");
	}
}
class Twoclass extends Oneclass{
	private int x;
	private int y;
	private int z;
	private int h;
	Twoclass(){
		super();
		z=30;
		h=40;
	}
	Twoclass(int x,int y,int z,int h){
		super(x,y);
		this.z=z;
		this.h=h;
	}
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setZ(int z){
		this.z=z;
	}
	public void setH(int h){
		this.h=h;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getZ(){
		return z;
	}
	public int getH(){
		return h;
	}
	public void method(){
		System.out.println("Twoclass类中的method()被调用了");
		System.out.println("Twoclass类中x="+x+",y="+y+",z="+z+",h="+h);
		System.out.println("Oneclass类中的x="+super.getX()+"，y="+super.getY());
		System.out.println("Twoclass类中的method()调用结束");
	}
}
class Threeclass extends Twoclass{
	private int i;
	private int j;
	Threeclass(int i,int j){
		this.i=i;
		this.j=j;
	}
	public void setI(int i){
		this.i=i;
	}
	public void setJ(int j){
		this.j=j;
	}
	public int getI(){
		return i;
	}
	public int getJ(){
		return j;
	}
	public void method(){
		System.out.println("Threeclass类中的method()开始调用");
		System.out.println("Threeclass类中i="+i+"j="+j);
		System.out.println("Oneclass类中的x="+super.getX()+"y="+super.getY());
		System.out.println("Twoclass类中的z="+super.getZ()+"h="+super.getH());
		System.out.println("Threeclass类中的method()结束调用");
	}
}
public class P147 {

	public static void main(String[] args) {
		Twoclass t=new Twoclass();
		t.setX(50);
		t.setY(60);
		method0(t);
		method0(new Threeclass(100,110));
		Twoclass t1=new Twoclass(50,60,70,80);
		method0(t1);
	}
	public static void method0(Oneclass aObj){
		aObj.method();
	}

}
