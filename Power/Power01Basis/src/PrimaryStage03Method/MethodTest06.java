package PrimaryStage03Method;

public class MethodTest06 {
	
	//����ֵ���Ͳ���void��ʱ��
	
	//��������int���͵����ݵ��̣�Ҫ�����յļ��������ظ�������
	
	//����ֵ���Ͳ���void��ʱ��Ҫ�󷽷�����Ҫִ�С� return ֵ ��������

	public static void main(String[] args) {
		//���÷���
		shang(4,2);
		//�������ݣ����ñ�������
		int i=shang(10,2);
		System.out.println(i);
		
		long x=shang(10,5);
		System.out.println(x);
		
		//�������
		System.out.println(shang(100,10));
	}
	
	//һ�������з���ֵ��ʱ�򣬵����ǵ������������ʱ��
	//����������һ��ֵ�����ڵ�������˵�����ֵ����ѡ����ջ��߲�����
	//�󲿷���������Ƕ���ѡ�����
	
	public static int shang(int a,int b){
		//System.out.println("hello!");
		return a/b;
	}

}
