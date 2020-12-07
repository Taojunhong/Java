package PrimaryStage02Control;

public class ForTest03 {
	public static void main(String[] args) {
		// 找出1~100所有的奇数：
		//+=  累加的符号
		int count = 0;
		int sum=0;
		// 第一种方法：
		for (int i = 1; i <= 100; i += 2) {
			System.out.print(i + "\t");
			sum+=i;
			count++;
			if (count % 5 == 0) {
				System.out.println("\n");
			}
		}
		System.out.println("总和："+sum);//1~100所有的奇数的和

		System.out.println("-----------------------------------------");

		// 第二种：
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
