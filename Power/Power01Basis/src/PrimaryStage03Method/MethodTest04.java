package PrimaryStage03Method;

public class MethodTest04 {

	// ������
	public static void main(String[] args) {

		// ����sum����
		MethodTest04.sum(20, 30);
		MethodTest04.dosome();
	}

	public static void dosome() {
		System.out.println("do some!");
	}

	public static void sum(int x, int y) {
		System.out.println(x + "+" + y + "=" + (x + y));
		MethodTest04.dosome();// ����Ҳ�����ڷ����е���
	}

}
