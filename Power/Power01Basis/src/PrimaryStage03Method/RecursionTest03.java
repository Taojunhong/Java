package PrimaryStage03Method;

public class RecursionTest03 {
	/*
	 * 使用递归计算1~N的求和: -->4+3+2+1
	 */
	public static void main(String[] args) {

		// 1~4的和
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}

	public static int sum(int n) {
		// 4+3+2+1 加到1就结束
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);//这里使用了递归
	}
}
