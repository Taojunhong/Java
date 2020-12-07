package PrimaryStage02Control;

public class ContinueTest01 {

	public static void main(String[] args) {
		/*
		 continue语句： 
		 	1.continue表示：继续/go on/下一个 
		 	2.表示进入下一次循环继续执行.
		 	3.break和continue的区别：
		 		* break表示循环不执行了
		 		* continue表示终止本次循环，进入下一次循环继续执行
		  
		 */

		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("hello world");
		
		
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("hello world");
	}

}
