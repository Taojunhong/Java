package Final01;

public class FinalTest03 {

	public static void main(String[] args) {
		
		//创建用户对象
		User u = new User(100);
		System.out.println(u);
		//又创建一个用户对象
		u = new User(200);
		
		//创建用户对象
		final User user= new User(30);
		System.out.println(user.id);
		
		user.id=50;
		System.out.println(user.id);

	}

}
