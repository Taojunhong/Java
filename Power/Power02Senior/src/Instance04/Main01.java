package Instance04;

public class Main01 {
	
	public static void main(String[]args){
		
		//创建User对象
		User u=new User();
		
		//输出User对象内部实例变量的值
		System.out.println(u.no);
		System.out.println(u.name);
		System.out.println(u.addr);
		
		//修改User对象内部实例变量的值
		u.no=110;
		u.name="jack";
		u.addr=new Address();
		
		//在main方法当中目前只能看到一个引用“u”
		//一切都是只能通过u来进行访问
		System.out.println(u.name+" 居住在"+u.addr.city+"城市："+u.addr.street+"街道，邮编是："+u.addr.zipcode);
		
		u.addr.city="江西";
		u.addr.street="南昌";
		u.addr.zipcode="3300222";
		
		System.out.println(u.name+" 居住在"+u.addr.city+"城市："+u.addr.street+"街道，邮编是："+u.addr.zipcode);

	}

}
