package PrimaryStage02Control;

public class IFTest02 {

	public static void main(String[] args) {
		//1.创建键盘扫描对象 
		java.util.Scanner s=new java.util.Scanner(System.in);
		//2.调用Scanner对象的next()方法开始接收键盘输入
		//从键盘输入年龄
		System.out.print("请输入你的年龄：");
		int age=s.nextInt();
		//System.out.println("age="+age);
		
		//根据逻辑进行判断
		String str="老年";
		if(age<0||age>150){
			str="你输入的年龄不合法，年龄必须在[0-150]之间";
		}else if(age<=5){
			str="幼儿";
		}else if(age<=10){
			str="少年";
		}else if(age<=18){
			str="青少年";
		}else if(age<=35){
			str="青年";
		}else if(age<=55){
			str="中年";
		}
		System.out.println(str);

	}

}
