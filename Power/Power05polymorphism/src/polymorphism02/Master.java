package polymorphism02;

public class Master {

	/**
	 * ����ι��Сè
	 */
	//Master�����������һ�������Pet�������������ĳ���
	//��������̵ĺô��ǣ���϶ȵͣ���չ��ǿ��
	public void feed(Pet pet) {//����ת��  Pet pet =new petDog();
		System.out.println("--����ιʳ--");
		pet.eat();
	}

}
