package polymorphism02;

/**
 * 多态在实际开发中的作用，以下以主人喂养宠物为例：
 * 	1、分析：主人喂养宠物这个场景需要进行抽象的类：
 * 		-主人【类】：
 * 			主人可以喂养宠物，所以主人有喂养的动作。
 * 		-宠物【类】：
 * 			宠物可以吃东西，所以宠物有吃东西这个动作。
 * 	
 * 2、面向对象编程的核心：
 * 		定义好类，然后将类实例化为对象，给一个环境驱使一下，让各个对象协作起来成为一个系统。
 * 	
 * 3、多态的作用是什么：
 * 		降低程序的耦合度，提高程序的扩展力。	
 * @author ASUS
 */
public class Test {

	public static void main(String[] args) {
		
		Master xiaoMing = new Master();
		
		//Cat cat = new Cat();
		//xiaoMing.feed(cat);
		xiaoMing.feed(new Cat());
		
		//Dog dog = new Dog();
		//xiaoMing.feed(dog);
		xiaoMing.feed(new Dog());
		
		//Snake snake = new Snake();
		//xiaoMing.feed(snake);
		xiaoMing.feed(new Snake());
	}
	
}
