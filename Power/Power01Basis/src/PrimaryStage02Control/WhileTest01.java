package PrimaryStage02Control;

public class WhileTest01 {

	public static void main(String[] args) {
		/*
		while循环语句：
			1.while循环的语法结构：
				while(布尔表达式){
					循环体；
				}
			2.while循环的执行原理：
			
				先判断布尔表达式的结果，
				结果为true，继续执行循环体；
				结果为false，循环结束。
				
			3.while循环的循环次数：
				0~N次
				注意：while循环的循环体可能执行的次数为0次。
		*/
		
		/*
		编译器会检测true或者false
		while(true){
			System.out.println("死循环");
		}
		编译错误
		System.out.println("我要说话");
		*/
		
		//说明关系运算符在运行期才会得出结果，程序没有运行是不会运算这个关系的
		//编译器只知道它的结果是真或者是假，却不知道他是一个真，因为它没有运行
		int a=3;
		int b=10;
		while(b>a){
			System.out.println("2222");
		}
		//编译成功
		System.out.println("我要说话");
	}

}
