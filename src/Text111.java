import javax.swing.*;
import java.lang.NumberFormatException;

public class Text111 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i, a, b=0, suma, sumb=0;
		for (a = 6; a <= 10000; a++) {
			suma = 0;//因子和初始为0
			sumb = 0;//因子和初始为0
			//计算a的因子和
			for (i = 1; i < a; i++){
				if (a % i == 0)
					suma = suma + i;
			}
			//计算a的因子和的因子和
			for (i = 1; i < suma; i++){
				if (suma % i == 0)
					sumb = sumb + i;
			}
			//判断a是否等于a的因子和的因子和
			if(suma>a&&a==sumb){
				System.out.println(a + "   "+suma);//输出a和a的因子和
			}
		}
		System.out.println(System.currentTimeMillis()-start);

	}

}
