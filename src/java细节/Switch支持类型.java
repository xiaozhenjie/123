package javaϸ��;

public class Switch֧������ {

	public static void main(String[] args) {
		byte x=1;
		switch(x){//switch֧�֣�byte short int char String;��֧��long float double;
		case 1:
			System.out.println("byte");
			break;
			default:
				System.out.println("��");
		}
		short s=23;
		switch(s){
		case 23:
			System.out.println("short");
			break;
			default:
				System.out.println("��");
		}
		int i=23;
		switch(i){
		case 23:
			System.out.println("int");
			break;
			default:
				System.out.println("��");
		}
		char c='a';
		switch(c){
		case 'a':
			System.out.println("char");
			break;
			default:
				System.out.println("��");
		}
		String y="23w";
		switch(y){
		case "2":
			System.out.println("2");
			break;
		case "23w":
			System.out.println("String");
			break;
			default:
				System.out.println("��");
		}
		/*
		long l=32l;
		switch(l){
		
		}
		float f=22.2f;
		switch(f){
		
		}
		double d=23.23d;
		switch(d){
		
		}
		*/
	}

}
