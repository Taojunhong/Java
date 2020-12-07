package Istannce07;

public class Main {
	
	public static void main(String[]args){
		
		Computer bijiben=new Computer();
		
		
		Student zhangsan=new Student();
		
		zhangsan.id="123";
		zhangsan.name="张三";
		zhangsan.notepad=bijiben;
		
		bijiben.brand="华硕";
		bijiben.style="C5270-003";
		bijiben.color="black";
		
		System.out.println(zhangsan.name+"的电脑品牌为： "+zhangsan.notepad.brand);
		System.out.println(zhangsan.name+"的电脑型号为： "+zhangsan.notepad.style);
		System.out.println(zhangsan.name+"的电脑颜色为： "+zhangsan.notepad.color);
		System.out.println("---------------------------------");
		
		bijiben.brand="苹果";
		bijiben.style="X6290-008";
		bijiben.color="pink";
		
		System.out.println(zhangsan.name+"的电脑品牌为： "+zhangsan.notepad.brand);
		System.out.println(zhangsan.name+"的电脑型号为： "+zhangsan.notepad.style);
		System.out.println(zhangsan.name+"的电脑颜色为： "+zhangsan.notepad.color);

	}

}
