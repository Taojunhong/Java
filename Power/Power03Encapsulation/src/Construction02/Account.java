package Construction02;

//�˻���
public class Account {

	// �˺�
	private String actno;

	// ���
	private double balance;

	// �޲ι��캯��
	public Account() {
		// ��ʼ��ʵ���������ڴ�ռ�
		// actno=null;
		// balance=0.0;
	}

	//���캯��
	public Account(double d) {
		balance=d;
	}

	//���캯��
	public Account(String s) {
		actno=s;
	}

	//���캯��
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
