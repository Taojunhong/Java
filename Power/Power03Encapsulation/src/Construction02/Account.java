package Construction02;

//账户类
public class Account {

	// 账号
	private String actno;

	// 余额
	private double balance;

	// 无参构造函数
	public Account() {
		// 初始化实例变量的内存空间
		// actno=null;
		// balance=0.0;
	}

	//构造函数
	public Account(double d) {
		balance=d;
	}

	//构造函数
	public Account(String s) {
		actno=s;
	}

	//构造函数
	public Account(double d,String s) {
		actno=s;
		balance=d;
	}

	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double ballance) {
		this.balance = ballance;
	}

}
