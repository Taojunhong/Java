package KeysWord_this02;

//用户类
/**
 * "this"用来区分局部变量和实例变量的时候，this不能省略
 * 
 * @author ASUS
 *
 */
public class User {
	
	//属性
	private int id;
	private String name;
	
	//构造函数
	public User(){
		
	}
	
	public User(int id,String name){
		this.id=id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
