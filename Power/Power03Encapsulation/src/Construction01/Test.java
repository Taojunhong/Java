package Construction01;

public class Test {
	//����
	String name;
	
	//�༶
	String idClass;
	
	//����
	int age;
	
	//�޲ι��췽��
	public Test() {

	}

	//���췽��
	public Test(String s) {
		name = s;
	}
	
	//���췽��
	public Test(int age) {
		super();
		this.age = age;
	}

	//���췽��
	public Test(String idCla, int ag) {
		idClass = idCla;
		age = ag;
	}

	//���췽��
	public Test(String na, String idCla) {
		name = na;
		idClass = idCla;
	}

	//���췽��
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
