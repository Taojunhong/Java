package PrimaryStage02Control;

public class IFTest03 {
	public static void main(String[] args) {
		/*
		 * ���� �жϵ�ǰ���� ����ʱ �У������ɡ Ů����С��ɡ ����ʱ �¶�30������ʱ �У���ī�� Ů������ɹ˪
		 */
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("�����뵱ǰ������1.����  ����  2.����");
		//int str = s.nextInt();
		String str = s.next();
		System.out.println("�������Լ����Ա� 1.��  ����  2.Ů");
		int sex=s.nextInt();
		//String res = "";
		//if (str ==1) {
		if(str.equals("����")){
			if (sex == 1) {
				System.out.println("��ǰ����Ϊ" + str + "���У�Ӧ�ô����ɡ");
			} else {
				System.out.println("��ǰ����Ϊ" + str + "��Ů��Ӧ�ô�С��ɡ");
			}
		} else  {
			System.out.println("�����������¶ȣ�����32��������32");
			int temper = s.nextInt();
			if (temper > 30) {
				if (sex == '��') {
					System.out.println("��ǰ����Ϊ" + str + "���¶�Ϊ" + temper + "�ȣ��У�Ӧ�ô�ī��");
				} else {
					System.out.println("��ǰ����Ϊ" + str + "���¶�Ϊ" + temper + "�ȣ�Ů��Ӧ�ò���ɹ˪");
				}
			}
		}
	}

}
