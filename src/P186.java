enum MONTH{
	һ��,����,����,����,����,����,����,����,����,ʮ��,ʮһ��,ʮ����;
}
public class P186 {

	public static void main(String[] args) {
		MONTH month1=MONTH.����,month2=MONTH.һ��;
		MONTH month3=MONTH.����,month4=MONTH.����;
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
				case ����:   case ����:  case ����:
				System.out.println(month[i]+"���ڴ���");
				break;
				case ����:   case ����:  case ����:
				System.out.println(month[i]+"�����ļ�");
				break;
				case ����:   case ʮ��:  case ʮһ��:
				System.out.println(month[i]+"�����＾");
				break;
				case ʮ����:   case һ��:  case ����:
				System.out.println(month[i]+"���ڶ���");
				break;
			}
		}
	}

}
