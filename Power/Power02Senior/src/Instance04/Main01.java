package Instance04;

public class Main01 {
	
	public static void main(String[]args){
		
		//����User����
		User u=new User();
		
		//���User�����ڲ�ʵ��������ֵ
		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.addr);
		
		//�޸�User�����ڲ�ʵ��������ֵ
		u.no=110;
		u.name="jack";
		u.addr=new Address();
		
		//��main��������Ŀǰֻ�ܿ���һ�����á�u��
		//һ�ж���ֻ��ͨ��u�����з���
		System.out.println(u.name+" ��ס��"+u.addr.city+"���У�"+u.addr.street+"�ֵ����ʱ��ǣ�"+u.addr.zipcode);
		
		u.addr.city="����";
		u.addr.street="�ϲ�";
		u.addr.zipcode="3300222";
		
		System.out.println(u.name+" ��ס��"+u.addr.city+"���У�"+u.addr.street+"�ֵ����ʱ��ǣ�"+u.addr.zipcode);

	}

}
