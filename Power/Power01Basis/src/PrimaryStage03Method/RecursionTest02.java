package PrimaryStage03Method;

public class RecursionTest02 {
/*	
	��ʹ�õݹ飬����1~n�ĺ�
*/
	
	public static void main(String[]args){
		System.out.println(sum(10));
		
/*		
		//1~10�ĺ�
		int n=10;
		int sum=0;
		for(int i=1;i<=10;i++){
			sum+=i;
		}
		System.out.println("sum="+sum);
*/	
	}
	
	//��װ����һ��������ʵϰһ�������Ĺ���
	public static int sum(int n){
		int result=0;
		for(int i=1;i<=n;i++){
			result+=i;
		}
		return result;
	}
	
}
