package Extends04;

public class CarTest {
	public static void main(String[] args) {
		//车
		Car c=new Car();
		c.run();
		c.sit();
		c.load();
		
		//自行车
		Bike b=new Bike();
		b.run();
		b.sit();
		b.load();
		
		//货车
		Truck tck=new Truck();
		tck.run();
		tck.sit();
		tck.load();
		
		//火车
		Train tra=new Train();
		tra.run();
		tra.sit();
		tra.load();
	}

}
