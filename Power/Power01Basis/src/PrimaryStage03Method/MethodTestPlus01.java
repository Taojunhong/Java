package PrimaryStage03Method;

public class MethodTestPlus01 {
	/*
	 方法： 
	 	1.方法执行过程中的内存分配
	 	2.方法的重载机制 
	 	3.方法的递归调用
	 */

	public static void main(String[]args){
		int i=10;
		method(i);//11
		System.out.println("main-->"+i);//10
	}
	
	public static void method(int i){
		i++;
		System.out.println("i-->"+i);
	}

}
