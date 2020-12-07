package PrimaryStage02Control;

public class SwitchTest03 
{
	public static void main(String[] args){
		/*
		实现计算器当中的 
		+	-	*	/	%
		思路：
		1.选择所有数据从键盘输入
		2.使用switch语句进行判断
		3.需要从控制台输入三次
			*第一个数字
			*运算符
			*第二个数字
		例如：
		请输入第一个数字：10
		请输入运算符：+
		请输入第三个数字：20
		运算结果：10+20=30			
		*/
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.println("欢迎使用简单计算器");
		System.out.print("请输入第一个数字：");
		int num1=s.nextInt();
		System.out.print("请输入运算符：");
		char ch=s.next().charAt(0);
		System.out.print("请输入第三个数字：");
		int result=0;
		int num2=s.nextInt();
		switch(ch){
			case '+':
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			case '%':
				result=num1%num2;
				break;
			default :
				System.out.println("输入不合法，请重新输入！");
		}
		System.out.println("运算结果："+num1+ch+num2+"="+result);
	}

}
