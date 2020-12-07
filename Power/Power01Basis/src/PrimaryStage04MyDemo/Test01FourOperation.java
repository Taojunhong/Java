package PrimaryStage04MyDemo;

public class Test01FourOperation {

	public static void main(String[] args) {

		System.out.println("四种功能请选择：1. 加法\t2. 减法\t3. 除法\t4. 乘法");
		java.util.Scanner s = new java.util.Scanner(System.in);
		int ch = s.nextInt();
		System.out.println("按顺序输入要计算的数字：");
		int a = s.nextInt();
		int b = s.nextInt();
		switch (ch) {
		case 1:
			sumInt(a, b);
			break;
		case 2:
			redu(a, b);
			break;
		case 3:
			devi(a, b);
			break;
		case 4:
			multipy(a, b);
			break;
		default:
			System.out.println("Sorry,The number you entered is illegal.");
		}
	}

	//方法
	public static int sumInt(int x, int y) {
		int sum = x + y;
		System.out.println(x + "+" + y + "=" + sum);
		return sum;
	}

	public static int redu(int x, int y) {
		int reduce = x - y;
		System.out.println(x + "-" + y + "=" + reduce);
		return reduce;
	}

	public static float devi(float x, float y) {
		float devide = x / y;
		System.out.println(x + "/" + y + "=" + devide);
		return devide;
	}

	public static int multipy(int x, int y) {
		int mult = x * y;
		System.out.println(x + "*" + y + "=" + mult);
		return mult;
	}
}
