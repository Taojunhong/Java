package PrimaryStage03Method;

public class MethodTest06 {
	
	//返回值类型不是void的时候
	
	//返回两个int类型的数据的商，要求将最终的计算结果返回给调用者
	
	//返回值类型不是void的时候，要求方法必须要执行“ return 值 ”这个语句

	public static void main(String[] args) {
		//调用方法
		shang(4,2);
		//接收数据，采用变量接收
		int i=shang(10,2);
		System.out.println(i);
		
		long x=shang(10,5);
		System.out.println(x);
		
		//输出接收
		System.out.println(shang(100,10));
	}
	
	//一个方法有返回值的时候，当我们调用这个方法的时候，
	//方法返回了一个值，对于调用者来说，这个值可以选择接收或者不接收
	//大部分情况下我们都是选择接收
	
	public static int shang(int a,int b){
		//System.out.println("hello!");
		return a/b;
	}

}
