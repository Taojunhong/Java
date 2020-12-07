package PrimaryStage02Control;

public class KeyInputTest01 {
	/*
	System.out.println();负责向控制台输出【从内存到控制台，从内存出来】
	接收用户键盘输入
	*/
	public static void main(String[] args) {
		//1.创建键盘扫描对象 
		java.util.Scanner s=new java.util.Scanner(System.in);
		//2.调用Scanner对象的next()方法开始接收键盘输入
		//从键盘输入
		String userInputContent=s.next();
		
		//将输入的内容输出
		System.out.println("你输入的是："+userInputContent);
		
		//输入数字
		int numInput=s.nextInt();
		
		//将输入的内容输出
		System.out.println("你输入的是："+numInput);

	}

}
