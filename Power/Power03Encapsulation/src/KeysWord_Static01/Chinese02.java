package KeysWord_Static01;
/**
 * 静态变量：
 * 		1.静态变量在类加载的时候初始化，不需要创建对象，内存就开辟了。
 * 		2.静态变量存储在方法区内存当中。  
 * 关于java中的static关键字：
 * 		1.static英语翻译为：静态的
 * 		2.static修饰的方法是静态方法
 * 		3.static修饰的变量是静态变量
 * 		4.所有static修饰的元素都称为静态的都可以用“类名.”的方式访问，也可以用引用.的方式访问【但不建议】		
 * @author ASUS
 */
public class Chinese02 {

	//身份证号【每一个对象的身份证号不同】
		//实例变量
		String id;
		
		//姓名【每一个对象的姓名不同】
		//实例变量
		String name;
		
		//国籍【由于都是“Chinese”类，所以每一个对象的国籍都是中国】
		//设置为静态变量
		static String country="中国";

		//构造方法
		public Chinese02() {

		}

		public Chinese02(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
}
