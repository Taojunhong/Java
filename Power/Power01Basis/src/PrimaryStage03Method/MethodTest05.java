package PrimaryStage03Method;

public class MethodTest05 {

	public static void main(String[] args) {
		// �����ĵ���
		m();// �ڱ���ķ�������ʱ���Բ��ӡ� ����. ��

		A.m();// ����ͬһ��ķ����ڵ���ʱҪ�����������"����."

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
