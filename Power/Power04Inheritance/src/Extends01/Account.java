package Extends01;

//银行账户类
public class Account {
	// 属性
	private String actno;
	private double balance;

	// 构造方法
	public Account() {

	}

	public Account(String actno, double balance) {
		this.actno = actno;
		this.balance = balance;
	}

	//setter and getter
	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
