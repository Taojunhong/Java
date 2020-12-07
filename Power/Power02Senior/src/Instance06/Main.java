package Instance06;

public class Main {
	
	public static void main(String[]args){
		
		Ren person=new Ren();
		BieShu fangzi=new BieShu();
		
		person.name="张三";
		person.age=24;
		person.idCard="123456789110";
		person.sex=true;
		
		fangzi.mianJi=6600.66;
		fangzi.address="中国大陆";
		fangzi.zhuRen=person;
		
		System.out.println("姓名："+person.name+"\n年龄："+person.age);
		System.out.println("身份证号："+person.idCard+"\n性别："+person.sex);
		System.out.println("位于： "+fangzi.address+",面积为: "+fangzi.mianJi+"平方米的别墅，户主是： "+fangzi.zhuRen.name);
		
		
		
	}

}
