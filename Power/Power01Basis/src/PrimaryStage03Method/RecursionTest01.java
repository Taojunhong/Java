package PrimaryStage03Method;

public class RecursionTest01 {
/*	
	关于方法的递归调用：
		1.什么是递归？
			--方法自身调用自身。
			a(){
				a();
			}
		2.递归是很耗费栈内存的，递归算法可以不用的时候尽量不用 
		
		3.以下程序运行时发生错误【不是异常，是一个错误Error】
			java.long.StackOverflowError
			栈内存溢出错误。
			错误发生无法挽回，只有一个结果，JVM停止工作。
			
		4.递归必须有结束条件，否则会发生溢出错误
		
*/	
	//主方法
	public static void main(String[]args){
		//调用dosome方法
		dosome();
	}
	
	public static void dosome(){
		System.out.println("dosome begin!");
		dosome();
		System.out.println("dosome over!");
	}

}
