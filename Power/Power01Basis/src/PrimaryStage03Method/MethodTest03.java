package PrimaryStage03Method;

public class MethodTest03 {
/*
	//public 表示公开的
	//class表示定义类
	//MethodTest03是一个类名
	public static void main(String[] args) {
	
		//类体
		//类体中不能直接编写Java语句，除声明变量之外
		//方法出现在类体中
		
		//方法
		//public 表示公开的
		//static表示静态的
		//void表示方法执行结束之后不返回任何数据
		//main是方法名：主方法
		//(String[]args)：形式参数列表
		//主方法需要固定编写，这是程序的入口
*/	
	public static void main(String[]args){
		//调用方法：
		MethodTest03.sum(20,30);//实参
		MethodTest03.reduce(20, 30);
		int a=200;
		int b=500;
		MethodTest03.sum(a, b);
		MethodTest03.reduce(a, b);
	}
	
	//自定义方：计算两个int类型数据的和，不要求返回结果。但要将结果直接输出到控制台
	//修饰符列表：public static
	//返回值列表：void
	//方法名：sum
	//方法体：主要任务是求和之后输出计算结果
	
	public static void sum(int x,int y){
		System.out.println(x+"+"+y+"="+(x+y));
	}
	
	public static void reduce(int n,int m){
		System.out.println(n+"-"+m+"="+(n-m));
	}
}
