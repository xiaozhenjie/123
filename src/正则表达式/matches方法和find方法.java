package ������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matches������find���� {

	public static void main(String[] args) {
		int count=0;
		String regEx="[0-9]{2}[a-z]{2}";
		String str="45kj11hd11hd3";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(str);
		boolean x=m.lookingAt();//���Դ�����ͷ��ʼ���������п�ʼƥ��
		System.out.println(x);
		while(m.find()){
			++count;
			System.out.println(m.groupCount());
			System.out.println(m.group());
		}
		System.out.println("����"+count+"��");

	}

}
