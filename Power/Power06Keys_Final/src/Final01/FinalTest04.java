package Final01;

/**
 * 	1、final修饰的实例变量是不可变的的，这种变量一般和static联合使用，被称为“常量”
 * 	2、常量的定义语法格式：
 * 		public static final 类型 常量名 = 值；
 * 	3、java规范中要求所有常量的名字全部大写，每个单词之间使用下划线连接
 * @author ASUS
 *
 */
public class FinalTest04 {

	static String GUO_JI="中国";
	
	public static void main(String[] args) {
		
		System.out.println(GUO_JI);

	}

}
