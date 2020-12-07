package KeysWord_this03;

public class Test {
	
	int i=10;

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.i);
		
		doOther();
		//t.doOther();//带static关键字的方法允许使用“引用.”的方式调用，但会出现警告
		t.doSome();
		
	}
	
	public static void doOther(){
		System.out.println("do Other!");
	}
	
	public void doSome(){
		System.out.println("do Some!");
	}

}
