package 枚举;

public class P187 {

	public static void main(String[] args) {
		MONTH m = MONTH.二月 ;
		MONTH[] month=MONTH.values();
		int day=0;
		System.out.println(m.ordinal());
		for(int year=2014;year<=2016;year++){
			for(int j=0;j<month.length;j++){
				switch(month[j]){
					case 一月: case 三月: case 五月: case 七月: case 八月: case 十月: case 十二月:
						day=31;
						break;
					case 四月: case 六月: case 九月: case 十一月:
						day=30;
						break;
					case 二月:
						if(year%4==0&&year%100!=0||year%400==0){
							day=29;
						}else{
							day=28;
						}
					break;
				}
				System.out.println(year+"年"+month[j]+"有"+day+"天");
			}
		}
	}

}
