package Extends03;

/**
 * 关于Java语言当中方法的覆盖：
 * 
 * 		1、方法覆盖又被称为方法重写，英语单词：override【官方的】/overrite
 * 
 * 		2、什么时候使用方法重写：
 * 			当 父类中的方法已经无法满足当前子类的业务需求时，
 * 			子类有必要将父类中继承过来的方法进行重新编写
 * 			这个重写的过程叫做方法重写或者方法覆盖
 * 
 * 		3、代码满足什么条件之后，构造方法覆盖：
 * 			*方法重写发生在具有继承关系的父子类之间。
 * 			*方法重写的时候：返回值类型要相同，方法名相要同，形参列表要相同。
 * 			*方法重写的时候：访问权限不能更低，可以更高。【指的是public】
 * 			*方法重写的时候：抛出异常不能更多，可以更少。
 * 
 * 		4、注意：
 * 			覆盖只针对方法，不针对属性。
 * 			私有方法不能继承，所以不能覆盖。
 * 			构造方法不能继承，所以不能覆盖。
 * 			静态方法不存在覆盖。
 * @author ASUS
 *
 */
public class OverrideTest01 {
	
	public static void main(String[] args) {
		
		//创建动物对象
		Animal a=new Animal();
		a.move();
		
		//创建猫科类
		Cat c =new Cat();
		c.move();
		
		//创建飞禽类
		Bird b=new Bird();
		b.move();
		
		MaQue m=new MaQue();
		m.move();
	}

}
