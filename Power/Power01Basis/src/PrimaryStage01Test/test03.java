package PrimaryStage01Test;

public class test03 {

	public static void main(String[] args) {
		
		byte m=(byte)198;
		System.out.println(m);
		
		short s=32767;//编译通过
		//short t=32768;//编译报错
		System.out.println(s);
		
		char c=65534;
		c='a';
		System.out.println(c);
		//c=65536;编译报错
	
		// 可以直接赋值，SUN公司方便程序员编程
		
		
		
	}

}
