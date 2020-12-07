package PrimaryStage01Test;

public class test02 {

	public static void main(String[] args) {
		char a='a';
		System.out.println(a);
		
		//字符串必须对应字符串，双引号字符串，单引号字符型
		//char b="b";
		char b='h';
		System.out.println(b);
		
		System.out.println("******************");
		char xx='\u0000';
		System.out.println(xx+1);
		
		int c=12;//12
		int d=023;//19
		int e=0x34;//52
		System.out.println(c+d+e);//83
		
		long f=456;
		System.out.println(f);
		
		long g=2147483647;//int最大的数值
	//	long g=2147483648;超出int的数值范围，报错
		System.out.println(g);
		
		long h=2147483648L;//在数据后加L表示为long类型
		System.out.println(h);
		
		
		System.out.println("---------------------");
		//强制类型转换需要加“强制类型转换符”
		//强制类型转换符之后编译通过，但运行阶段可能会损失精度
		//所以强制类型转换需谨慎使用
		//强转原理：将左边的4个字节砍掉，只取后边字节
		long j=555586622445225L;
		System.out.println(j);
		int k=(int)j;
		System.out.println(k);
		
		
		//byte 只占1个字节，但50，127都没有报错，原因：SUN公司对byte的优待
		//方便程序员，而128报错，说明只能有2个字节
		System.out.println("---------------------");
		byte m=50;
		System.out.println(m);
		byte n=127;
		System.out.println(n);
//		byte o=128;
//		System.out.println(o);
	}

}
