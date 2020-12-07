package Extends01;

//信用账户类
public class CreditAccount extends Account{
	// 属性
	/*private String actno;
	private double balance;*/
	private double credit;
	
	//构造方法
	public CreditAccount() {

	}

	/*public CreditAccount(String actno, double balance, double credit) {
		this.actno = actno;
		this.balance = balance;
		this.credit = credit;
	}*/
	
	//方法
	/*public String getActno() {
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
	}*/

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}
	
	
}
