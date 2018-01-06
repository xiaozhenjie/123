import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class 书作业P107 {
	public static void main(String[] args) throws IOException {
		int i,j,sum=0,ave,index;
		char z;
		String[] x={"学号","姓名","《高等数学》","《线性代数》","《java程序设计》","《大学英语》","平均成绩","名次"};
		String[][] a=new String[5][2];
		double[][] b=new double[5][4];
		double[] c=new double[5];
		double[] d=new double[5];
		double[] e=new double[5];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<b.length;i++){
			System.out.println("请输入第"+(i+1)+"个人的学号、姓名、数学、线性代数、java程序设计、大学英语成绩：");
			for(j=0;j<2;j++){
				System.out.println("第"+(j+1)+"次输入字符串");
				a[i][j]=sc.nextLine();
				System.out.println("接收到的值："+a[i][j]);
			}
			for(j=0;j<4;j++){
				System.out.println("第"+(j+1)+"次输入成绩");
				b[i][j]=sc.nextDouble();
			}
		}
		/*for(i=0;i<b.length;i++){
			sum=0;
			for(j=0;j<b[i].length;j++){
				sum+=b[i][j];
			}
			c[i]=sum/b[i].length;//保存排序前的个人平均成绩
			d[i]=sum/b[i].length;
		}
		Arrays.sort(d);
		for(i=0;i<c.length;i++){
			for(j=0;j<c.length;i++){
				if(c[i]<d[j]){
					e[i]=c.length-j+1;
				}
			}
		}
		for(i=0;i<x.length;i++){
			System.out.print(x[i]+"\t");
		}
		for(i=0;i<a.length;i++){
			for(j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			for(j=0;j<b[i].length;j++){
				System.out.print(b[i][j]+"\t");
			}
				System.out.print(c[i]+"\t");
				System.out.print(e[i]+"\t");
		}
*/
	}

}
