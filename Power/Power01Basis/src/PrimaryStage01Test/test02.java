package PrimaryStage01Test;

public class test02 {

	public static void main(String[] args) {
		char a='a';
		System.out.println(a);
		
		//�ַ��������Ӧ�ַ�����˫�����ַ������������ַ���
		//char b="b";
		char b='h';
		System.out.println(b);
		
		System.out.println("******************");
		char xx='\u0000';
		System.out.println(xx+1);
		
		int c=12;//12
		int d=023;//19
		int e=0x34;//52
		System.out.println(c+d+e);//83
		
		long f=456;
		System.out.println(f);
		
		long g=2147483647;//int������ֵ
	//	long g=2147483648;����int����ֵ��Χ������
		System.out.println(g);
		
		long h=2147483648L;//�����ݺ��L��ʾΪlong����
		System.out.println(h);
		
		
		System.out.println("---------------------");
		//ǿ������ת����Ҫ�ӡ�ǿ������ת������
		//ǿ������ת����֮�����ͨ���������н׶ο��ܻ���ʧ����
		//����ǿ������ת�������ʹ��
		//ǿתԭ������ߵ�4���ֽڿ�����ֻȡ����ֽ�
		long j=555586622445225L;
		System.out.println(j);
		int k=(int)j;
		System.out.println(k);
		
		
		//byte ֻռ1���ֽڣ���50��127��û�б���ԭ��SUN��˾��byte���Ŵ�
		//�������Ա����128����˵��ֻ����2���ֽ�
		System.out.println("---------------------");
		byte m=50;
		System.out.println(m);
		byte n=127;
		System.out.println(n);
//		byte o=128;
//		System.out.println(o);
	}

}
