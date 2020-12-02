package myselfgame;

import java.util.Scanner;

public class MyselfGame {
	private Room currentRoom;

	public MyselfGame() {
		createRooms();
	}
		//创建地点
	private void createRooms() {
		Room northGate, southGate, expertTown, specialistBedroom, undergraduateBebroom, oneCanteen, turn1, turn2;
		Room networkCollegeBuilding, undergraduateTeachingBuilding, Library, ManageteachingBuilding, crossroads4;
		Room SkunkLake, basketballCourt, Playground, girlsBedroom, pioneerTown, crossroads1, crossroads2, crossroads3;
		northGate = new Room("软大北门");
		southGate = new Room("软大南门");
		expertTown = new Room("ZJ小镇");
		crossroads1 = new Room("十字路口1");
		specialistBedroom = new Room("专科宿舍");
		undergraduateBebroom = new Room("本科宿舍");
		crossroads2 = new Room("十字路口2");
		oneCanteen = new Room("一食堂");
		networkCollegeBuilding = new Room("网络学院教学楼");
		undergraduateTeachingBuilding = new Room("本科教学楼");
		crossroads3 = new Room("十字路口3");
		Library = new Room("图书馆");
		ManageteachingBuilding = new Room("经管教学楼");
		crossroads4 = new Room("十字路口4");
		SkunkLake = new Room("臭水湖");
		basketballCourt = new Room("篮球场");
		Playground = new Room("田径运动场");
		turn1 = new Room("右弯道");
		girlsBedroom = new Room("女生宿舍");
		turn2 = new Room("左弯道");
		pioneerTown = new Room("XF小镇");

		// 房间的出路
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
		// 出生地点
		currentRoom = undergraduateTeachingBuilding; 

	}
	
		//房间出口
	private void goRoom(String direction) {
		Room nextroom = currentRoom.getExit(direction);
		if (nextroom == null) {
			System.out.println("那里没有门");
		} else {
			currentRoom = nextroom;
			newStand();
		}
	}

		//相信看得懂
	public void printWelcome() {
		System.out.println();
		System.out.println("欢迎来到软大学，希望你取得优异的成绩。");
		System.out.println("你可以去往任何地方，只要你输入相应的指令：");
		System.out.println("例如：你想要去西边，输入：	go west");
		System.out.println("如需帮助，请输入:	help");
		newStand();
		System.out.println();
	}

		//出生地以及出口
	public void newStand() {
		System.out.println("现在你在" + currentRoom);
		System.out.print("出口有: ");
		System.out.println(currentRoom.getExitdesc());
		System.out.println();
	}

		//help字段函数
	private void printhelp() {
		System.out.println("迷路了吗，你可以做的命令有：go bye help");
		System.out.println("如：\tgo east");
	}

	// 首先进行账号密码登录
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
		System.out.println("提示：账号顺序1~7，密码倒序1~7");
		do {
			System.out.println("账号：");
			username = in.next();
			System.out.println("密码：");
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
				System.out.println("Error,please try ：");
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
				System.out.println("希望这趟旅行能够让你学到一些东西，好好学习，不然就要来这种学校！！！");
				break;
			}
		}
		System.out.println("感谢您的光临，再见！");
		in.close();

	}

}
