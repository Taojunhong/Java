package KeysWord_Static01;
/**
 * 可以使用static关键字来定义“静态代码块”：
 * 		1.语法格式：
 * 			static{
 * 				java语句；
 * 			}
 * 		2.静态代码块在类加载的时候执行，并且只执行一次。
 * 
 * 		3.静态代码块在一个类中可以编写多个，并且遵循自上而下的顺序依次执行
 * 
 * 		4.静态代码块的作用：静态代码块是Java为程序员准备的一个特殊时刻，这个
 * 		  特使时刻被称为类加载时刻。若希望在此刻执行一段特殊的程序，就可以放到静态代码块当中
 * @author ASUS
 */

public class StaticTest03 {
	
	static{
		System.out.println("类加载-->>1");
	}
	static{
		System.out.println("类加载-->>2");
	}
	static{
		System.out.println("类加载-->>3");
	}
	
	public static void main(String[] args) {
		System.out.println("main begin!");
	}

}
