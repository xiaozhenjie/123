import java.io.IOException;

public class if��switch���� {

	public static void main(String[] args) throws IOException  {
		char x,y;
		
		do{
		System.out.println("������");
		System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println("���������ѯ����䣺");
        x=(char)System.in.read();
          do{
        	  y=(char)System.in.read();
          }while(y!='\n');
        System.out.println("\n");
		}while(x<'1'|x>'2');
        switch(x){
        case '1':
        	System.out.println("The if:\n");
        	System.out.println("if(condition) statement");
        	System.out.println("else statement");
        	break;
        case '2':
        	System.out.println("The switch:\n");
        	System.out.println("switch(expression){");
        	System.out.println(" case constant:");
        	System.out.println("   statement sequence");
        	System.out.println("   beack;");
        	System.out.println("  // ...");
        	System.out.println("}");
        	break;
        default:
        	System.out.println("Selection not found");
        	
	}

}
}