package Instance05;

public class Main {
	
	public static void main(String[]args){

		Customer c=new Customer();
		System.out.println(c.age);
		
		//���³���������ͨ������Ϊ�����﷨
		//���г��ֿ�ָ���쳣
		//java.lang.NullPointerException ��ָ���쳣
		//c=null;
		System.out.println(c.age);
		
	}

}
