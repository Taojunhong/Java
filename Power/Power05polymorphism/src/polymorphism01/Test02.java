package polymorphism01;

public class Test02 {

	public static void main(String[] args) {
		
		//����������ָ�������Ͷ���
		//����ת��
		Animal a1 = new Cat();
		Animal a2 =new Bird();

		//����ת�͡�ֻ�е�����������������еķ�����
		if(a1 instanceof Cat){
			Cat c1=(Cat)a1;
			System.out.println(c1);
		}
		if(a2 instanceof Bird){
			Bird b1=(Bird)a2;
			System.out.println(b1);
		}
		
	}

}
