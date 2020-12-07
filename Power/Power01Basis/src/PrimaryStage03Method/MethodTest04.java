package PrimaryStage03Method;

public class MethodTest04 {

	// 主方法
	public static void main(String[] args) {

		// 调用sum方法
		MethodTest04.sum(20, 30);
		MethodTest04.dosome();
	}

	public static void dosome() {
		System.out.println("do some!");
	}

	public static void sum(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
		MethodTest04.dosome();// 方法也可以在方法中调用
	}

}
