package Encapsu02;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Customer customer=new Customer();
		Goods good=new Goods();
		customer.goods=good;
		
		customer.setAge(2);
		good.setName("������");
		
		System.out.println(customer.getAge()+"��");
		System.out.println(customer.goods.getName());
	}

}
