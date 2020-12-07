package KeysWord_Static01;

public class Chinese01Test {

	public static void main(String[] args) {
		
		//创建对象
		Chinese01 zhangsan=new Chinese01("12","张三","中国");
		System.out.println(zhangsan.id+","+zhangsan.name+","+zhangsan.country);
	
		Chinese01 lisi=new Chinese01("10","李四","中国");
		System.out.println(lisi.id+","+lisi.name+","+lisi.country);
	}

}
