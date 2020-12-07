package PrimaryStage01Test;

public class test04 {

	public static void main(String[] args) {
		/*
		 关于基本数据类型之间的相互转换：转换规则
		     8种基本数据类型：byte short int long float double boolean char   1 2 4 8 4 8 1 2
		 	1.八种基本数据类型当中除布尔类型之外剩下的7种数据类型之间都可以相互转换
		 	2，小容量向大容量转换，称为自动转换，容量从小到大排序：
		 		byte < short < int < long < float < double
		 			   char  <
		 	注：任何浮点类型不管占多少个字节，大欧比整数型容量大。
		 	3，大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，但是在运行阶段可能会损失精度，要谨慎使用。
		 	4，当整数数值没有超出Byte，Short，Char的取值范围，可以直接赋值给Byte类型的变量
		 	5，Byte，Short，Char混合运算的时候，各自先转换成ing类型再做运算。
		 	6，多种数据类型混合运算，先转换成容量最大的那种类型再做运算。
		 	
		 			   	
		 */
		byte y=4;
		short s=10;
		char h=65535;
		int a=y+s+h;
		System.out.println(a);//65549
		
		
		double g=10;
		byte b=(byte) (int)(g/3);
		System.out.println(b);//3
		
		
		short i=10;
		byte t=5;
		//short n=i+t;类型不匹配
		int k=i+t;
		System.out.println(k);//15
		
		int m=100;
		System.out.println(m++);//输出为100
		System.out.println(m);//输出为101
		System.out.println(--m);//100
		System.out.println(m--);//100
		System.out.println(m--);//99
		System.out.println(m--);//98
		System.out.println(++m);//98
		
	}

}
