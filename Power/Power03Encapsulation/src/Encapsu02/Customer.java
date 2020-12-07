package Encapsu02;

public class Customer {

	private String name;
	private int age;
	private int shenGao;
	Goods goods;

	public Goods getGoodsName() {
		return goods;
	}

	public void setGoodsName(Goods gds) {
		goods = gds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0 || age > 100) {
			System.out.println("年龄不合法，请重试！");
			return;
		}
		this.age = age;
	}

	public int getShenGao() {
		return shenGao;
	}

	public void setShenGao(int shenGao) {
		this.shenGao = shenGao;
	}

	public String getYanZhi() {
		return yanZhi;
	}

	public void setYanZhi(String yanZhi) {
		this.yanZhi = yanZhi;
	}

	private String yanZhi;

}
