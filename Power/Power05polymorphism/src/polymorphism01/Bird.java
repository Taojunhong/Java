package polymorphism01;

//������
public class Bird extends Animal {

	public void fly(){
		System.out.println("Fly Bird!");
	}
	
	@Override
	public void move() {
		System.out.println("����ڷ��裡");
	}

}
