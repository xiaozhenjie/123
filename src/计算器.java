import java.util.Scanner;
/*
 * zfc���ַ�����
 * operator���������
 * is���Ⱥţ�
 * left���������ߵ�����
 * sLeft�����������ܺͣ�
 * right��������ұߵ�����
 * sRight��������ұ��ܺͣ�
 * result���ܺͣ�
 */
public class ������ {

	public static void main(String[] args) {
		String zfc;
		char operator,c,g,is;
		int i=1,left,l,right,r,x=1;
		double result=0,sLeft=0,sRight=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("��������ʽ��");
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
