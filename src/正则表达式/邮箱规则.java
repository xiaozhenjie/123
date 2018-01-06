package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 邮箱规则 {

	public static void main(String[] args) {
		String str="478636061@qq.com";
		String regEx = "[a-zA-Z_]*[0-9]*@((\\w-*)+\\.){1,3}[a-zA-z\\-]+";
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(str);
		boolean rs = matcher.matches();
		System.out.println(rs);
	}

}
