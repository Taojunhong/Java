package PrimaryStage03Method;

public class OverloadTest02 {
/*	
	����һ�·������ص��ŵ㣺
		*����Ա����Ҫ�������ķ�����
		*��������
		�и�ǰ�᣺�������Ƶ�ʱ�򣬷�����������ͬ
		���ǣ����ܲ�ͬ��ʱ�򣬾������÷���������ͬ
*/	
	public static void main(String[]args){
		//���÷�����ʱ�������ʹ��һ������һ��
		//�������������Ͳ�ͬ����Ӧ�ķ�����ͬ��
		//��ʱ���ַ�����������������������������������������
		System.out.println(sum(1,2));
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
	}
	
	//�����������������˷��������ػ���
	public static int sum(int a,int b){
		System.out.println("hello Int!");
		return a+b;
	}
	
	public static double sum(double a,double b){
		System.out.println("hello double!");
		return a+b;
	}
	
	public static long sum(long a,long b){
		System.out.println("hello long!");
		return a+b;
	}

}
