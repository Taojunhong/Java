package Instance03;

public class Main {
	
	public static void main(String[]args){

		//����һ���ɷ����
		Husband husband=new Husband(); 
		husband.idCard="33256456165451";
		husband.name="������";
		
		//����һ�����Ӷ���
		Wife wife=new Wife();
		wife.idCard="56346515664455";
		wife.name="��ӱ";
		
		//��顾ͨ���ɷ��ҵ����ӣ�ͨ�������ҵ��ɷ�
		husband.w=wife;
		wife.h=husband;
		
		//�ó����
		System.out.println(husband.name+"���������ֽУ�"+husband.w.name);
		System.out.println(wife.name+"���ɷ����ֽУ�"+wife.h.name);
		System.out.println("-------------------------------------------");
		System.out.println(husband.name+"���������ֽУ�"+husband.w.name+"�����֤��Ϊ��"+husband.w.idCard);
		System.out.println(wife.name+"���ɷ����ֽУ�"+wife.h.name+"�����֤��Ϊ��"+wife.h.idCard);
	}
	
}
