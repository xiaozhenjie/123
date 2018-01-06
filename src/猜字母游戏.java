import java.io.IOException;

public class 猜字母游戏 {

	public static void main(String[] args) throws IOException {
		char x,y='k',z;
		System.out.println("这里有a到z中的一个字母");
		System.out.println("你能猜中它吗？");
		do{
			x = (char)System.in.read();
		
			do{
				z=(char)System.in.read();
			}while(z!='\n');
			
			if(x==y){
				System.out.println("恭喜你，猜中了！");
			}else{
				System.out.println("\n很遗憾，没猜中！");
				if(x>y){
					System.out.println("字母太大了");
				}else {
					System.out.println("字母太小了");
				}
				System.out.println("再来一次:");
			}
		}while(x!=y);
	}

}
