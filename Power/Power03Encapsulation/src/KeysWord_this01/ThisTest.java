package KeysWord_this01;

public class ThisTest {
	
	//ʵ������
	int i=10;
	
	public static void main(String[] args) {
		
		//System.out.println(i);//����ʵ������������á�����.���ķ�ʽ
		
		ThisTest tt=new ThisTest();
		System.out.println(tt.i);
		tt.run();
		
	}
	public void doOther(){
		//this ��ʾ��ǰ����
		System.out.println("do Other!");
	}
	
	//run��ʵ������������run������һ�����ж�����ڵġ�
	//һ�����ȴ�����һ��������ܵ���run����
	public void run(){
		
		//�ڴ������еĴ���ִ�й��̵���һ�������ڡ���ǰ���󡱵�
		//Ҳ����˵����һ���С�this���ؼ��ֵ�
		System.out.println("Run execute!");
		
		//doOther��һ��ʵ��������ʵ���������ñ����ж���Ĵ���
		doOther();
		this.doOther();//�Ƚ�������д��
	}

}
