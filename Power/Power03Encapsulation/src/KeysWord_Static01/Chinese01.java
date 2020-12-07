package KeysWord_Static01;

public class Chinese01 {
	
	//身份证号【每一个对象的身份证号不同】
	//实例变量
	String id;
	
	//姓名【每一个对象的姓名不同】
	//实例变量
	String name;
	
	//国籍【由于都是“Chinese”类，所以每一个对象的国籍都是中国】
	//实例变量
	String country;

	//构造方法
	public Chinese01() {

	}

	public Chinese01(String id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

}
