package Instance04;

public class Main02 {

	public static void main(String[] args) {

		User u=new User();
		
		Address a=new Address();
		u.addr=a;
		
		System.out.println(u.addr.city);//null
		
		a.city="����";
		System.out.println(u.addr.city);//����
	}

}
