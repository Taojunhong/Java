package PrimaryStage03Method;

public class MethodTest08 {

/*
	�ڷ���ֵ������void�ķ�������ʹ�á�return;�����
	��return�������ַ���ֵΪvoid�ķ�������Ҫ��Ϊ������������ǰ����
*/
	
	public static void main(String[]args){
		m();
		n();
	}
	
	//������󣺶��ڽ������Ϊ�յķ������޷�����ֵ
	/*
	public static void m(){
		return 10;  ����ֵ������void���ܷ���ֵ
	}
	*/
	
	public static void m(){
		return;
	}
	
	public static void n(){
		for(int i=0;i<10;i++){
			if(i==5){
				return;//return�����þ��ǽ���n()����
			}
			System.out.println("i-->"+i);
		}
		System.out.println("hello!");
	}
	
	
}
