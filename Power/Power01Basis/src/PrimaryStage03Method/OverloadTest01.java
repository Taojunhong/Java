package PrimaryStage03Method;

public class OverloadTest01 {
/*	
	����ķ������ػ��ƣ�
		1.sumInt,sumDouble,sumLong����������Ȼ���ܲ�ͬ��
		    ���ǹ��������Ƶġ�
		  ���Կ��Բ���һ�ֻ��ơ��������ػ��ơ�����д���������
		    
		
*/
	public static void main(String[]args){
		//���÷���
		int res1=sumInt(1,2);
		System.out.println(res1);
		
		double res2=sumDouble(1.0,2.0);
		System.out.println(res2);
		
		long res3=sumLong(1L,2L);
		System.out.println(res3);
	}
	
	
	//����һ�����������Լ�������int�������ݵĺ�
	public static int sumInt(int a,int b){
		return a+b;
	}
	
	//����һ�����������Լ�������double�������ݵĺ�
	public static double sumDouble(double a,double b){
		return a+b;
	}
	
	//����һ�����������Լ�������long�������ݵĺ�
	public static long sumLong(long a,long b){
		return a+b;
	}
	
}
