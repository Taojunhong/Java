package PrimaryStage02Control;

public class ForTest03 {
	public static void main(String[] args) {
		// �ҳ�1~100���е�������
		//+=  �ۼӵķ���
		int count = 0;
		int sum=0;
		// ��һ�ַ�����
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + "\t");
			sum+=i;
			count++;
			if (count % 5 == 0) {
				System.out.println("\n");
			}
		}
		System.out.println("�ܺͣ�"+sum);//1~100���е������ĺ�

		System.out.println("-----------------------------------------");

		// �ڶ��֣�
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				System.out.print(i + "\t");
				count++;
				if (count % 5 == 0) {
					System.out.println("\n");
				}
			}
		}
	}

}
