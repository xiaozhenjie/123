import java.util.Arrays;

public class ��¥ {

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
		for(int i=0;i<x.length;i++){//��һ����¥
			for(int j=i;j<x.length;j++){//��һ����¥
				for(int k=j;k<x.length;k++){//�ڶ�����¥
					for(int l=k;l<x.length;l++){//�ڶ�����¥
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
		System.out.println("��һ�ι����ǵ�"+s1+"����"+s2+"������Ȼ���"+s3+"����"+s4+"��������"+max+"Ԫ");
	}

}
