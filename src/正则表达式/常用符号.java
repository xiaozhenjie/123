package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 常用符号 {

	public static void main(String[] args) {
		/*
		 *  \d [0-9]
		 *  \D [^0-9]
		 *  \w == [a-zA-Z0-9_] \w包括了英文字母以及其他字母 列如：俄文字母a  ^[A-Za-z0-9\u4E00-\u9FA5-]{2,16}$
		 *  \W === [^a-zA-Z0-9_]
		 *  \s [\t\n\r\f]
		 *  \S [^\t\n\r\f]
		 *  
		 *  * 0次或多次出现
		 *  + 1次或多次出现
		 *  ? 0次或1次出现
		 *  {n} 恰好n次
		 *  {n,m} 从n次到m次
		 */
		String str="11";
		String regEx="[0-9]?";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(str);
		boolean b=m.find();
		System.out.println(b);
	}

}
