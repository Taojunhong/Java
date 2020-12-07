package KeysWord_this01;

public class ThisTest {
	
	//实例变量
	int i=10;
	
	public static void main(String[] args) {
		
		//System.out.println(i);//访问实例变量必须采用“引用.”的方式
		
		ThisTest tt=new ThisTest();
		System.out.println(tt.i);
		tt.run();
		
	}
	public void doOther(){
		//this 表示当前对象
		System.out.println("do Other!");
	}
	
	//run是实例方法，调用run方法的一定是有对象存在的。
	//一定是先创建了一个对象才能调用run方法
	public void run(){
		
		//在大括号中的代码执行过程当中一定“存在“当前对象”的
		//也就是说这里一定有“this”关键字的
		System.out.println("Run execute!");
		
		//doOther是一个实例方法，实例方法调用必须有对象的存在
		doOther();
		this.doOther();//比较完整的写法
	}

}
