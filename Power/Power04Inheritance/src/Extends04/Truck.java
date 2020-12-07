package Extends04;

public class Truck extends Car{

	@Override
	public void run() {
		System.out.println("货车~能开~");
	}

	@Override
	public void sit() {
		System.out.println("货车~能载五个人~");
	}

	@Override
	public void load() {
		System.out.println("货车~能载两吨货~\n");
	}
	

}
