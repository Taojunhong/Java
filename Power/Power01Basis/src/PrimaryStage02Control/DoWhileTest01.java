package PrimaryStage02Control;

public class DoWhileTest01 {

	public static void main(String[] args) {
		/*
		 do..while循环：
			1.do..while循环的语法结构：
				
				do{
					循环体
				}while(布尔表达式);
				
			2.do..while循环的执行原理：
				
			3.do..while循环的执行次数：
			
				do..while循环的循环体代码片段执行次数是1~N次，至少有一次
			
			4.使用do..while循环的注意事项：
				do..while循环语句最终有一个分号结尾；
		*/
		
		int i=10;
		//至少执行一次
		do{
			System.out.println(i);
		}while(i>100);
		
		System.out.println("-----------------");
		
		//先判断布尔表达式
		while(i>100){
			System.out.println("i-->"+i);
		}
	}

}
