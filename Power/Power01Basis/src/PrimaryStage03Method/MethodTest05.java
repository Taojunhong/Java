package PrimaryStage03Method;

public class MethodTest05 {

	public static void main(String[] args) {
		// 方法的调用
		m();// 在本类的方法调用时可以不加“ 类名. ”

		A.m();// 不在同一类的方法在调用时要加上所在类的"类名."

	}

	public static void m() {
		System.out.println("A is main method.");
	}
}

class A {
	public static void m() {
		MethodTest05.m();
		System.out.println("A is m method.");
	}

}
