package PrimaryStage03Method;

public class RecursionTest04 {
	/*
	 * ��ʹ�õݹ飬����N�Ľ׳ˣ� 5�Ľ׳ˣ�5*4*3*2*1
	 */
	public static void main(String[] args) {

		int n = 5;
		int retValue = method(n);
		System.out.println(retValue);

		System.out.println(method(6));
	}

	public static int method(int n) {
		int result = 1;
		for (int i = n; i > 0; i--) {
			result *= i;
		}
		return result;
	}

	// ʹ�õݹ����׳�
	public static int method1(int n) {
		if (n == 1) {
			return 1;
		}
		return n * method1(n - 1);
	}
}
