package com.泛型与集合;
class NoGen_Calculate{
	private Object obj;
	public NoGen_Calculate(Object obj){
		this.obj=obj;
	}
	public void setObj(Object obj){
		this.obj=obj;
	}
	public Object getObj(){
		return obj;
	}
	public void showType(){
		System.out.println("obj的实际类型是："+obj.getClass().getName());
	}
}
class Gen_Calculate<T>{
	private T obj;
	public Gen_Calculate(T obj){
		this.obj=obj;
	}
	public void setObj(T obj){
		this.obj=obj;
	}
	public T getObj(){
		return obj;
	}
	public void showType(){
		System.out.println("obj的实际类型是："+obj.getClass().getName());
	}
}
public class P213 {

	public static void main(String[] args) {
		NoGen_Calculate doubleObj = new NoGen_Calculate(new Double(23.2));
		double d =(Double) doubleObj.getObj();
		doubleObj.showType();
		NoGen_Calculate integerObj = new NoGen_Calculate(new Integer(49));
		int i = (Integer) integerObj.getObj();
		integerObj.showType();
		NoGen_Calculate floatObj = new NoGen_Calculate(new Float(21.345f));
		float f =(Float) floatObj.getObj();
		floatObj.showType();
		Gen_Calculate<Double> doubleObj2 = new Gen_Calculate<Double>(21.3);
		double d2=doubleObj2.getObj();
		doubleObj2.showType();
		Gen_Calculate<Integer> integerObj2 = new Gen_Calculate<Integer>(21);
		int i2=integerObj2.getObj();
		integerObj2.showType();
		Gen_Calculate<Float> floatObj2 = new Gen_Calculate<Float>(32.1f);
		float f2=floatObj2.getObj();
		floatObj2.showType();
	}

}
