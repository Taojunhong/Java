package polymorphism02;

/**
 * ��̬��ʵ�ʿ����е����ã�����������ι������Ϊ����
 * 	1������������ι���������������Ҫ���г�����ࣺ
 * 		-���ˡ��ࡿ��
 * 			���˿���ι���������������ι���Ķ�����
 * 		-����ࡿ��
 * 			������ԳԶ��������Գ����гԶ������������
 * 	
 * 2����������̵ĺ��ģ�
 * 		������࣬Ȼ����ʵ����Ϊ���󣬸�һ��������ʹһ�£��ø�������Э��������Ϊһ��ϵͳ��
 * 	
 * 3����̬��������ʲô��
 * 		���ͳ������϶ȣ���߳������չ����	
 * @author ASUS
 */
public class Test {

	public static void main(String[] args) {
		
		Master xiaoMing = new Master();
		
		//Cat cat = new Cat();
		//xiaoMing.feed(cat);
		xiaoMing.feed(new Cat());
		
		//Dog dog = new Dog();
		//xiaoMing.feed(dog);
		xiaoMing.feed(new Dog());
		
		//Snake snake = new Snake();
		//xiaoMing.feed(snake);
		xiaoMing.feed(new Snake());
	}
	
}
