package Instance01;

public class Main {
/*	
	����Ĵ�����ʹ��
*/
	public static void main(String[]args){
		//int �ǻ�����������
		//i��һ��������
		//10��int���͵�����ֵ
		//int i=10;
		
		//ͨ��һ�������ʵ����N������
		//ʵ���������﷨��new ���� ();
		//new ��Java���Ե��е�һ��������������Ǵ�������
		//��JVM���ڴ浱�п����µ��ڴ�ռ�
		//�������ڴ棺������ص�ʱ��class�ֽ������Ƭ�α����ص��µ��ڴ�ռ�
		//ջ�ڴ棨�ֲ�����������������Ƭ��ִ�е�ʱ�򣬻���÷��������ڴ�ռ䣬��ջ�ڴ���ѹջ
		//���ڴ棺new�Ķ����ڶ��ڴ��д洢
		//Student��һ��������������
		//s��һ��������
		//new Student()��һ��ѧ������
		//s��һ���ֲ���������ջ�ڴ��д洢��
		//ʲô�Ƕ���new������ڶ��ڴ��п��ٵ��ڴ�ռ��������
		//ʲô�����ã�������һ���������������������һ���ռ��ַ
		
		Student s =new Student();
		
		//����ʵ���������﷨��ʽ��
		//��ȡ���ݣ�����.������
		//�޸����ݣ�����.������=ֵ
		
		//��ȡ
		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddr=s.addr;
		
		//��ӡ
		System.out.println(stuNo);
		System.out.println(stuName);
		System.out.println(stuAge);
		System.out.println(stuSex);
		System.out.println(stuAddr);
		System.out.println("------------");
		
		//�޸�
		s.no=10;
		s.name="����";
		s.age=20;
		s.sex=true;
		s.addr="����";
		
		//��ӡ
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.addr);
	}
	
}



















