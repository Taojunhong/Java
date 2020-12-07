package Encapsu01;
/*
 * 用户测试类
 * 
 * 面向对象包括三大特征：
 * 	-封装
 * 	-继承
 * 	-多态
 * 
 * 封装的好处：
 * 	1.封装之后，对于那个事务来说，看不到事务复杂的一面，
 * 	     复杂性封装，对外提供简单的操作入口。
 * 
 * 	2.封装之后才会形成真正的“对象”，真正的独立体。
 * 
 * 	3.封装就意味着程序以后可以重复使用。
 * 
 * 	4.封装之后，对于事物本身，提高了安全性。
 * 
 * 封装的步骤：
 * 	1.所有属性私有化，使用private关键字进行修饰，private表示私有的
 * 	  修饰的所有数据只能在本类中访问
 * 	2.对外提供简单的操作入口，也就是说以后外部程序想要访问age属性，
 * 	   必须通过这些简单的入口进行访问：
 * 		-对外提供两个公开的方法，分别是set方法和get方法
 * 		-想修改age属性，调用set方法
 * 		-想读取age属性，调用get方法
 * 	3.set方法的命名规范：
 * 		public void setAge（int a）{
 * 			age=a;
 * 		}
 * 	4.get方法的命名规范：
 * 		public void getAge (){
 * 			return age;
 * 		}
 * 	
 * 5.调用：
 * 
 * 	*setter和getter方法没有static关键字
 * 	*有static关键字修饰的方法调用：类名.方法名(实参);
 * 	*没有static关键字修饰的方法调用：引用.方法名(实参);
 * 
 */
public class UserTest {

	public static void main(String []args){
		
		//创建对象
		User user=new User();
		
		//访问age
		System.out.println("年龄："+user.getAge());
		
		//修改age
		user.setAge(20);
		
		//访问age
		System.out.println("年龄："+user.getAge());
	}
}
