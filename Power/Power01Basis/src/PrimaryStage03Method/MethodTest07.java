package PrimaryStage03Method;

public class MethodTest07 {
	
	/*
	深入return语句
		*带有return关键字的Java语句只要执行，所在的方法执行结束
		*在“同一个作用域”中，return语句后面不能编写任何代码，
		因为这些代码永远都执行不到，所以编译报错
		
	*/

	public static void main(String[] args) {

		int retValue1 = m(1);
		int retValue2 = m(10);

		System.out.println(retValue1);
		System.out.println(retValue2);
		System.out.println(n(10));
		System.out.println(n(-1));
	}

	public static int m(int a) {
		if (a > 3) {
			return 10;// return 语句只要一执行，整个方法就结束
			// System.out.println("hello"); 无法访问到的语句，
		}
		return a;
	}

	// 更简便的写法
	public static int n(int b) {
		return b > 3 ? 10 : 0;
	}
}
