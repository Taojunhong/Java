package polymorphism02;

public class Master {

	/**
	 * 主人喂养小猫
	 */
	//Master主人面向的是一个抽象的Pet，不再面向具体的宠物
	//面向抽象编程的好处是，耦合度低，扩展力强。
	public void feed(Pet pet) {//向上转型  Pet pet =new petDog();
		System.out.println("--主人喂食--");
		pet.eat();
	}

}
