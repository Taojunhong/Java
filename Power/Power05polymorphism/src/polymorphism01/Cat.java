package polymorphism01;

//猫科类
public class Cat extends Animal {
	
	public void move() {
		System.out.println("猫在走猫步！");
	}
	
	public void catchMouse(){
		System.out.println("猫会抓老鼠！");
	}

}
