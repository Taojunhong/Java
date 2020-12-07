package PrimaryStage03Method;

public class RecursionTest02 {
/*	
	不使用递归，计算1~n的和
*/
	
	public static void main(String[]args){
		System.out.println(sum(10));
		
/*		
		//1~10的和
		int n=10;
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
*/	
	}
	
	//封装定义一个方法，实习一个独立的功能
	public static int sum(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	
}
