package PrimaryStage01Test;

public class test06 {

	public static void main(String[] args) {
		System.out.println("Horldworld~");
		int a = 020;// 8����
		int b = 0x30;// 16����
		int c = 40;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		// �����
		// = += -= *= /= %=
		// ��������������ȼ�����ִ�еȺ��ұߵı��ʽ���ٽ�ִ�н���������Ⱥ����
		int i = 10;
		i = i + 10;
		System.out.println(i);// 20

		i += 5;// ��ͬ��i=i+5
		System.out.println(i);// 25

		i -= 5;// ��ͬ��i=i-5
		System.out.println(i);// 20

		i *= 4;// ��ͬ��i=i*4
		System.out.println(i);// 80

		i /= 4;// ��ͬ��i=i/4
		System.out.println(i);// 20

		i %= 3;// ��ͬ��i=i%3
		System.out.println(i);// 2
		System.out.println("----------------");

		byte k = 10;
		// k=k+10; ���뱨��k+10���ʽΪint���ͣ�kΪByte���ͣ�int���ʹ���byte���ͣ������Զ�ת��,Ҫ��ǿ������ת����
		k = (byte) (k + 10);

		byte j = 0;
		j += 10;// ����ͨ�� ��ͬ��j=(byte)(j+10);
		System.out.println(j);
		//�ó����ۣ�i+=10��i=i+10������
		j+=1000;
		System.out.println(j);//ǿת֮����ʧ����
		
		//��չ��ĸ�ֵ��������ı�����������
		byte x=10;
		int m=20;
		m+=x;//��ͬ��m=(int)(m+n);
		System.out.println(m);

	}

}
