package Construction02;

/**
 *���췽�������ã�
 *		1.��������
 *		2.��ʵ��������ֵ�� 
 *
 *��Ա����֮ʵ�����������ڶ��󼶱�ı��������ֱ����������ж��������ʵ��������
 *ʵ������û���ֶ���ֵ֮ǰ��ʱ��ϵͳĬ�ϸ�ֵ����ô���ϵͳĬ�ϸ�ֵ����ʲôʱ����ɵģ�
 *		-��������ص�ʱ����
 *			-���ǣ���Ϊ����ص�ʱ��ֻ�����˴���Ƭ�Σ�û���ü������������Դ�ʱʵ��������û�г�ʼ��
 *		ʵ���ϣ�ʵ���������ڴ�ռ����ڹ��췽��ִ�й��̵�����ɿ��ٵġ���ɳ�ʼ���ġ�
 *		ϵͳ��Ĭ�ϸ�ֵ��ʱ��Ҳ���ڹ��췽��ִ�й��̵�����ɵĸ�ֵ��
 */

public class Constructor {
	
	public static void main(String[] args) {
		
		Account act1=new Account();
		
		System.out.println("�˺ţ�"+act1.getActno());
		System.out.println("��"+act1.getBalance());
		
		Account act2=new Account(10086.86);
		System.out.println("�˺ţ�"+act2.getActno());
		System.out.println("��"+act2.getBalance());
		
		Account act3=new Account("act-001");
		System.out.println("�˺ţ�"+act3.getActno());
		System.out.println("��"+act3.getBalance());
		
		Account act4=new Account(10010.3,"act-004");
		System.out.println("�˺ţ�"+act4.getActno());
		System.out.println("��"+act4.getBalance());
		 
		
	}
	
	

}
