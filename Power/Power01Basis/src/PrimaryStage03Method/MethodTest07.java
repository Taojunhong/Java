package PrimaryStage03Method;

public class MethodTest07 {
	
	/*
	����return���
		*����return�ؼ��ֵ�Java���ֻҪִ�У����ڵķ���ִ�н���
		*�ڡ�ͬһ���������У�return�����治�ܱ�д�κδ��룬
		��Ϊ��Щ������Զ��ִ�в��������Ա��뱨��
		
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
			return 10;// return ���ֻҪһִ�У����������ͽ���
			// System.out.println("hello"); �޷����ʵ�����䣬
		}
		return a;
	}

	// ������д��
	public static int n(int b) {
		return b > 3 ? 10 : 0;
	}
}
