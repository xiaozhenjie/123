package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matches方法和find方法 {

	public static void main(String[] args) {
		int count=0;
		String regEx="[0-9]{2}[a-z]{2}";
		String str="45kj11hd11hd3";
		Pattern p=Pattern.compile(regEx);
		Matcher m=p.matcher(str);
		boolean x=m.lookingAt();//尝试从区域开头开始的输入序列开始匹配
		System.out.println(x);
		while(m.find()){
			++count;
			System.out.println(m.groupCount());
			System.out.println(m.group());
		}
		System.out.println("共有"+count+"个");

	}

}
