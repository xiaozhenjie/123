import java.util.Scanner;
/*
 * zfc：字符串；
 * operator：运算符；
 * is：等号；
 * left：运算符左边单个；
 * sLeft：运算符左边总和；
 * right：运算符右边单个；
 * sRight：运算符右边总和；
 * result：总和；
 */
public class 计算器 {

	public static void main(String[] args) {
		String zfc;
		char operator,c,g,is;
		int i=1,left,l,right,r,x=1;
		double result=0,sLeft=0,sRight=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入表达式：");
		zfc=sc.next();
		operator=zfc.charAt(i);
	 while(operator!='+'&&operator!='-'&&operator!='*'&&operator!='/'){	
			i++;operator=zfc.charAt(i);	
		}
	    is=zfc.charAt(x);
	 while(is!='='){	
			x++;is=zfc.charAt(x);
		}
		for(left=0;left<i;left++){
			c=zfc.charAt(left);
			l=(int)(c-48);
			l*=(int) Math.pow(10, (i-left-1));	
			sLeft+=l;
		}
		for(right=i+1;right<x;right++){
			g=zfc.charAt(right);
			r=(int)(g-48);
			r*=(int) Math.pow(10, (x-right-1));
			sRight+=r;
		}
		switch(operator){
		case '+':
			result=sLeft+sRight;
			break;
        case '-':
        	result=sLeft-sRight;
			break;
        case '*':
        	result=sLeft*sRight;
	        break;
        case '/':
        	result=sLeft/sRight;
	       break;
		}
        System.out.println(sLeft+""+operator+""+sRight+"="+result);

	}

}
