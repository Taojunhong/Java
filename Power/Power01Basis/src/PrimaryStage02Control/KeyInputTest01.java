package PrimaryStage02Control;

public class KeyInputTest01 {
	/*
	System.out.println();���������̨��������ڴ浽����̨�����ڴ������
	�����û���������
	*/
	public static void main(String[] args) {
		//1.��������ɨ����� 
		java.util.Scanner s=new java.util.Scanner(System.in);
		//2.����Scanner�����next()������ʼ���ռ�������
		//�Ӽ�������
		String userInputContent=s.next();
		
		//��������������
		System.out.println("��������ǣ�"+userInputContent);
		
		//��������
		int numInput=s.nextInt();
		
		//��������������
		System.out.println("��������ǣ�"+numInput);

	}

}
