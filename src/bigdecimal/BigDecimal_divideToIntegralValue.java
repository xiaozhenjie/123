package bigdecimal;

import java.math.BigDecimal;

public class BigDecimal_divideToIntegralValue {

	public static void main(String[] args) {
		BigDecimal a=new BigDecimal("1.23");//������
		BigDecimal b=new BigDecimal("0.21");
		System.out.println("a.divideToIntegralValue(b)="+a.divideToIntegralValue(b));
		//�������� ֱ�ӳ���� ��ȡ����
		System.out.println("a.divide(b,20,BigDecimal.ROUND_UP)="+a.divide(b,20,BigDecimal.ROUND_UP));
	}

}
