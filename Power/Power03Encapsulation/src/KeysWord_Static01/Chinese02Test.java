package KeysWord_Static01;

public class Chinese02Test {

	public static void main(String[] args) {
		// 创建对象
		Chinese02 zhangsan = new Chinese02("1", "张三");
		System.out.println(zhangsan.id + "," + zhangsan.name + "," + Chinese02.country);

		Chinese02 lisi = new Chinese02("2", "李四");
		System.out.println(lisi.id + "," + lisi.name + "," +Chinese02.country);

	}

}
