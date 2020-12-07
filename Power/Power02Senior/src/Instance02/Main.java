package Instance02;

public class Main {

	public static void main(String[]args){
		
		Customer customer=new Customer();
		Product product=new Product();
		
		customer.pro=product;
		product.cust=customer;
		
		customer.name="大张伟";
		customer.age=18;
		customer.pro.name="iPone12";
		
		System.out.println(customer.age+"岁的小哥哥"+customer.name+"购买了一部最新发布的 "+customer.pro.name);
	}
}
