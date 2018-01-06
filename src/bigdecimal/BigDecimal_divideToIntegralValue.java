package bigdecimal;

import java.math.BigDecimal;

public class BigDecimal_divideToIntegralValue {

	public static void main(String[] args) {
		BigDecimal a=new BigDecimal("1.23");//整数商
		BigDecimal b=new BigDecimal("0.21");
		System.out.println("a.divideToIntegralValue(b)="+a.divideToIntegralValue(b));
		//除法运算 直接出结果 不取整数
		System.out.println("a.divide(b,20,BigDecimal.ROUND_UP)="+a.divide(b,20,BigDecimal.ROUND_UP));
	}

}
