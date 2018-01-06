package Extends_Demo_ÀÏÊó;

public class TestDemo {

	public static void main(String[] args) {
		WhiteMouse wm = new WhiteMouse();
		GrayMouse gm = new GrayMouse();
		FlowerMouse fm = new FlowerMouse();
		Master master = new Master();
		System.out.println("ÊÔ¾Æ¿ªÊ¼-----------------------");
		master.feeding(wm);
		master.feeding(gm);
		master.feeding(fm);
	}

}
