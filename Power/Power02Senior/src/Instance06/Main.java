package Instance06;

public class Main {
	
	public static void main(String[]args){
		
		Ren person=new Ren();
		BieShu fangzi=new BieShu();
		
		person.name="����";
		person.age=24;
		person.idCard="123456789110";
		person.sex=true;
		
		fangzi.mianJi=6600.66;
		fangzi.address="�й���½";
		fangzi.zhuRen=person;
		
		System.out.println("������"+person.name+"\n���䣺"+person.age);
		System.out.println("���֤�ţ�"+person.idCard+"\n�Ա�"+person.sex);
		System.out.println("λ�ڣ� "+fangzi.address+",���Ϊ: "+fangzi.mianJi+"ƽ���׵ı����������ǣ� "+fangzi.zhuRen.name);
		
		
		
	}

}
