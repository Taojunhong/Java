package PrimaryStage02Control;

public class ForTest01 
{
	public static void main(String[] args) {
	/*	
	 循环结构：
	  1.程序中需要反复执行的代码，将代码片段放到“循环体”中，联合“计数器”，来反复自行。
	  2.多数编程语言都支持循环机构
	  3.所有编程语言支持的循环包括三种：
	  	-- for循环
	  	-- while循环
	  	-- do..while循环
	  4.语法结构：
	  		4.1 初始化表达式，布尔表达式，更新表达式都不是必须的！但两个分号";"必须写上
	  		4.2 初始化表达式最先执行，并且只会执行一次。
	  		for( 初始化表达式;布尔表达式;更新表达式){
	  			需要执行的代码片段【循环体】
	  		}
	  5.for循环的执行原理：
	  		- 先执行初始化表达式，并且只执行一次。
	  		- 判断布尔表达式的结果是true还是false
	  			   - 布尔表达式为true
	  					则执行循环体
	  			   - 布尔表达式为false
	  					则循环结束
	*/
		int i;
		for(i=1;i<11;i++){
			System.out.printf("%d\t",i);
			System.out.println("i-->>"+i);
		}
		//i=11的时候，11>10,false，所以输出11
		System.out.println("i="+i);//11;
		
	}

}
