package PrimaryStage01Test;

public class test04 {

	public static void main(String[] args) {
		/*
		 ���ڻ�����������֮����໥ת����ת������
		     8�ֻ����������ͣ�byte short int long float double boolean char   1 2 4 8 4 8 1 2
		 	1.���ֻ����������͵��г���������֮��ʣ�µ�7����������֮�䶼�����໥ת��
		 	2��С�����������ת������Ϊ�Զ�ת����������С��������
		 		byte < short < int < long < float < double
		 			   char  <
		 	ע���κθ������Ͳ���ռ���ٸ��ֽڣ���ŷ��������������
		 	3��������ת����С����������ǿ������ת������Ҫ��ǿ������ת������������ܱ���ͨ�������������н׶ο��ܻ���ʧ���ȣ�Ҫ����ʹ�á�
		 	4����������ֵû�г���Byte��Short��Char��ȡֵ��Χ������ֱ�Ӹ�ֵ��Byte���͵ı���
		 	5��Byte��Short��Char��������ʱ�򣬸�����ת����ing�����������㡣
		 	6�������������ͻ�����㣬��ת���������������������������㡣
		 	
		 			   	
		 */
		byte y=4;
		short s=10;
		char h=65535;
		int a=y+s+h;
		System.out.println(a);//65549
		
		
		double g=10;
		byte b=(byte) (int)(g/3);
		System.out.println(b);//3
		
		
		short i=10;
		byte t=5;
		//short n=i+t;���Ͳ�ƥ��
		int k=i+t;
		System.out.println(k);//15
		
		int m=100;
		System.out.println(m++);//���Ϊ100
		System.out.println(m);//���Ϊ101
		System.out.println(--m);//100
		System.out.println(m--);//100
		System.out.println(m--);//99
		System.out.println(m--);//98
		System.out.println(++m);//98
		
	}

}
