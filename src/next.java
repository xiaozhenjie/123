import javax.swing.JOptionPane;

public class next {

	public static void main(String[] args) {
		double e,f,g,h,l,L,s,S;
	String a=JOptionPane.showInputDialog(null,"����������㳡�ĳ���","����㳡",JOptionPane.QUESTION_MESSAGE);
	String b=JOptionPane.showInputDialog(null,"����������㳡�Ŀ�","����㳡",JOptionPane.QUESTION_MESSAGE);
	String c=JOptionPane.showInputDialog(null,"�������������㳡�ĳ���","��������㳡",JOptionPane.QUESTION_MESSAGE);
	String d=JOptionPane.showInputDialog(null,"�������������㳡�Ŀ�","��������㳡",JOptionPane.QUESTION_MESSAGE);
	e=Double.parseDouble(a);
	f=Double.parseDouble(b);
	g=Double.parseDouble(c);
	h=Double.parseDouble(d);
	l=(e+f)*2;
	s=e*f;
	L=(g+h)*2;
	S=g*h;
	JOptionPane.showMessageDialog(null, "����㳡���ܳ�Ϊ��"+l+"\n����㳡�����Ϊ��"+s);
	JOptionPane.showMessageDialog(null, "��������㳡���ܳ�Ϊ��"+L+"\n��������㳡�����Ϊ��"+S);
		
		
	
	}

	

}
