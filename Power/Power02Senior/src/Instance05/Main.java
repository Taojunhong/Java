package Instance05;

public class Main {
	
	public static void main(String[]args){

		Customer c=new Customer();
		System.out.println(c.age);
		
		//以下程序编译可以通过，因为符合语法
		//运行出现空指针异常
		//java.lang.NullPointerException 空指针异常
		//c=null;
		System.out.println(c.age);
		
	}

}
