package PrimaryStage02Control;

public class ForTest05����
{
	public static void main(String[] args) {
		// �ҳ�1~100���ڵ�����
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
		// �ҳ�1~10000���ڵ�����
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
