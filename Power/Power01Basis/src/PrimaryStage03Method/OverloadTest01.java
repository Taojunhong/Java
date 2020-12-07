package PrimaryStage03Method;

public class OverloadTest01 {
/*	
	程序的方法重载机制：
		1.sumInt,sumDouble,sumLong三个方法虽然功能不同，
		    但是功能是相似的。
		  所以可以采用一种机制“方法重载机制”，编写代码更方便
		    
		
*/
	public static void main(String[]args){
		//调用方法
		int res1=sumInt(1,2);
		System.out.println(res1);
		
		double res2=sumDouble(1.0,2.0);
		System.out.println(res2);
		
		long res3=sumLong(1L,2L);
		System.out.println(res3);
	}
	
	
	//定义一个方法，可以计算两个int类型数据的和
	public static int sumInt(int a,int b){
		return a+b;
	}
	
	//定义一个方法，可以计算两个double类型数据的和
	public static double sumDouble(double a,double b){
		return a+b;
	}
	
	//定义一个方法，可以计算两个long类型数据的和
	public static long sumLong(long a,long b){
		return a+b;
	}
	
}
