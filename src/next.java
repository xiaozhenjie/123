import javax.swing.JOptionPane;

public class next {

	public static void main(String[] args) {
		double e,f,g,h,l,L,s,S;
	String a=JOptionPane.showInputDialog(null,"请输入人民广场的长：","人民广场",JOptionPane.QUESTION_MESSAGE);
	String b=JOptionPane.showInputDialog(null,"请输入人民广场的宽：","人民广场",JOptionPane.QUESTION_MESSAGE);
	String c=JOptionPane.showInputDialog(null,"请输入锦程绿茵广场的长：","锦程绿茵广场",JOptionPane.QUESTION_MESSAGE);
	String d=JOptionPane.showInputDialog(null,"请输入锦程绿茵广场的宽：","锦程绿茵广场",JOptionPane.QUESTION_MESSAGE);
	e=Double.parseDouble(a);
	f=Double.parseDouble(b);
	g=Double.parseDouble(c);
	h=Double.parseDouble(d);
	l=(e+f)*2;
	s=e*f;
	L=(g+h)*2;
	S=g*h;
	JOptionPane.showMessageDialog(null, "人民广场的周长为："+l+"\n人民广场的面积为："+s);
	JOptionPane.showMessageDialog(null, "锦程绿茵广场的周长为："+L+"\n锦程绿茵广场的面积为："+S);
		
		
	
	}

	

}
