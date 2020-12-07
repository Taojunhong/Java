package PrimaryStage01Test;

public class test08 {
	/*
	三元运算符/三目运算符/条件运算符
	 1.语法规则：
	 	布尔表达式  ？ 表达式1：表达式2；
	
	 2.三元运算符的执行原理：
	 	当布尔表达式为true，执行结果为表达式1
	 	当布尔表达式为false，执行结果为表达式2
	 */
	public static void main(String[] args) {
		boolean sex=false;
		char c=sex ? '男':'女';
		System.out.println(c);//女
		System.out.println(c=sex ? '男':'女');//女
		
	}

}
