package KeysWord_Static01;
/**
 * ����ʹ��static�ؼ��������塰��̬����顱��
 * 		1.�﷨��ʽ��
 * 			static{
 * 				java��䣻
 * 			}
 * 		2.��̬�����������ص�ʱ��ִ�У�����ִֻ��һ�Ρ�
 * 
 * 		3.��̬�������һ�����п��Ա�д�����������ѭ���϶��µ�˳������ִ��
 * 
 * 		4.��̬���������ã���̬�������JavaΪ����Ա׼����һ������ʱ�̣����
 * 		  ��ʹʱ�̱���Ϊ�����ʱ�̡���ϣ���ڴ˿�ִ��һ������ĳ��򣬾Ϳ��Էŵ���̬����鵱��
 * @author ASUS
 */

public class StaticTest03 {
	
	static{
		System.out.println("�����-->>1");
	}
	static{
		System.out.println("�����-->>2");
	}
	static{
		System.out.println("�����-->>3");
	}
	
	public static void main(String[] args) {
		System.out.println("main begin!");
	}

}
