package Extends01;

/**
 * ����Java���Եĵ��еļ̳У�
 * 		1.�̳�������������������֮һ�����������ֱ��ǣ���װ���̳У���̬
 * 		
 * 		2.�̳С��������������ǣ����븴�á����̳����Ҫ���������ǣ����˼̳в����Ժ�ķ������ǺͶ�̬����
 * 		
 * 		3.�̳��﷨��ʽ��
 * 			[���η��б�] class ���� extends ������{
 * 				���壻
 * 			}
 * 		
 * 		4.Java���Ե��еļ̳�ֻ֧�ֵ��̳У�һ���಻��ͬʱ�̳ж��ࡣ
 * 		
 * 		5.���ڼ̳��е�һЩ���
 * 			B��̳�A�࣬���У�
 * 				A���Ϊ�����ࡢ���ࡢ���ࡢsuperclass
 * 				B���Ϊ�����ࡢ�����ࡢsubclass
 * 		
 * 		6.��Java����������̳и��඼�̳���Щ�����أ�
 * 			-˽�еĲ�֧�ּ̳�
 * 			-���췽����֧�ּ̳�
 * 			-�������ݶ����Ա��̳�
 * 		
 * 		7.��ȻJava����ֻ֧�ֵ��̳У�����һ����Ҳ���Լ��̳������࣬���磺
 * 			C extends B{
 * 			}
 * 			B extends A{
 * 			}
 * 			A extends T{
 * 			}
 * 			C��ֱ�Ӽ̳�B�࣬����Ӽ̳��� T��A��
 * 			
 * 		8.Java���������һ����û����ʾ�̳��κ��࣬����Ĭ�ϼ̳�JavaSE�⵱���ṩ��java.lang.Object�ࡣ
 * 
 * @author ASUS
 *
 */
public class ExtendsTest {

	public static void main(String[] args) {

		/*ExtendsTest ee=new ExtendsTest();
		String s=ee.toString();
		System.out.println(s);*/
		
		CreditAccount act=new CreditAccount();
		act.setActno("act-10086");
		act.setBalance(-10010.86);
		act.setCredit(-80);
		
		System.out.println("�˺ţ�"+act.getActno()+"\n��"+act.getBalance()+"\n���ã�"+act.getCredit());
	}

}
