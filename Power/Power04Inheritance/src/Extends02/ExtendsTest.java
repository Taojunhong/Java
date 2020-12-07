package Extends02;

public class ExtendsTest {

	public static void main(String[] args) {

		C c=new C();
		c.doSome();
		
	}

}

class A{
	public void doSome(){
		System.out.println("do some!");
	}
}

class B extends A{
	
}

class C extends B{
	
}