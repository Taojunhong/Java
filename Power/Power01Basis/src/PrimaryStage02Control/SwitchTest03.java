package PrimaryStage02Control;

public class SwitchTest03 
{
	public static void main(String[] args){
		/*
		ʵ�ּ��������е� 
		+	-	*	/	%
		˼·��
		1.ѡ���������ݴӼ�������
		2.ʹ��switch�������ж�
		3.��Ҫ�ӿ���̨��������
			*��һ������
			*�����
			*�ڶ�������
		���磺
		�������һ�����֣�10
		�������������+
		��������������֣�20
		��������10+20=30			
		*/
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("��ӭʹ�ü򵥼�����");
		System.out.print("�������һ�����֣�");
		int num1=s.nextInt();
		System.out.print("�������������");
		char ch=s.next().charAt(0);
		System.out.print("��������������֣�");
		int result=0;
		int num2=s.nextInt();
		switch(ch){
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			case '%':
				result=num1%num2;
				break;
			default :
				System.out.println("���벻�Ϸ������������룡");
		}
		System.out.println("��������"+num1+ch+num2+"="+result);
	}

}
