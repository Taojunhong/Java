package PrimaryStage03Method;

public class OverloadTest03 {
/*
	�������أ�
		1.���������ֱ���Ϊ��overload
		
		2.ʲôʱ����ʹ�÷������أ�
			* �������Ƶ�ʱ�򣬷�����������ͬ
			   �����ǣ����ܲ�ͬ��ʱ�򣬾������÷���������ͬ��
			*
		3.ʲô��������֮�󹹳��˷������أ�
			*��ͬһ�൱��
			*��������ͬ
			*�����б�ͬ
				--����������ͬ
				--����˳��ͬ
				--�������Ͳ�ͬ
		4.�������غ�ʲô�����й�ϵ����ʲôû�й�ϵ��
			*�������غͷ�����+�����б��й�ϵ
			*�������غͷ���ֵ�����޹�
			*�������غ����η��б��޹�
*/	
	
	public static void main(String[]args){
		
		//����
		m1(100);
		m1();
		
		m2(10,20.5);
		m2(10.99,2);
		
		m3(100);
		m3(10.2586);
		
	}
	
	//��������������������--����������ͬ
	public static void m1(){System.out.println("hello world!");}
	public static void m1(int a){System.out.println("hello m1-2");}
	
	//��������������������--����˳��ͬ
	public static void m2(int a,double b){System.out.println("hello m2-1");}
	public static void m2(double a,int b){System.out.println("hello m2-2");}
	
	//��������������������--�������Ͳ�ͬ
	public static void m3(int a){System.out.println("hello m3-1");}
	public static void m3(double a){System.out.println("hello m3-2");}



}
