package PrimaryStage02Control;

public class IFTest01 { 
	/*
	IF ���  ����ѡ��ṹ����
	if��� ֻҪ��һ����ִ֧�У��������ȫ������
	 �����ֱ�д��ʽ
	��һ�֣�
		if(�������ʽ){
			Java���
			...
		}
	�ڶ��֣�
		if(�������ʽ){
			Java���
			...
		}else{
			Java���
			...
		}
	�����֣�
		if(�������ʽ){
			Java���
			...
		}else if(�������ʽ){
			Java���
			...
		}else if(�������ʽ){
			Java���
			...
		}
		...
	�����֣�
		if(�������ʽ){
			Java���
			...
		}else if(�������ʽ){
			Java���
			...
		}else if(�������ʽ){
			Java���
			...
		}else{
			Java���
			...
		}
		
		2.���еĿ�����䶼���Ժ����Ƕ��ʹ��
		
		3.if���ķ�֧��ֻ��һ��Java���Ļ��������ſ���ʡ��
		
	*/
	
	public static void main(String[] args) {
		int i = 3;
		if( i < 6 ){
			System.out.println("�ߣ�ȥKFC�Լ��ȣ����ⲻԶ��");
		} 
		
	/*����
		ϵͳ����һ�������ɼ����ɼ�������С����
		����ѧ���ɼ��жϸ�ѧ���ĳɼ��ȼ�
			��90-100��A
			��80-90��B
			��70-80��C
			��60-70��D
			��0-60��E
			�����߼��жϲ���if���
		*/
		//д��һ
		double score=190.0;
		if(score>100||score<0){
			System.out.println("�ɼ����Ϸ������������룺");
		}else if(score>=90){
			System.out.println("�ɼ���A");
		}else if(score>=80){
			System.out.println("�ɼ���B");
		}else if(score>=70){
			System.out.println("�ɼ���C");
		}else if(score>=60){
			System.out.println("�ɼ���D");
		}else{
			System.out.println("�ɼ���E");
		}
		
		//д����
		//score=2;
		String grade="�ɼ���E";
		if(score>100||score<0){
			grade="�ɼ����Ϸ�������������";
		}else if(score>=90){
			grade="�ɼ���A";
		}else if(score>=80){
			grade="�ɼ���B";
		}else if(score>=70){
			grade="�ɼ���C";
		}else if(score>=60){
			grade="�ɼ���D";
		}
		System.out.println(grade);
		
	}

}
