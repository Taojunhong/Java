package PrimaryStage03Method;

public class OverloadTest02 {
/*	
	体现一下方法重载的优点：
		*程序员不需要记忆更多的方法名
		*代码美观
		有个前提：功能相似的时候，方法名可以相同
		但是，功能不同的时候，尽可能让方法名不相同
*/	
	public static void main(String[]args){
		//调用方法的时候就像在使用一个方法一样
		//参数的数据类型不同，对应的方法不同。
		//此时区分方法不再依靠方法名，而是依靠参数的数据类型
		System.out.println(sum(1,2));
		System.out.println(sum(1.0,2.0));
		System.out.println(sum(1L,2L));
	}
	
	//以下三个方法构成了方法的重载机制
	public static int sum(int a,int b){
		System.out.println("hello Int!");
		return a+b;
	}
	
	public static double sum(double a,double b){
		System.out.println("hello double!");
		return a+b;
	}
	
	public static long sum(long a,long b){
		System.out.println("hello long!");
		return a+b;
	}

}
