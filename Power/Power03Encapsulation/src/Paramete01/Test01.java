package Paramete01;

/**
 * 参数传递：
 * 	本质是值得传递，只不过这个“值”有时候是一个字面值，有时候是
 * 	两题个Java对象的内存地址。
 * 
 * @author Jun
 */
public class Test01 {

	public static void main(String[] args) {
		User u = new User(10);
		//传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个Java对象的内存地址。
		add(u);
		System.out.println("main-->" + u.age);//11
	}

	public static void add(User u) {
		u.age++;
		System.out.println("add-->" + u.age);//11
	}
}

class User {

	// 实例变量
	int age;

	public User(int i) {
		age = i;
	}
}
