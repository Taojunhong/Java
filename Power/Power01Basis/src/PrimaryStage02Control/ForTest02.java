package PrimaryStage02Control;

public class ForTest02 {
	public static void main(String[] args) {
		// ���1~50����������
		int count = 0;
		for (int i = 1; i <= 50; i += 2) {
			System.out.print(i + "\t");

			count++;
			if (count % 5 == 0) {
				System.out.println("\n");
			}
		}
		// ���1~50������ż��
		for (int i = 2; i <= 50; i += 2) {
			System.out.println(i);
		}
	}

}
