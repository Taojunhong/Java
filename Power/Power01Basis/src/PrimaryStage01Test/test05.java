package PrimaryStage01Test;

public class test05 {

	public static void main(String[] args) {
		
		//逻辑与&
		int m=10;
		int n=5;
		System.out.println(n>m & ++n>m);//flase
		System.out.println(n);//输出为6
		
		//短路与&&
		int j=10;
		int k=5;
		System.out.println(k>j && ++k>j);//flase
		System.out.println(k);//输出为5
		
		System.out.println("--------------------");
		System.out.println("\u4e0d,\u4e1d,\u4e2d,\u4e3d,\u4e4d");//Unicode编码
		System.out.println("--------------------");
		
		
		//逻辑或 |
		int g=10;
		int h=20;
		System.out.println(g<h | ++g<h);//true
		System.out.println(g);//输出为11
		
		//短路或||
		int t=10;
		int p=20;
		System.out.println(t<p || ++t<p);//true
		System.out.println(t);//输出为10
		
	}

}
