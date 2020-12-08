package Java01_UpClass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请按顺序输入要查询学生的序号、名字、性别：");
		while(true){
			int aid = s.nextInt();
			String aname = s.next();
			String asex = s.next();
			
			//创建点到人对象
			CallRoll xiaoyu = new CallRoll();
			//创建被点到对象
			Students student = new Students(aid , aname , asex);
			
			//点到人调用点到方法
			xiaoyu.call(student);
			System.out.println("-------------------------------");
		}
		
	/*	int aid = s.nextInt();
		String aname = s.next();
		String asex = s.next();

		CallRoll xiaoyu = new CallRoll();

		Students student12 = new Students(aid , aname , asex);
	*/	
		//Students student29 = new Students(29, "小徐", "男");

		// student12.setId(12);
		// student12.setSex("男");
	/*	xiaoyu.call(student12);
		xiaoyu.answer(student12);
		xiaoyu.call(student29);
		xiaoyu.answer(student29);
	*/
	}

}
