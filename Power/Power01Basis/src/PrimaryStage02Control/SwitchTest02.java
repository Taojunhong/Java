package PrimaryStage02Control;

public class SwitchTest02 {

	public static void main(String[] args) {
		java.util.Scanner s=new java.util.Scanner(System.in);
		System.out.print("���������ڼ���");
		String str=s.next();
		//switch����Է��ַ���
		switch(str){
			case "����һ":
				System.out.println(1);
				break;
			case "���ڶ�":
				System.out.println(2);
				break;
			case "������":
				System.out.println(3);
				break;
			case "������":
				System.out.println(4);
				break;
			case "������":
				System.out.println(5);
				break;
			case "������":
				System.out.println(6);
				break;
			case "������":
				System.out.println(7);
				break;	
			default :
				System.out.println("Sorry,The number you entered is illegal.");
		}
		
		
		
		

	}

}
