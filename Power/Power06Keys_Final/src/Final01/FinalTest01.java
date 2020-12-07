package Final01;

/**
 * 关于Java语言当中final关键字：
 * 		1、final是一个关键字，表示最终的，不可变的。
 * 		2、final修饰的类无法被继承
 * 		3、final修饰的方法无法被覆盖
 * 		4、final修饰的变量一旦赋值之后，不可二次赋值
 * 		5、final修饰的实例变量必须手动赋值
 * 		6、final修饰的引用
 * @author ASUS
 * 
 * 对于以后学习的类库，一般包括三个部分：
 * 		-源码 【可以通过看源码来理解程序】
 * 		-字节码 【程序开发的过程中使用的就是这部分】
 * 		-帮助文档 【】
 */

public class FinalTest01 {

	public static void main(String[] args) {
		String newString = "abcadfarahfaafbf".replaceAll("a", "x");
		System.out.println(newString);
	}

}
