package PrimaryStage01Test;

public class test08 {
	/*
	��Ԫ�����/��Ŀ�����/���������
	 1.�﷨����
	 	�������ʽ  �� ���ʽ1�����ʽ2��
	
	 2.��Ԫ�������ִ��ԭ��
	 	���������ʽΪtrue��ִ�н��Ϊ���ʽ1
	 	���������ʽΪfalse��ִ�н��Ϊ���ʽ2
	 */
	public static void main(String[] args) {
		boolean sex=false;
		char c=sex ? '��':'Ů';
		System.out.println(c);//Ů
		System.out.println(c=sex ? '��':'Ů');//Ů
		
	}

}
