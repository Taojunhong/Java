package Istannce07;

public class Main {
	
	public static void main(String[]args){
		
		Computer bijiben=new Computer();
		
		
		Student zhangsan=new Student();
		
		zhangsan.id="123";
		zhangsan.name="����";
		zhangsan.notepad=bijiben;
		
		bijiben.brand="��˶";
		bijiben.style="C5270-003";
		bijiben.color="black";
		
		System.out.println(zhangsan.name+"�ĵ���Ʒ��Ϊ�� "+zhangsan.notepad.brand);
		System.out.println(zhangsan.name+"�ĵ����ͺ�Ϊ�� "+zhangsan.notepad.style);
		System.out.println(zhangsan.name+"�ĵ�����ɫΪ�� "+zhangsan.notepad.color);
		System.out.println("---------------------------------");
		
		bijiben.brand="ƻ��";
		bijiben.style="X6290-008";
		bijiben.color="pink";
		
		System.out.println(zhangsan.name+"�ĵ���Ʒ��Ϊ�� "+zhangsan.notepad.brand);
		System.out.println(zhangsan.name+"�ĵ����ͺ�Ϊ�� "+zhangsan.notepad.style);
		System.out.println(zhangsan.name+"�ĵ�����ɫΪ�� "+zhangsan.notepad.color);

	}

}
