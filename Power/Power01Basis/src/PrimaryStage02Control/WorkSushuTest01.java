package PrimaryStage02Control;

public class WorkSushuTest01 {

	public static void main(String[] args) {
		// �������һ���������ж��Ƿ�Ϊ����

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("������һ������1������");
		int num = s.nextInt();
		boolean temp = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = false;// ������������
				break;
			}
		}
		System.out.println(temp ? num + "������" : num + "��������");

		System.out.println("\n---------------------------");

		System.out.println("������Ҫ��ѯ���������Χ��");
		int dtal = s.nextInt();
		for (int j = 2; j <= dtal; j++) {
			boolean res = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					res = false;// ������������
					break;
				}
			}
			System.out.println(res ? j + " ������" : j + " ��������");
		}

		int count = 0;
		for (int j = 2; j <= dtal; j++) {
			boolean res = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					res = false;// ������������
					break;
				}
			}
			if (res) {
				System.out.print(j + "\t");
				count++;
				if (count == 8) {// ͳ��
					System.out.println();
					count = 0;// ��0
				}
			}
		}
	}

}
