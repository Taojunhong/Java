package PrimaryStage02Control;

public class IFTest01 { 
	/*
	IF 语句  属于选择结构，：
	if语句 只要有一个分支执行，整个语句全部结束
	 有四种编写方式
	第一种：
		if(布尔表达式){
			Java语句
			...
		}
	第二种：
		if(布尔表达式){
			Java语句
			...
		}else{
			Java语句
			...
		}
	第三种：
		if(布尔表达式){
			Java语句
			...
		}else if(布尔表达式){
			Java语句
			...
		}else if(布尔表达式){
			Java语句
			...
		}
		...
	第四种：
		if(布尔表达式){
			Java语句
			...
		}else if(布尔表达式){
			Java语句
			...
		}else if(布尔表达式){
			Java语句
			...
		}else{
			Java语句
			...
		}
		
		2.所有的控制语句都可以合理的嵌套使用
		
		3.if语句的分支中只有一条Java语句的话，大括号可以省略
		
	*/
	
	public static void main(String[] args) {
		int i = 3;
		if( i < 6 ){
			System.out.println("走，去KFC吃鸡腿，离这不远。");
		} 
		
	/*需求：
		系统给定一个考生成绩，成绩可能有小数点
		根据学生成绩判断该学生的成绩等级
			【90-100】A
			【80-90】B
			【70-80】C
			【60-70】D
			【0-60】E
			以上逻辑判断采用if语句
		*/
		//写法一
		double score=190.0;
		if(score>100||score<0){
			System.out.println("成绩不合法，请重新输入：");
		}else if(score>=90){
			System.out.println("成绩：A");
		}else if(score>=80){
			System.out.println("成绩：B");
		}else if(score>=70){
			System.out.println("成绩：C");
		}else if(score>=60){
			System.out.println("成绩：D");
		}else{
			System.out.println("成绩：E");
		}
		
		//写法二
		//score=2;
		String grade="成绩：E";
		if(score>100||score<0){
			grade="成绩不合法，请重新输入";
		}else if(score>=90){
			grade="成绩：A";
		}else if(score>=80){
			grade="成绩：B";
		}else if(score>=70){
			grade="成绩：C";
		}else if(score>=60){
			grade="成绩：D";
		}
		System.out.println(grade);
		
	}

}
