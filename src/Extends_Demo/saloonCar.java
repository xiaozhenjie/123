package Extends_Demo;

public class saloonCar extends Car{
	private int oll = 2;
	public int getOll() {
		return oll;
	}
	public void setOll(int oll) {
		this.oll = oll;
	}
	public saloonCar(String color) {
		super(color);
	}
	@Override
	public void printInfo(){
		if(oll>0){
			super.printInfo();
		}else{
			System.out.println("����û����");
		}
	}
	public static void main(String[] args) {
		saloonCar sb = new saloonCar("��ɫ");
		sb.setColor("��ɫ");
		sb.setGear(1);
		sb.setOll(3);
		sb.printInfo();
	}

}
