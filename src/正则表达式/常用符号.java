package ������ʽ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ���÷��� {

	public static void main(String[] args) {
		/*
		 *  \d [0-9]
		 *  \D [^0-9]
		 *  \w == [a-zA-Z0-9_] \w������Ӣ����ĸ�Լ�������ĸ ���磺������ĸa  ^[A-Za-z0-9\u4E00-\u9FA5-]{2,16}$
		 *  \W === [^a-zA-Z0-9_]
		 *  \s [\t\n\r\f]
		 *  \S [^\t\n\r\f]
		 *  
		 *  * 0�λ��γ���
		 *  + 1�λ��γ���
		 *  ? 0�λ�1�γ���
		 *  {n} ǡ��n��
		 *  {n,m} ��n�ε�m��
		 */
		String str="11";
		String regEx="[0-9]?";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(str);
		boolean b=m.find();
		System.out.println(b);
	}

}
