package PrimaryStage02Control;

public class ContinueTest01 {

	public static void main(String[] args) {
		/*
		 continue��䣺 
		 	1.continue��ʾ������/go on/��һ�� 
		 	2.��ʾ������һ��ѭ������ִ��.
		 	3.break��continue������
		 		* break��ʾѭ����ִ����
		 		* continue��ʾ��ֹ����ѭ����������һ��ѭ������ִ��
		  
		 */

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("hello world");
		
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("hello world");
	}

}
