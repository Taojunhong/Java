package PrimaryStage01Test;

public class test06 {

	public static void main(String[] args) {
		System.out.println("Horldworld~");
		int a = 020;// 8进制
		int b = 0x30;// 16进制
		int c = 40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// 运算符
		// = += -= *= /= %=
		// 复制列运算符优先级：先执行等号右边的表达式，再将执行结果赋给到等号左边
		int i = 10;
		i = i + 10;
		System.out.println(i);// 20

		i += 5;// 等同于i=i+5
		System.out.println(i);// 25

		i -= 5;// 等同于i=i-5
		System.out.println(i);// 20

		i *= 4;// 等同于i=i*4
		System.out.println(i);// 80

		i /= 4;// 等同于i=i/4
		System.out.println(i);// 20

		i %= 3;// 等同于i=i%3
		System.out.println(i);// 2
		System.out.println("----------------");

		byte k = 10;
		// k=k+10; 编译报错，k+10表达式为int类型，k为Byte类型，int类型大于byte类型，不能自动转换,要加强制类型转换符
		k = (byte) (k + 10);

		byte j = 0;
		j += 10;// 编译通过 等同于j=(byte)(j+10);
		System.out.println(j);
		//得出结论：i+=10与i=i+10有区别
		j+=1000;
		System.out.println(j);//强转之后损失精度
		
		//扩展类的赋值运算符不改变运算结果类型
		byte x=10;
		int m=20;
		m+=x;//等同于m=(int)(m+n);
		System.out.println(m);

	}

}
