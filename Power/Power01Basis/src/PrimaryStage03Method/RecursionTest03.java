package PrimaryStage03Method;

public class RecursionTest03 {
	/*
	 * ʹ�õݹ����1~N�����: -->4+3+2+1
	 */
	public static void main(String[] args) {

		// 1~4�ĺ�
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}

	public static int sum(int n) {
		// 4+3+2+1 �ӵ�1�ͽ���
		if (n == 1) {
			return 1;
		}
		return n + sum(n - 1);//����ʹ���˵ݹ�
	}
}
