package Instance02;

public class Main {

	public static void main(String[]args){
		
		Customer customer=new Customer();
		Product product=new Product();
		
		customer.pro=product;
		product.cust=customer;
		
		customer.name="����ΰ";
		customer.age=18;
		customer.pro.name="iPone12";
		
		System.out.println(customer.age+"���С���"+customer.name+"������һ�����·����� "+customer.pro.name);
	}
}
