package KeysWord_this02;

public class UserTest {

	public static void main(String[] args) {

		User u1=new User(20,"����");
		System.out.println(u1.getId());
		System.out.println(u1.getName());
		
		u1.setName("����");
		System.out.println(u1.getName());
	}

}
