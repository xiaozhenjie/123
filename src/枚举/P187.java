package ö��;

public class P187 {

	public static void main(String[] args) {
		MONTH m = MONTH.���� ;
		MONTH[] month=MONTH.values();
		int day=0;
		System.out.println(m.ordinal());
		for(int year=2014;year<=2016;year++){
			for(int j=0;j<month.length;j++){
				switch(month[j]){
					case һ��: case ����: case ����: case ����: case ����: case ʮ��: case ʮ����:
						day=31;
						break;
					case ����: case ����: case ����: case ʮһ��:
						day=30;
						break;
					case ����:
						if(year%4==0&&year%100!=0||year%400==0){
							day=29;
						}else{
							day=28;
						}
					break;
				}
				System.out.println(year+"��"+month[j]+"��"+day+"��");
			}
		}
	}

}
