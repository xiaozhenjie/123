package ������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �ַ�����ѯ {

	public static void main(String[] args) {
		String str="1";
		String regEx="\\w{2}";
		Pattern p=Pattern.compile(regEx);//����������ʽ
		//Pattern pat=Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);//���Դ�Сд
		Matcher m=p.matcher(str);
		boolean b=m.find();//�����ַ������Ƿ���ƥ��������ʽ���ַ�/�ַ���
		System.out.println(b);
		
		/*Pattern p1=Pattern.compile("[0-9]{2,}");
		Matcher m1=p1.matcher("1");
		//boolean b1=m1.find();
		boolean b1=m1.matches();
		System.out.println(b1);*/
	}

}
