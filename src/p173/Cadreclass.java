package p173;

public class Cadreclass extends Teacherclass implements Cadre{//干部教室类
	String post;
	Cadreclass(){
		super();
		post="";
	}
	Cadreclass(String name,char sex,String post){
		super(name,sex);
		this.post=post;
	}
	public void setPost(String post){
		this.post=post;
	}
	public String getPost(){
		return post;
	}
	public void distribution() {
		System.out.println("分配教学任务啊啊啊啊啊啊啊");
	}

	public void shiZiDuiWu() {
		System.out.println("师资队伍建设啊啊啊啊啊啊啊啊");
	}
	public void laboratory() {
		System.out.println("实验室建设啊啊啊啊啊啊啊啊啊啊");
	}
	public void printInfo(){
		System.out.println("名字："+name+"，性别："+sex+"，职务："+post);
	}

}
