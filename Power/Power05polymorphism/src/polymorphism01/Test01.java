package polymorphism01;

/**
 * 关于Java语言当中的多态语法机制：
 * 		1、Animal、Cat、Bird三个类之间的关系：
 * 			Cat继承Animal
 * 			Cat继承Animal
 * 			Cat和Bird之间没有任何继承关系
 * 
 * 		2、面向对象三大特征：封装、继承、多态
 * 
 * 		3、关于多态中涉及到的几个概念：
 * 			*向上转型(upcasting)
 * 				
 * 				子类型-->父类型
 * 				又被称为：自动类型转换。
 * 
 * 			*向下转型(downcastting)
 * 	
 * 				父类型--子类型
 * 				又被称为:强制类型转换。【需要加强制类型转换符】
 * 
 * 			*注意：
 * 				无论是向上转型还是向下转型，两种类型之间必须要有继承关系。
 * 
 * 
 *  * @author ASUS
 *
 */
public class Test01 {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.move();
		
		Cat c=new Cat();
		c.move();
		c.catchMouse();
		
		Bird b=new Bird();
		b.move();
		
		//使用多态语法机制
		/**
		 * 1、Animal和Cat之间存在继承关系，Animal是父类，Cat色子类
		 * 
		 * 2、Cat is a Animal【】
		 * 
		 * 3、new Cat()创建的对象的类型是Cat，a2这个引用的数据类型是Animal，可见他们进行了类型转换
		 * 子类型转换成父类型，称为向上转型/upcasting，或者称为自动类型转换。
		 * 
		 * 4、Java中允许这种语法：父类型引用指向子类型对象
		 */
		Animal a2=new Cat();
		/**
		 * 1、Java程序永远都分为编译阶段和运行阶段。
		 * 
		 * 2、先分析编译阶段，再分析运行阶段，编译无法通过，程序是无法执行的。
		 * 
		 * 3、编译阶段编译器检查a2这个引用的数据类型为Animal，由于Animal.class字节码当中有
		 * mova()方法，所以编译通过了。这个过程我们称为静态绑定，编译阶段绑定。只有静态绑定成功之后才会有后续的运行。
		 * 
		 * 4、在程序运行阶段，JVM堆内存当中真实创建的对象是Cat对象，那么以下程序在运行阶段
		 * 一定会调用Cat对象的mova()方法，此时发生了程序的动态绑定，运行阶段绑定。
		 * 
		 * 5、无论Cat类有没有重写move方法，运行阶段一定调用的是Cat对象，因为底层真是的对象就是Cat对象。
		 * 
		 * 6、父类型引用指向子类型对象这种机制导致程序存在编译阶段绑定和运行阶段绑定两种不同的形态。
		 */
		a2.move();
		
		/**
		 * 分析以下程序为什么不能调用：
		 * 		因为编译阶段编译器检查到a2的类型是Animal类型，
		 * 		从Animal.class字节码文件当中查找catchMouse()方法，
		 * 		最终没有找到该方法，导致静态绑定失败，没有绑定成功，
		 * 		也就是说编译失败了，就更不能运行了。
		 */
		//a2.catchMouse();
		
		/**
		 * 需求：
		 * 	假设想让以上对象执行catchMouse()方法，怎么办：
		 * 		a2是无法直接调用的，因为a2的类型是Animal，Animal中没有catchMouse()方法。
		 * 		我们可以将a2强制类型转换为Cat类型。
		 * 注意：向下转型也需要两种类型之间必须有继承关系。强制类型转换必须加强制类型转换符
		 * 
		 * 什么时候需要使用向下转型呢：
		 * 		当调用的方法是子类中特有的，父类中又不存在，就必须进行向下转型。
		 */
		Cat c2= (Cat)a2;
		c2.catchMouse();
		
		//父类型引用指向子类型对象【多态】
		Animal a3=new Bird();
		/**
		 * 1、以下程序编译是没有问题的，因为编译器检查到a3的数据类型是Animal
		 * Animal和Cat之间存在继承关系，并且Animal是父类型，Cat是子类型，
		 * 父类型转换成子类型叫做向下转型，语法合格。
		 * 
		 * 2、编译虽然通过了，但程序在运行阶段会出现异常。因为JVM堆内存当中真实存在
		 * 的对象是Bird类型，Bird对象无法转换成Cat对象。两种类型之间不存在任何继承关系，
		 * 此时会出现著名的异常：java.lang.ClassCastException
		 * 这种异常总是在“向下转型”的时候发生。
		 * 
		 * 3、向下转型编译通过，运行可能错误：Animal a3=new Bird(); Cat c3=(Cat)a3;
		 * 
		 * 4、怎么避免向下转型出现的java.lang.ClassCastException呢：
		 * 		使用instanceof运算符可以避免出现以上的异常。
		 * 
		 * 5、instanceof运算符的使用：
		 * 
		 * 		5.1、语法格式：
		 * 				(引用  instanceof 数据类型名)
		 * 
		 * 		5.2、以上运算符的执行结果类型是布尔类型，结果可能是true/false
		 * 
		 * 		5.3、关于运算符：
		 * 			假设：(a instanceof Animal)
		 * 			true表示：a这个引用指向的对象是一个Animal类型
		 * 			false表示：a这个引用指向的对象不是一个Animal类型。
		 * 	
		 * 6、Java规范中要求：在进行强制类型转换之前，建议采用instanceof运算符进行判断，
		 * 	    避免ClassCastException异常的发生
		 */
		//Cat c3=(Cat)a3;//ClassCastException
		
		if(a3 instanceof Cat){
			Cat c3=(Cat)a3;
			c3.catchMouse();
		}else if(a3 instanceof Bird){
			Bird b2=(Bird)a3;
			b2.fly();
		}
		
	}

}
