package PrimaryStage03Method;

public class OverloadTest03 {
/*
	方法重载：
		1.方法重载又被称为：overload
		
		2.什么时候考虑使用方法重载？
			* 功能相似的时候，方法名可以相同
			   【但是，功能不同的时候，尽可能让方法名不相同】
			*
		3.什么条件满足之后构成了方法重载？
			*在同一类当中
			*方法名相同
			*参数列表不同
				--参数数量不同
				--参数顺序不同
				--参数类型不同
		4.方法重载和什么条件有关系，和什么没有关系？
			*方法重载和方法名+参数列表有关系
			*方法重载和返回值类型无关
			*方法重载和修饰符列表无关
*/	
	
	public static void main(String[]args){
		
		//调用
		m1(100);
		m1();
		
		m2(10,20.5);
		m2(10.99,2);
		
		m3(100);
		m3(10.2586);
		
	}
	
	//以下两个方法构成重载--参数数量不同
	public static void m1(){System.out.println("hello world!");}
	public static void m1(int a){System.out.println("hello m1-2");}
	
	//以下两个方法构成重载--参数顺序不同
	public static void m2(int a,double b){System.out.println("hello m2-1");}
	public static void m2(double a,int b){System.out.println("hello m2-2");}
	
	//以下两个方法构成重载--参数类型不同
	public static void m3(int a){System.out.println("hello m3-1");}
	public static void m3(double a){System.out.println("hello m3-2");}



}
