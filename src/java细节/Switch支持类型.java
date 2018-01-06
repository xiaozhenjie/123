package java细节;

public class Switch支持类型 {

	public static void main(String[] args) {
		byte x=1;
		switch(x){//switch支持：byte short int char String;不支持long float double;
		case 1:
			System.out.println("byte");
			break;
			default:
				System.out.println("空");
		}
		short s=23;
		switch(s){
		case 23:
			System.out.println("short");
			break;
			default:
				System.out.println("空");
		}
		int i=23;
		switch(i){
		case 23:
			System.out.println("int");
			break;
			default:
				System.out.println("空");
		}
		char c='a';
		switch(c){
		case 'a':
			System.out.println("char");
			break;
			default:
				System.out.println("空");
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
				System.out.println("空");
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
