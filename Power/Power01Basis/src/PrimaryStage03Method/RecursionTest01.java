package PrimaryStage03Method;

public class RecursionTest01 {
/*	
	���ڷ����ĵݹ���ã�
		1.ʲô�ǵݹ飿
			--���������������
			a(){
				a();
			}
		2.�ݹ��Ǻܺķ�ջ�ڴ�ģ��ݹ��㷨���Բ��õ�ʱ�������� 
		
		3.���³�������ʱ�������󡾲����쳣����һ������Error��
			java.long.StackOverflowError
			ջ�ڴ��������
			�������޷���أ�ֻ��һ�������JVMֹͣ������
			
		4.�ݹ�����н�������������ᷢ���������
		
*/	
	//������
	public static void main(String[]args){
		//����dosome����
		dosome();
	}
	
	public static void dosome(){
		System.out.println("dosome begin!");
		dosome();
		System.out.println("dosome over!");
	}

}
