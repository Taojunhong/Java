package PrimaryStage02Control;

public class BreakTest01 {

	public static void main(String[] args) {
		/*
		 break��䣺
		 	1.break��Java�����еĹؼ��֣�����Ϊ�ж�/�۶ϡ�
		 	2.break+���������Գ�Ϊһ��������������Java���ԣ�break��
		 	3.break���ʹ����switch����У�������ֹswitch����ִ�С�
		 	4.break���ͬ������ʹ����ѭ������У�������ֹѭ����
		 	5.Ĭ������£�break��ֹ���������ѭ����䡣
		 */
		
		//��ֹѭ��
		for(int a=1;a<=20;a++){
			if(a>=10){
				break;
			}
			System.out.println(a);
		}
		System.out.println("hello world");

	}

}
