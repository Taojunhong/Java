package PrimaryStage02Control;

public class WorkSushuTest01 {

	public static void main(String[] args) {
		// 随机输入一个数，并判断是否为素数

		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入一个大于1的数：");
		int num = s.nextInt();
		boolean temp = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				temp = false;// 该数不是素数
				break;
			}
		}
		System.out.println(temp ? num + "是素数" : num + "不是素数");

		System.out.println("\n---------------------------");

		System.out.println("请输入要查询素数的最大范围：");
		int dtal = s.nextInt();
		for (int j = 2; j <= dtal; j++) {
			boolean res = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					res = false;// 该数不是素数
					break;
				}
			}
			System.out.println(res ? j + " 是素数" : j + " 不是素数");
		}

		int count = 0;
		for (int j = 2; j <= dtal; j++) {
			boolean res = true;
			for (int i = 2; i < j; i++) {
				if (j % i == 0) {
					res = false;// 该数不是素数
					break;
				}
			}
			if (res) {
				System.out.print(j + "\t");
				count++;
				if (count == 8) {// 统计
					System.out.println();
					count = 0;// 归0
				}
			}
		}
	}

}
