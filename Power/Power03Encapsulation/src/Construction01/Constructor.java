package Construction01;
/*
  ����Java���еĹ��췽����
		1.���췽���ֱ���Ϊ���캯��/������/Construction
		2.���췽���﷨�ṹ��
			[���η��б�] ���췽���� (��ʽ�����б�){
				���췽���壻
			}
		3.�ع���ͨ�������﷨�ṹ��
			[���η��б�] ����ֵ���� ������ (��ʽ�����б�){
				�����壻
			}
		4.���ڹ��췽����˵��������ֵ���͡�����Ҫָ��������Ҳ����дvoid
		  ֻҪд��void����ô��������ͳ�Ϊ��ͨ�����ˡ�
	 	
	 	5.���ڹ��췽����˵�����췽���ķ������������������һ�¡�

		6.���췽�������ã�
				���췽�����ڵ������ǣ�ͨ�����췽���ĵ��ã����Դ�������
		
		7.���췽���ĵ��ã�
				-��ͨ�������������õģ��������η�����static��ʱ������.��������ʵ���б�
									   �������η��б���û��static��ʱ������.��������ʵ���б�
				-new ���췽������ʵ���б�
		8.���췽������ִ��֮���з���ֵ��
				ÿһ�����췽��ʵ����ִ�н���֮���з���ֵ�����������return ֵ;����������䲻��Ҫд
				���췽��������ʱ��Java�����Զ�����ֵ��
				���ҷ���ֵ�����ǹ��췽������������͡����ڹ��췽���ķ���ֵ�����౾��
				���Է���ֵ���Ͳ���Ҫ��д
		9.��һ������û�ж�����κι��췽���Ļ���ϵͳĬ���ṩһ���޲εĹ��췽����������췽����ȱʡ������
		
		10.��һ������ʾ�Ľ����췽����������ˣ���ôϵͳ����Ĭ��Ϊ������ṩȱʡ������
		      ���鿪�����ֶ�Ϊ��ǰ���ṩ�޲ι��췽������Ϊ�������̫�����ˡ�
	    
	    11.���췽��֧�����ػ��ơ�
		
*/

public class Constructor {

	public static void main(String[] args) {
		
		Test t1=new Test();
		System.out.println("������"+t1.name);
		System.out.println("�༶��"+t1.idClass);
		System.out.println("���䣺"+t1.age);
		System.out.println("-------------------");
		
		Test t2=new Test(20);
		System.out.println("������"+t2.name);
		System.out.println("�༶��"+t2.idClass);
		System.out.println("���䣺"+t2.age);
		System.out.println("-------------------");

		
		Test t3=new Test("������");
		System.out.println("������"+t3.name);
		System.out.println("�༶��"+t3.idClass);
		System.out.println("���䣺"+t3.age);
		System.out.println("-------------------");

		Test t4=new Test("NB001",20);
		System.out.println("������"+t4.name);
		System.out.println("�༶��"+t4.idClass);
		System.out.println("���䣺"+t4.age);
		System.out.println("-------------------");
		
		Test t5=new Test("��У��","NB001",20);
		System.out.println("������"+t5.name);
		System.out.println("�༶��"+t5.idClass);
		System.out.println("���䣺"+t5.age);


	}

}
