package Paramete01;

/**
 * �������ݣ�
 * 	������ֵ�ô��ݣ�ֻ���������ֵ����ʱ����һ������ֵ����ʱ����
 * 	�����Java������ڴ��ַ��
 * 
 * @author Jun
 */
public class Test01 {

	public static void main(String[] args) {
		User u = new User(10);
		//����u��add������ʱ��ʵ���ϴ��ݵ���u�����б����ֵ��ֻ�������ֵ��һ��Java������ڴ��ַ��
		add(u);
		System.out.println("main-->" + u.age);//11
	}

	public static void add(User u) {
		u.age++;
		System.out.println("add-->" + u.age);//11
	}
}

class User {

	// ʵ������
	int age;

	public User(int i) {
		age = i;
	}
}
