package Java01.ShangKe;

public class Students extends Arrived {

	private int id;
	private String name;
	private String sex;

	public Students() {

	}

	public Students(int id, String name, String sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}

	public void arrived() {
		if (this.id % 2 == 0) {
			System.out.println("##  �ҵ��ˣ�  ##");
		} else {
			if(this.sex.equals("��")){
				System.out.println("##  sorry! "+getName()+" ����û��  ##");
			}else{
				System.out.println("##  sorry! "+this.name+" ����û��  ##");
			}
			
		}
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
