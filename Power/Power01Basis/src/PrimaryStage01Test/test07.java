package PrimaryStage01Test;

public class test07 {
	
	//“ + ” 运算符   自左向右方向执行
	//1. 加法运算---两边数据都是数据，一定是进行加法运算
	//2.  字符串连接运算--- “ + ”两边只要有一个数据是字符串，这个加号一定会进行字符串连接运算，结果的类型还是字符串
	
	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println(a+b);//30
		System.out.println(a+"b");//10b
		System.out.println(10+20+"30");//3030
		System.out.println(10+(20+"30"));//102030
		System.out.println(10+(b+"30"));//102030
		
		//可得出结论：“ + ” 运算符   自左向右方向执行
		System.out.println("10+20="+a+b);//10+20=1020
		System.out.println("10+20="+b+a);//10+20=2010
		
		//动态方式输出   
		System.out.println("10+20="+(a+b));//10+20=30
		System.out.println(a+"+"+b+"="+(a+b));//10+20=30
		a=100;
		b=200;
		System.out.println(a+"+"+b+"="+(a+b));//100+200=300
		
		
		//String是基本数据类型， s 是变量名 ，“abc”是String类型的数据
		//String s="abc";
		//定义一个Strintg类型的变量,变量名username,赋值“zhangsan”
		String username="zhangsan";
		System.out.println("登陆成功，欢迎"+username+"回来~");

	}

}
