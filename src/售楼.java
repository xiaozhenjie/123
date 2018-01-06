import java.util.Arrays;

public class 售楼 {

	public static void main(String[] args) {
		double[] a={23,12,54,32,12,32,55,12,99};
		maxMoney1(a);

	}
	public static double maxMoney(double[] x){
		Arrays.sort(x);
		return x[x.length]-x[0];
	}

	public static void maxMoney1(double[] x){
		double max=0;
		int s1=0,s2=0,s3=0,s4=0;
		for(int i=0;i<x.length;i++){//第一次买楼
			for(int j=i;j<x.length;j++){//第一次卖楼
				for(int k=j;k<x.length;k++){//第二次买楼
					for(int l=k;l<x.length;l++){//第二次卖楼
						if((x[j]-x[i])+(x[l]-x[k])>max){
							max=(x[j]-x[i])+(x[l]-x[k]);
							s1=i+1;
							s2=j+1;
							s3=k+1;
							s4=l+1;
						}
					}
				}
			}
		}
		System.out.println("第一次购买是第"+s1+"天买，"+s2+"天卖，然后第"+s3+"天买，"+s4+"天卖获利"+max+"元");
	}

}
