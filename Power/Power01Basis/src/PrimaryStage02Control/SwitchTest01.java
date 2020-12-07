package PrimaryStage02Control;

public class SwitchTest01 {
	/*
	关于Switch语句
		1.switch语句也属于选择结构，也是分支语句
		
		2.switch语句的语法结构：
		
			switch(int或String的数值或变量){
				case int或String的数值或变量:
					java语句;
					...
					break;
				case int或String的数值或变量:
					java语句;
					...
					break;
				case int或String的数值或变量:
					java语句;
					...
					break;
				...
				default :
					java语句
					...
			}
		3.switch语句的执行原理：
			switch后面小括号当中的“数据”和case后面的“数据”进行一一匹配，
			且按照自上而下的顺序依次匹配，匹配成功则分支执行，
			
		4.case穿透现象：case匹配成功的分支执行，但分支没有写break，
		    下面的case都不会进行匹配而是直接执行
			
		5.任意一个分支遇到break;整个switch语句就结束了
		
		6.switch后面的（）中只能色int或者String类型的数据，不能是其他类型
		  但 byte，short，char也可以直接写到switch和case后面，以为它们可以进行自动类型转换
		  
		7.JDK6版本的，switch和擦色后面只能探测int类型，JDK7及以上版本的可以探测int或String类型的数据
		
		8.case可以合并：
			int i=1;
			switch(i){
				case 1: case 2: case 3: case 10:
					System.out.println("Test Code!");
			}
	
	*/
	public static void main(String[] args) {
		//long类型
		long a=100L;
		switch((int)a){}
		
		//byte类型
		byte b=10;
		switch(b){}
		
		//short类型
		short s=20;
		switch(s){}
		
		//char类型
		char c='A';
		switch(c){}
		
		//String类型
		String username="zhangsan";
		switch(username){}
		
		
		/*
		switch例子：
		接收用户输入
		1 表示星期一
		2 表示星期二
		...
		7 表示星期日		
		 */
		java.util.Scanner x=new java.util.Scanner(System.in);
		System.out.print("请输入数字：");
		int num=x.nextInt();
		switch(num){
			case 1: //case 0:合并
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default :
				System.out.println("Sorry,The number you entered is illegal.");
		}
		System.out.println("======================");
		
		//case 穿透
		switch(num){
		case 1:
			System.out.println("星期一");
			//break;
		case 2:
			System.out.println("星期二");
			//break;
		case 3:
			System.out.println("星期三");
			//break;
		case 4:
			System.out.println("星期四");
			//break;
		case 5:
			System.out.println("星期五");
			//break;
		case 6:
			System.out.println("星期六");
			//break;
		case 7:
			System.out.println("星期日");
			break;
		default :
			System.out.println("Sorry,The number you entered is illegal.");
	}
	}

}
