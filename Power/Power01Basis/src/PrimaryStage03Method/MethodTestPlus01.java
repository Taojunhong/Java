package PrimaryStage03Method;

public class MethodTestPlus01 {
	/*
	 ������ 
	 	1.����ִ�й����е��ڴ����
	 	2.���������ػ��� 
	 	3.�����ĵݹ����
	 */

	public static void main(String[]args){
		int i=10;
		method(i);//11
		System.out.println("main-->"+i);//10
	}
	
	public static void method(int i){
		i++;
		System.out.println("i-->"+i);
	}

}
