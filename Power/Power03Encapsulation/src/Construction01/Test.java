package Construction01;

public class Test {
	//姓名
	String name;
	
	//班级
	String idClass;
	
	//年龄
	int age;
	
	//无参构造方法
	public Test() {

	}

	//构造方法
	public Test(String s) {
		name = s;
	}
	
	//构造方法
	public Test(int age) {
		super();
		this.age = age;
	}

	//构造方法
	public Test(String idCla, int ag) {
		idClass = idCla;
		age = ag;
	}

	//构造方法
	public Test(String na, String idCla) {
		name = na;
		idClass = idCla;
	}

	//构造方法
	public Test(String na, String idCla, int ag) {
		name = na;
		idClass = idCla;
		age = ag;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getIdClass() {
		return idClass;
	}


	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


}
