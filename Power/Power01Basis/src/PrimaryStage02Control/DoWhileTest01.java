package PrimaryStage02Control;

public class DoWhileTest01 {

	public static void main(String[] args) {
		/*
		 do..whileѭ����
			1.do..whileѭ�����﷨�ṹ��
				
				do{
					ѭ����
				}while(�������ʽ);
				
			2.do..whileѭ����ִ��ԭ��
				
			3.do..whileѭ����ִ�д�����
			
				do..whileѭ����ѭ�������Ƭ��ִ�д�����1~N�Σ�������һ��
			
			4.ʹ��do..whileѭ����ע�����
				do..whileѭ�����������һ���ֺŽ�β��
		*/
		
		int i=10;
		//����ִ��һ��
		do{
			System.out.println(i);
		}while(i>100);
		
		System.out.println("-----------------");
		
		//���жϲ������ʽ
		while(i>100){
			System.out.println("i-->"+i);
		}
	}

}
