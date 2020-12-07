package Instance03;

public class Main {
	
	public static void main(String[]args){

		//创建一个丈夫对象
		Husband husband=new Husband(); 
		husband.idCard="33256456165451";
		husband.name="黄晓明";
		
		//创建一个妻子对象
		Wife wife=new Wife();
		wife.idCard="56346515664455";
		wife.name="杨颖";
		
		//结婚【通过丈夫找到妻子，通过妻子找到丈夫】
		husband.w=wife;
		wife.h=husband;
		
		//得出结果
		System.out.println(husband.name+"的妻子名字叫："+husband.w.name);
		System.out.println(wife.name+"的丈夫名字叫："+wife.h.name);
		System.out.println("-------------------------------------------");
		System.out.println(husband.name+"的妻子名字叫："+husband.w.name+"，身份证号为："+husband.w.idCard);
		System.out.println(wife.name+"的丈夫名字叫："+wife.h.name+"，身份证号为："+wife.h.idCard);
	}
	
}
