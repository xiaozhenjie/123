enum MONTH{
	一月,二月,三月,四月,五月,六月,七月,八月,九月,十月,十一月,十二月;
}
public class P186 {

	public static void main(String[] args) {
		MONTH month1=MONTH.七月,month2=MONTH.一月;
		MONTH month3=MONTH.七月,month4=MONTH.二月;
		System.out.println("month1="+month1);
		System.out.println("month2="+month2);
		System.out.println("month3="+month3);
		System.out.println("month4="+month4);
		if(month1==month2){
			System.out.println("month1==month2");
			System.out.println(month1+"=="+month2);
		}else{
			System.out.println("month1!=month2");
			System.out.println(month1+"!="+month2);
		}
		if(month1==month3){
			System.out.println("month1==month3");
			System.out.println(month1+"=="+month3);
		}else{
			System.out.println("month1!=month3");
			System.out.println(month1+"!="+month3);
		}
		MONTH[] month=MONTH.values();
		for(int i=0;i<month.length;i++){
			switch(month[i]){
				case 三月:   case 四月:  case 五月:
				System.out.println(month[i]+"属于春季");
				break;
				case 六月:   case 七月:  case 八月:
				System.out.println(month[i]+"属于夏季");
				break;
				case 九月:   case 十月:  case 十一月:
				System.out.println(month[i]+"属于秋季");
				break;
				case 十二月:   case 一月:  case 二月:
				System.out.println(month[i]+"属于冬季");
				break;
			}
		}
	}

}
