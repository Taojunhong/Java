package KeysWord_this03;

public class Test {
	
	int i=10;

	public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.i);
		
		doOther();
		//t.doOther();//��static�ؼ��ֵķ�������ʹ�á�����.���ķ�ʽ���ã�������־���
		t.doSome();
		
	}
	
	public static void doOther(){
		System.out.println("do Other!");
	}
	
	public void doSome(){
		System.out.println("do Some!");
	}

}
