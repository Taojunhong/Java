package AdvancedStage01;

public class _01面向对象__Java语言的核心机制 {
/*
	第三章：面向对象【Java语言的核心机制，最重要的内容，Java语言的特色】
		
		1.面向过程和面向对象的区别：
			
			--面向过程：主要关注点是：步骤
				--因果关系【集成显卡的开发思路】
				*优点：对于业务逻辑比较简单的程序，可以达到快速开发，前期投入成本低
			
				*缺点：采用面向过程的方式开发很难解决非常复杂的业务逻辑，
				     面向过程的方式导致软件元素之间的耦合度非常高，一环出错，
				     整个系统受到影响，扩展力差。
			
			--面向对象：主要关注点是：主要关注对象【独立体】能完成哪些功能。
				*优点：耦合度低，扩展力强。更容易解决现实世界中的更复杂的业务逻辑。组件复用性强
				
				*缺点：前期投入成本较高，需要进行独立体的抽取，大量的系统分析与设计。
			
			--独立显卡的开发思路
			
			--C语言是纯面向过程的，C++半面向对象，Java纯面向对象
		
		2.面向对象的三大特征
			--封装
			--继承
			--多态	
			
			所有面向对象的编程语言都有这三大特征
			
			采用面向对象的方式开发一个软件，生命周期当中：
				*面向对象的分析：OOA
				*面向对象的设计：OOD
				*面向对象的编程：OOP
				
		3.类和对象的概念：
			
			--什么是类？
				-类在现实世界当中是不存在的，是一个模板，是一个概念
				-类代表了一类事物 
				-在现实世界当中，对象A与对象B之间具有共同特征，进行抽象总结一个模板这个模板称为类
				
			--什么是对象？
				-对象是实际存在的个体，在现实世界当中实际存在
			
				类相当于模板，对象则是符合模版的个体·
				类--【实例化】-->对象
				对象又被称为实例
				对象--【抽象】-->类
				对象的抽象化为类
			
			--重点：
			 	类描述的是对象的共同特征
			 	共同特征例如：身高
			 	访问的时候，必须先要创建对象，通过对象去访问这个特征
			
			--一个类主要描述什么信息：
				主要描述的是： 特征 + 动作
				状态/特征信息：名字，身高，性别，年龄
				动作信息：吃，唱歌，跳舞，学习
				
			--类{
				属性：//描述对象的特征信息/状态信息
				方法：//描述对象的动作信息
			}
			
		4.类的定义：
		
			语法结构：
				[修饰符列表] class 类名 {
					属性；
					方法；
				}
			
			学生类，描述所有学生对象的共同特征：
				学生对象的状态信息：
					*学号【int】
					*名字【String】
					*性别
					*年龄
					*住址
					...
					
				学生对象的动作信息：
					*吃饭
					*睡觉
					*学习
					*玩
					...
			重点：属性通常采用一个变量的形式来完成定义。
		
		5.java语言中包括两种数据类型
			-基本数据类型：
				byte
				short
				int
				long
				float
				double
				boolean
				char
				
			-引用数据类型：
				程序员自定义的
*/	
}
//例子
class Students{
	//属性：【描述的是对象的状态信息】
	//在类体中，方法体中外定义的变量被称为“成员变量”。
	//成员变量没有赋值，系统默认赋值：一切向零看齐
	
	//学号
	int no;
	
	//姓名
	String name;
	
	//性别
	boolean sex;
	
	//年龄
	int age;
	
	//住址
	String address;
	
	
	//方法：
	//方法描述的是对象的动作信息
	
	
}
