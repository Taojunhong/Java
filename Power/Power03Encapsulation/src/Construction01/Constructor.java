package Construction01;
/*
  关于Java类中的构造方法：
		1.构造方法又被称为构造函数/构造器/Construction
		2.构造方法语法结构：
			[修饰符列表] 构造方法名 (形式参数列表){
				构造方法体；
			}
		3.回顾普通方法的语法结构：
			[修饰符列表] 返回值类型 方法名 (形式参数列表){
				方法体；
			}
		4.对于构造方法来说，“返回值类型”不需要指定，并且也不能写void
		  只要写上void，那么这个方法就成为普通方法了。
	 	
	 	5.对于构造方法来说，构造方法的方法名必须和类名保持一致。

		6.构造方法的作用：
				构造方法存在的意义是，通过构造方法的调用，可以创建对象。
		
		7.构造方法的调用：
				-普通方法是这样调用的：方法修饰符中有static的时候：类名.方法名（实参列表）
									   方法修饰符列表中没有static的时候：引用.方法名（实参列表）
				-new 构造方法名（实参列表）
		8.构造方法调用执行之后，有返回值吗：
				每一个构造方法实际上执行结束之后都有返回值，但是这个“return 值;”这样的语句不需要写
				构造方法结束的时候Java程序自动返回值。
				并且返回值类型是构造方法所在类的类型。由于构造方法的返回值就是类本身，
				所以返回值类型不需要编写
		9.当一个类中没有定义过任何构造方法的话，系统默认提供一个无参的构造方法，这个构造方法叫缺省构造器
		
		10.当一个类显示的将构造方法定义出来了，那么系统则不再默认为这个类提供缺省构造器
		      建议开发中手动为当前类提供无参构造方法，因为这个方法太常用了。
	    
	    11.构造方法支持重载机制。
		
*/

public class Constructor {

	public static void main(String[] args) {
		
		Test t1=new Test();
		System.out.println("姓名："+t1.name);
		System.out.println("班级："+t1.idClass);
		System.out.println("年龄："+t1.age);
		System.out.println("-------------------");
		
		Test t2=new Test(20);
		System.out.println("姓名："+t2.name);
		System.out.println("班级："+t2.idClass);
		System.out.println("年龄："+t2.age);
		System.out.println("-------------------");

		
		Test t3=new Test("狗辅导");
		System.out.println("姓名："+t3.name);
		System.out.println("班级："+t3.idClass);
		System.out.println("年龄："+t3.age);
		System.out.println("-------------------");

		Test t4=new Test("NB001",20);
		System.out.println("姓名："+t4.name);
		System.out.println("班级："+t4.idClass);
		System.out.println("年龄："+t4.age);
		System.out.println("-------------------");
		
		Test t5=new Test("狗校长","NB001",20);
		System.out.println("姓名："+t5.name);
		System.out.println("班级："+t5.idClass);
		System.out.println("年龄："+t5.age);


	}

}
