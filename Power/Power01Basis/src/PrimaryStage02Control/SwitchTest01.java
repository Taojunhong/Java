package PrimaryStage02Control;

public class SwitchTest01 {
	/*
	����Switch���
		1.switch���Ҳ����ѡ��ṹ��Ҳ�Ƿ�֧���
		
		2.switch�����﷨�ṹ��
		
			switch(int��String����ֵ�����){
				case int��String����ֵ�����:
					java���;
					...
					break;
				case int��String����ֵ�����:
					java���;
					...
					break;
				case int��String����ֵ�����:
					java���;
					...
					break;
				...
				default :
					java���
					...
			}
		3.switch����ִ��ԭ��
			switch����С���ŵ��еġ����ݡ���case����ġ����ݡ�����һһƥ�䣬
			�Ұ������϶��µ�˳������ƥ�䣬ƥ��ɹ����ִ֧�У�
			
		4.case��͸����caseƥ��ɹ��ķ�ִ֧�У�����֧û��дbreak��
		    �����case���������ƥ�����ֱ��ִ��
			
		5.����һ����֧����break;����switch���ͽ�����
		
		6.switch����ģ�����ֻ��ɫint����String���͵����ݣ���������������
		  �� byte��short��charҲ����ֱ��д��switch��case���棬��Ϊ���ǿ��Խ����Զ�����ת��
		  
		7.JDK6�汾�ģ�switch�Ͳ�ɫ����ֻ��̽��int���ͣ�JDK7�����ϰ汾�Ŀ���̽��int��String���͵�����
		
		8.case���Ժϲ���
			int i=1;
			switch(i){
				case 1: case 2: case 3: case 10:
					System.out.println("Test Code!");
			}
	
	*/
	public static void main(String[] args) {
		//long����
		long a=100L;
		switch((int)a){}
		
		//byte����
		byte b=10;
		switch(b){}
		
		//short����
		short s=20;
		switch(s){}
		
		//char����
		char c='A';
		switch(c){}
		
		//String����
		String username="zhangsan";
		switch(username){}
		
		
		/*
		switch���ӣ�
		�����û�����
		1 ��ʾ����һ
		2 ��ʾ���ڶ�
		...
		7 ��ʾ������		
		 */
		java.util.Scanner x=new java.util.Scanner(System.in);
		System.out.print("���������֣�");
		int num=x.nextInt();
		switch(num){
			case 1: //case 0:�ϲ�
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default :
				System.out.println("Sorry,The number you entered is illegal.");
		}
		System.out.println("======================");
		
		//case ��͸
		switch(num){
		case 1:
			System.out.println("����һ");
			//break;
		case 2:
			System.out.println("���ڶ�");
			//break;
		case 3:
			System.out.println("������");
			//break;
		case 4:
			System.out.println("������");
			//break;
		case 5:
			System.out.println("������");
			//break;
		case 6:
			System.out.println("������");
			//break;
		case 7:
			System.out.println("������");
			break;
		default :
			System.out.println("Sorry,The number you entered is illegal.");
	}
	}

}
