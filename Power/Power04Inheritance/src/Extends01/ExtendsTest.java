package Extends01;

/**
 * 关于Java语言的当中的继承：
 * 		1.继承是面向对象的三大特征之一，三大特征分别是：封装，继承，多态
 * 		
 * 		2.继承“基本”的作用是：代码复用。但继承最“重要”的作用是：有了继承才有以后的方法覆盖和多态机制
 * 		
 * 		3.继承语法格式：
 * 			[修饰符列表] class 类名 extends 父类名{
 * 				类体；
 * 			}
 * 		
 * 		4.Java语言当中的继承只支持单继承，一个类不能同时继承多类。
 * 		
 * 		5.关于继承中的一些术语：
 * 			B类继承A类，其中：
 * 				A类称为：父类、基类、超类、superclass
 * 				B类称为：子类、派生类、subclass
 * 		
 * 		6.在Java语言中子类继承父类都继承那些数据呢？
 * 			-私有的不支持继承
 * 			-构造方法不支持继承
 * 			-其他数据都可以被继承
 * 		
 * 		7.虽然Java语言只支持单继承，但是一个类也可以简介继承其他类，例如：
 * 			C extends B{
 * 			}
 * 			B extends A{
 * 			}
 * 			A extends T{
 * 			}
 * 			C类直接继承B类，但间接继承了 T、A类
 * 			
 * 		8.Java语言中如果一个类没有显示继承任何类，该类默认继承JavaSE库当中提供的java.lang.Object类。
 * 
 * @author ASUS
 *
 */
public class ExtendsTest {

	public static void main(String[] args) {

		/*ExtendsTest ee=new ExtendsTest();
		String s=ee.toString();
		System.out.println(s);*/
		
		CreditAccount act=new CreditAccount();
		act.setActno("act-10086");
		act.setBalance(-10010.86);
		act.setCredit(-80);
		
		System.out.println("账号："+act.getActno()+"\n余额："+act.getBalance()+"\n信用："+act.getCredit());
	}

}
