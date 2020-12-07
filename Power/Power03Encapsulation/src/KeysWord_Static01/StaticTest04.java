package KeysWord_Static01;

public class StaticTest04 {

	{
		System.out.println(1);
	}

	{
		System.out.println(2);
	}

	{
		System.out.println(3);
	}
	
	public StaticTest04(){
		System.out.println("类的缺省构造器");
	}

	public static void main(String[] args) {
		System.out.println("main begin");
		new StaticTest04();
	}

}
