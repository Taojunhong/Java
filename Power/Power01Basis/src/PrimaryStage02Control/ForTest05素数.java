package PrimaryStage02Control;

public class ForTest05素数
{
	public static void main(String[] args) {
		// 找出1~100以内的素数
		int count=0;
		for (int num = 2; num <= 100; num++) {
			boolean temp = true;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					temp = false;
					break;
				}
			}
			if (temp == true) {
				System.out.print(num+"\t");
				count++;
				if(count%8==0){
					System.out.println();
				}
			}
		}
		
		System.out.println("\n************************************************");
		// 找出1~10000以内的素数
				count=0;
				for (int num = 2; num <= 10000; num++) {
					boolean temp = true;
					for (int i = 2; i < num; i++) {
						if (num % i == 0) {
							temp = false;
							break;
						}
					}
					if (temp == true) {
						System.out.print(num+"\t");
						count++;
						if(count%8==0){
							System.out.println();
						}
					}
				}

	}

}
