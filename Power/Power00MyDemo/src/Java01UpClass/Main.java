package Java01_UpClass;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�밴˳������Ҫ��ѯѧ������š����֡��Ա�");
		while(true){
			int aid = s.nextInt();
			String aname = s.next();
			String asex = s.next();
			
			//�����㵽�˶���
			CallRoll xiaoyu = new CallRoll();
			//�������㵽����
			Students student = new Students(aid , aname , asex);
			
			//�㵽�˵��õ㵽����
			xiaoyu.call(student);
			System.out.println("-------------------------------");
		}
		
	/*	int aid = s.nextInt();
		String aname = s.next();
		String asex = s.next();

		CallRoll xiaoyu = new CallRoll();

		Students student12 = new Students(aid , aname , asex);
	*/	
		//Students student29 = new Students(29, "С��", "��");

		// student12.setId(12);
		// student12.setSex("��");
	/*	xiaoyu.call(student12);
		xiaoyu.answer(student12);
		xiaoyu.call(student29);
		xiaoyu.answer(student29);
	*/
	}

}
