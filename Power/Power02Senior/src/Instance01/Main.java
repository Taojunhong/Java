package Instance01;

public class Main {
/*	
	对象的创建和使用
*/
	public static void main(String[]args){
		//int 是基本数据类型
		//i是一个变量名
		//10是int类型的字面值
		//int i=10;
		
		//通过一个类可以实例化N个对象
		//实例化对象语法：new 类名 ();
		//new 是Java语言当中的一个运算符，作用是创建对象
		//在JVM堆内存当中开辟新的内存空间
		//方法区内存：在类加载的时候，class字节码代码片段被加载到新的内存空间
		//栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈
		//堆内存：new的对象在堆内存中存储
		//Student是一个引用数据类型
		//s是一个变量名
		//new Student()是一个学生对象
		//s是一个局部变量【在栈内存中存储】
		//什么是对象？new运算符在堆内存中开辟的内存空间叫做对象
		//什么是引用？引用是一个变量，这个变量保存了一个空间地址
		
		Student s =new Student();
		
		//访问实例变量的语法格式：
		//读取数据：引用.变量名
		//修改数据：引用.变量名=值
		
		//读取
		int stuNo=s.no;
		String stuName=s.name;
		int stuAge=s.age;
		boolean stuSex=s.sex;
		String stuAddr=s.addr;
		
		//打印
		System.out.println(stuNo);
		System.out.println(stuName);
		System.out.println(stuAge);
		System.out.println(stuSex);
		System.out.println(stuAddr);
		System.out.println("------------");
		
		//修改
		s.no=10;
		s.name="张三";
		s.age=20;
		s.sex=true;
		s.addr="北京";
		
		//打印
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.sex);
		System.out.println(s.addr);
	}
	
}



















