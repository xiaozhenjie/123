import javax.swing.*;
import java.lang.NumberFormatException;

public class Text111 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int i, a, b=0, suma, sumb=0;
		for (a = 6; a <= 10000; a++) {
			suma = 0;//���Ӻͳ�ʼΪ0
			sumb = 0;//���Ӻͳ�ʼΪ0
			//����a�����Ӻ�
			for (i = 1; i < a; i++){
				if (a % i == 0)
					suma = suma + i;
			}
			//����a�����Ӻ͵����Ӻ�
			for (i = 1; i < suma; i++){
				if (suma % i == 0)
					sumb = sumb + i;
			}
			//�ж�a�Ƿ����a�����Ӻ͵����Ӻ�
			if(suma>a&&a==sumb){
				System.out.println(a + "   "+suma);//���a��a�����Ӻ�
			}
		}
		System.out.println(System.currentTimeMillis()-start);

	}

}
