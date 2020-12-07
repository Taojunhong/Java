package Extends04;

public class Train extends Car{

	@Override
	public void run() {
		System.out.println("火车~能开~");
	}

	@Override
	public void sit() {
		System.out.println("火车~能载1000个人~");
	}

	@Override
	public void load() {
		System.out.println("火车~不能载货~\n");
	}

	

}
