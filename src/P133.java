import org.omg.CORBA.portable.ValueOutputStream;

class Cuboid{
	private float length;
	private float width;
	private float height;
	private static int countObjects=0;
	
	public Cuboid(){
		length=1;
		width=1;
		height=1;
		countObjects++;
	}

	public Cuboid(float length,float width,float height){
		setLength(length);
		setWidth(width);
		setHeight(height);
		countObjects++;
	}
	public void setLength(float length){
		this.length=length;
	}
	public void setWidth(float width){
		this.width=width;
	}
	public void setHeight(float height){
		this.height=height;
	}
	public static int getCountObjects(){
		return countObjects;
	}
	public float getLength(){
		return length;
	}
	public float getWidth(){
		return width;
	}
	public float getHeight(){
		return height;
	}
	public float getArea(){
		return 2*(width*length+length*height+width*height);
	}
	public float getVolume(){
		return width*height*length;
	}
}
public class P133 {

	public static void main(String[] args) {
		Cuboid c1=new Cuboid();
		printCuboid(c1);
		Cuboid c2=new Cuboid(122.2f,13.3f,13.3f);
		printCuboid(c2);
		Cuboid c3=new Cuboid(13.4f,21.5f,87.4f);
		printCuboid(c3);
		System.out.println("现有长方体对象创建"+c3.getCountObjects()+"个");
		
	}
	public static void printCuboid(Cuboid c){
		System.out.println("【"+c+"对象】  长："+c.getLength()+"，宽："+c.getWidth()+"，高："+c.getHeight()+"，表面积："+c.getArea()+"，体积："+c.getVolume());
	}


}
