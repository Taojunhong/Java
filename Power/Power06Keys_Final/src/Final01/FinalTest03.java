package Final01;

public class FinalTest03 {

	public static void main(String[] args) {
		
		//�����û�����
		User u = new User(100);
		System.out.println(u);
		//�ִ���һ���û�����
		u = new User(200);
		
		//�����û�����
		final User user= new User(30);
		System.out.println(user.id);
		
		user.id=50;
		System.out.println(user.id);

	}

}
