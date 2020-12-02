package myselfgame;

import java.util.Scanner;

public class MyselfGame {
	private Room currentRoom;

	public MyselfGame() {
		createRooms();
	}
		//�����ص�
	private void createRooms() {
		Room northGate, southGate, expertTown, specialistBedroom, undergraduateBebroom, oneCanteen, turn1, turn2;
		Room networkCollegeBuilding, undergraduateTeachingBuilding, Library, ManageteachingBuilding, crossroads4;
		Room SkunkLake, basketballCourt, Playground, girlsBedroom, pioneerTown, crossroads1, crossroads2, crossroads3;
		northGate = new Room("�����");
		southGate = new Room("�������");
		expertTown = new Room("ZJС��");
		crossroads1 = new Room("ʮ��·��1");
		specialistBedroom = new Room("ר������");
		undergraduateBebroom = new Room("��������");
		crossroads2 = new Room("ʮ��·��2");
		oneCanteen = new Room("һʳ��");
		networkCollegeBuilding = new Room("����ѧԺ��ѧ¥");
		undergraduateTeachingBuilding = new Room("���ƽ�ѧ¥");
		crossroads3 = new Room("ʮ��·��3");
		Library = new Room("ͼ���");
		ManageteachingBuilding = new Room("���ܽ�ѧ¥");
		crossroads4 = new Room("ʮ��·��4");
		SkunkLake = new Room("��ˮ��");
		basketballCourt = new Room("����");
		Playground = new Room("�ﾶ�˶���");
		turn1 = new Room("�����");
		girlsBedroom = new Room("Ů������");
		turn2 = new Room("�����");
		pioneerTown = new Room("XFС��");

		// ����ĳ�·
		northGate.setExits(null, expertTown, null, null);
		southGate.setExits(turn2, pioneerTown, null, null);
		expertTown.setExits(northGate, crossroads1, null, null);
		crossroads1.setExits(expertTown, crossroads2, undergraduateBebroom, specialistBedroom);
		crossroads2.setExits(crossroads1, undergraduateTeachingBuilding, networkCollegeBuilding, oneCanteen);
		undergraduateTeachingBuilding.setExits(crossroads2, crossroads3, null, null);
		crossroads3.setExits(undergraduateTeachingBuilding, crossroads4, ManageteachingBuilding, Library);
		crossroads4.setExits(crossroads3, Playground, SkunkLake, basketballCourt);
		turn1.setExits(Playground, null, girlsBedroom, null);
		turn2.setExits(null, southGate, null, turn1);
		pioneerTown.setExits(southGate, null, null, null);
		specialistBedroom.setExits(null, null, crossroads1, null);
		undergraduateBebroom.setExits(null, null, null, crossroads1);
		oneCanteen.setExits(null, null, crossroads2, null);
		networkCollegeBuilding.setExits(null, null, null, crossroads2);
		Library.setExits(null, null, crossroads3, null);
		ManageteachingBuilding.setExits(null, null, null, crossroads3);
		basketballCourt.setExits(null, null, crossroads4, null);
		SkunkLake.setExits(null, null, null, crossroads4);
		// �����ص�
		currentRoom = undergraduateTeachingBuilding; 

	}
	
		//�������
	private void goRoom(String direction) {
		Room nextroom = currentRoom.getExit(direction);
		if (nextroom == null) {
			System.out.println("����û����");
		} else {
			currentRoom = nextroom;
			newStand();
		}
	}

		//���ſ��ö�
	public void printWelcome() {
		System.out.println();
		System.out.println("��ӭ�������ѧ��ϣ����ȡ������ĳɼ���");
		System.out.println("�����ȥ���κεط���ֻҪ��������Ӧ��ָ�");
		System.out.println("���磺����Ҫȥ���ߣ����룺	go west");
		System.out.println("���������������:	help");
		newStand();
		System.out.println();
	}

		//�������Լ�����
	public void newStand() {
		System.out.println("��������" + currentRoom);
		System.out.print("������: ");
		System.out.println(currentRoom.getExitdesc());
		System.out.println();
	}

		//help�ֶκ���
	private void printhelp() {
		System.out.println("��·������������������У�go bye help");
		System.out.println("�磺\tgo east");
	}

	// ���Ƚ����˺������¼
	private String[] Xbox = { "1234567", "7654321" };

	public boolean Username(String username) {
		return Xbox[0].equals(username);
	}

	public boolean Password(String password) {
		return Xbox[1].equals(password);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		MyselfGame mg = new MyselfGame();
		String username;
		String password;
		int i = 0;
		System.out.println("��ʾ���˺�˳��1~7�����뵹��1~7");
		do {
			System.out.println("�˺ţ�");
			username = in.next();
			System.out.println("���룺");
			password = in.next();
			i++;
			if (mg.Username(username)) {
				if (mg.Password(password)) {
					System.out.println("you are right!\nWelcome.");
				} else {
					System.out.println("Error,please try :");
					System.out.println("-----------------------");
				}
			} else {
				System.out.println("Error,please try ��");
				System.out.println("-----------------------");
			}
			if (i >= 3) {
				System.out.println("please try again tomorrow!");
			}
		} while (!mg.Username(username) == true && !mg.Password(password) == true && i < 3);
		mg.printWelcome();

		while (true) {
			String line = in.nextLine();
			String[] words = line.split(" ");
			if (words[0].equals("help")) {
				mg.printhelp();
			}
			if (words[0].equals("go")) {
				mg.goRoom(words[1]);
			}
			if (words[0].equals("bye")) {
				System.out.println("ϣ�����������ܹ�����ѧ��һЩ�������ú�ѧϰ����Ȼ��Ҫ������ѧУ������");
				break;
			}
		}
		System.out.println("��л���Ĺ��٣��ټ���");
		in.close();

	}

}
