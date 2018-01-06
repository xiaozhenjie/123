package p173;

public class P173 {

	public static void main(String[] args) {
		Teacherclass t1=new Teacherclass();
		t1.printInfo();
		t1.banZhuRen();
		System.out.println();
		Teacherclass t2=new Teacherclass("王五",'女');
		t2.printInfo();//输出名字和性别
		t2.course();//课程建设
		t2.banZhuRen();//班主任
		t2.giveLassons();//授课
		t2.scientific();//科研
		System.out.println();
		Cadreclass c1=new Cadreclass();
		c1.printInfo();
		c1.distribution();//分配教学任务
		System.out.println();
		Cadreclass c2=new Cadreclass("建文",'女',"干部教师");
		c2.printInfo();//输出名字、性别和职务
		c2.banZhuRen();//班主任
		c2.distribution();//分配教学任务
		c2.scientific();//科研
		c2.shiZiDuiWu();//师资建设
		c2.laboratory();//实验室建设
	}

}
