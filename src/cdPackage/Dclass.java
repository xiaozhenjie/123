package cdPackage;
import abPackage.Aclass;
public class Dclass extends Aclass{

	public static void main(String[] args) {
		Aclass a1=new Aclass();
		a1.pub=2;
		System.out.println(a1.pub);
		Dclass d1=new Dclass();
		d1.pro=1;
		d1.pub=2;
		System.out.println(d1.pro+"   "+d1.pub+"  "+a1.pub);
	}

}
