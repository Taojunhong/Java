package KeysWord_this02;

//�û���
/**
 * "this"�������־ֲ�������ʵ��������ʱ��this����ʡ��
 * 
 * @author ASUS
 *
 */
public class User {
	
	//����
	private int id;
	private String name;
	
	//���캯��
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
