package PrimaryStage01Test;

public class test07 {
	
	//�� + �� �����   �������ҷ���ִ��
	//1. �ӷ�����---�������ݶ������ݣ�һ���ǽ��мӷ�����
	//2.  �ַ�����������--- �� + ������ֻҪ��һ���������ַ���������Ӻ�һ��������ַ����������㣬��������ͻ����ַ���
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+b);//30
		System.out.println(a+"b");//10b
		System.out.println(10+20+"30");//3030
		System.out.println(10+(20+"30"));//102030
		System.out.println(10+(b+"30"));//102030
		
		//�ɵó����ۣ��� + �� �����   �������ҷ���ִ��
		System.out.println("10+20="+a+b);//10+20=1020
		System.out.println("10+20="+b+a);//10+20=2010
		
		//��̬��ʽ���   
		System.out.println("10+20="+(a+b));//10+20=30
		System.out.println(a+"+"+b+"="+(a+b));//10+20=30
		a=100;
		b=200;
		System.out.println(a+"+"+b+"="+(a+b));//100+200=300
		
		
		//String�ǻ����������ͣ� s �Ǳ����� ����abc����String���͵�����
		//String s="abc";
		//����һ��Strintg���͵ı���,������username,��ֵ��zhangsan��
		String username="zhangsan";
		System.out.println("��½�ɹ�����ӭ"+username+"����~");

	}

}
