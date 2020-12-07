package PrimaryStage02Control;

public class BreakTest01 {

	public static void main(String[] args) {
		/*
		 break语句：
		 	1.break是Java语言中的关键字，翻译为中断/折断。
		 	2.break+“；”可以成为一个单独的完整的Java语言：break；
		 	3.break语句使用在switch语句中，用来终止switch语句的执行。
		 	4.break语句同样可以使用在循环语句中，用来终止循环。
		 	5.默认情况下，break终止的是最近的循环语句。
		 */
		
		//终止循环
		for(int a=1;a<=20;a++){
			if(a>=10){
				break;
			}
			System.out.println(a);
		}
		System.out.println("hello world");

	}

}
