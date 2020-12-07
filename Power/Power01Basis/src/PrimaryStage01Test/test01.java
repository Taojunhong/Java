package PrimaryStage01Test;

public class test01 {

//	static int k = 100;

	public static void main(String[] args) {
		int a, b, c = 20;
		// 一行定义多个变量，只有一个变量完成初始化，访问这个变量编译不会报错，访问其他变量就会报错（未初始化）
		a=0;
		b=5;
		System.out.println(c+b+a);

		int i = 10;
		System.out.println(i);
		// 程序会报错，不能这样写 定义两次同一变量
		// int i=30;
		i = 30;
		System.out.println(i);

//		System.out.println(k);
		
		int e;
		for(e=0;e<9;e++){
			
		}
		System.out.println(e);
	}

}
