package PrimaryStage02Control;

public class ForTest02 {
	public static void main(String[] args) {
		// 输出1~50的所有奇数
		int count = 0;
		for (int i = 1; i <= 50; i += 2) {
			System.out.print(i + "\t");

			count++;
			if (count % 5 == 0) {
				System.out.println("\n");
			}
		}
		// 输出1~50的所有偶数
		for (int i = 2; i <= 50; i += 2) {
			System.out.println(i);
		}
	}

}
