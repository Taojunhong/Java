package Extends04;

public class Bike extends Car {

	@Override
	public void run() {
		System.out.println("自行车~能骑~");
	}

	@Override
	public void sit() {
		System.out.println("自行车~能载一个人~");
	}

	@Override
	public void load() {
		System.out.println("自行车~不能载货~\n");
	}
	

}
