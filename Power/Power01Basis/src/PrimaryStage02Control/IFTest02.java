package PrimaryStage02Control;

public class IFTest02 {

	public static void main(String[] args) {
		//1.��������ɨ����� 
		java.util.Scanner s=new java.util.Scanner(System.in);
		//2.����Scanner�����next()������ʼ���ռ�������
		//�Ӽ�����������
		System.out.print("������������䣺");
		int age=s.nextInt();
		//System.out.println("age="+age);
		
		//�����߼������ж�
		String str="����";
		if(age<0||age>150){
			str="����������䲻�Ϸ������������[0-150]֮��";
		}else if(age<=5){
			str="�׶�";
		}else if(age<=10){
			str="����";
		}else if(age<=18){
			str="������";
		}else if(age<=35){
			str="����";
		}else if(age<=55){
			str="����";
		}
		System.out.println(str);

	}

}
