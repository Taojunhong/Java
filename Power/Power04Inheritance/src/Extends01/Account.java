package Extends01;

//�����˻���
public class Account {
	// ����
	private String actno;
	private double balance;

	// ���췽��
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
