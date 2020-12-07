package PrimaryStage03Method;

public class MethodTest08 {

/*
	在返回值类型是void的方法当中使用“return;”语句
	“return”语句出现返回值为void的方法中主要是为了用来结束当前方法
*/
	
	public static void main(String[]args){
		m();
		n();
	}
	
	//编译错误：对于结果类型为空的方法，无法返回值
	/*
	public static void m(){
		return 10;  返回值类型是void不能返回值
	}
	*/
	
	public static void m(){
		return;
	}
	
	public static void n(){
		for(int i=0;i<10;i++){
			if(i==5){
				return;//return的作用就是结束n()方法
			}
			System.out.println("i-->"+i);
		}
		System.out.println("hello!");
	}
	
	
}
