package PrimaryStage03Method;

public class MethodTest03 {
/*
	//public ��ʾ������
	//class��ʾ������
	//MethodTest03��һ������
	public static void main(String[] args) {
	
		//����
		//�����в���ֱ�ӱ�дJava��䣬����������֮��
		//����������������
		
		//����
		//public ��ʾ������
		//static��ʾ��̬��
		//void��ʾ����ִ�н���֮�󲻷����κ�����
		//main�Ƿ�������������
		//(String[]args)����ʽ�����б�
		//��������Ҫ�̶���д�����ǳ�������
*/	
	public static void main(String[]args){
		//���÷�����
		MethodTest03.sum(20,30);//ʵ��
		MethodTest03.reduce(20, 30);
		int a=200;
		int b=500;
		MethodTest03.sum(a, b);
		MethodTest03.reduce(a, b);
	}
	
	//�Զ��巽����������int�������ݵĺͣ���Ҫ�󷵻ؽ������Ҫ�����ֱ�����������̨
	//���η��б�public static
	//����ֵ�б�void
	//��������sum
	//�����壺��Ҫ���������֮�����������
	
	public static void sum(int x,int y){
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	public static void reduce(int n,int m){
		System.out.println(n+"-"+m+"="+(n-m));
	}
}
