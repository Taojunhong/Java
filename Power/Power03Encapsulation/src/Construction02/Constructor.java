package Construction02;

/**
 *构造方法的作用：
 *		1.创建对象
 *		2.给实例变量赋值。 
 *
 *成员变量之实例变量，属于对象级别的变量，这种变量必须现有对象才能有实例变量。
 *实例变量没有手动赋值之前的时候，系统默认赋值，那么这个系统默认赋值是在什么时候完成的？
 *		-是在类加载的时候吗？
 *			-不是，因为类加载的时候只加载了代码片段，没来得及创建对象。所以此时实例变量并没有初始化
 *		实际上，实例变量的内存空间是在构造方法执行过程当中完成开辟的。完成初始化的。
 *		系统在默认赋值的时候，也是在构造方法执行过程当中完成的赋值。
 */

public class Constructor {
	
	public static void main(String[] args) {
		
		Account act1=new Account();
		
		System.out.println("账号："+act1.getActno());
		System.out.println("余额："+act1.getBalance());
		
		Account act2=new Account(10086.86);
		System.out.println("账号："+act2.getActno());
		System.out.println("余额："+act2.getBalance());
		
		Account act3=new Account("act-001");
		System.out.println("账号："+act3.getActno());
		System.out.println("余额："+act3.getBalance());
		
		Account act4=new Account(10010.3,"act-004");
		System.out.println("账号："+act4.getActno());
		System.out.println("余额："+act4.getBalance());
		 
		
	}
	
	

}
