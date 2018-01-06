package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 字符串查询 {

	public static void main(String[] args) {
		String str="1";
		String regEx="\\w{2}";
		Pattern p=Pattern.compile(regEx);//编译正则表达式
		//Pattern pat=Pattern.compile(regEx,Pattern.CASE_INSENSITIVE);//忽略大小写
		Matcher m=p.matcher(str);
		boolean b=m.find();//查找字符串中是否有匹配正则表达式的字符/字符串
		System.out.println(b);
		
		/*Pattern p1=Pattern.compile("[0-9]{2,}");
		Matcher m1=p1.matcher("1");
		//boolean b1=m1.find();
		boolean b1=m1.matches();
		System.out.println(b1);*/
	}

}
