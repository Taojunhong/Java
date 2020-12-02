package Instance1;

import java.util.*;

import Instance1.Stu_manage.person;

public class Stu_manage {
	String[] N = new String[100];
	String[] I = new String[100];
	String[] S = new String[100];
	String[] Z = new String[100];
	int[] A = new int[100];
	int[] C = new int[100];
	int[] E = new int[100];
	int[] M = new int[100];
	int i;

	public class person {
		Scanner src = new Scanner(System.in);
		String[] name = new String[100];
		String[] id = new String[100];
		int[] age = new int[100];
		String[] sex = new String[100];
	}

	public void menu() {
		System.out.println("��ӭ����ѧ����������ϵͳ");
		System.out.println("1--¼��ѧ����Ϣ");
		System.out.println("2--��ѯ����ѧ����Ϣ");
		System.out.println("3--�޸�ĳλѧ����Ϣ");
		System.out.println("4--ɾ��ĳλѧ����Ϣ");
		System.out.println("5--����ĳλѧ����Ϣ");
		System.out.println("6--��ѯĳλѧ����Ϣ");
		System.out.println("7--�˳�");
	}

	public void luru() {
		xuesheng guanli1 = new xuesheng();
		guanli1.luru();
	}

	public void chaxun() {
		xuesheng guanli1 = new xuesheng();
		guanli1.chaxun();
	}

	public void zengjia() {
		xuesheng guanli1 = new xuesheng();
		guanli1.zengjia();
	}

	public void shanchu() {
		xuesheng guanli1 = new xuesheng();
		guanli1.shanchu();
	}

	public void xiugai() {
		xuesheng guanli1 = new xuesheng();
		guanli1.xiugai();
	}

	public void chaxun1() {
		xuesheng guanli1 = new xuesheng();
		guanli1.chaxun1();
	}

	public void denglu() {
		Scanner src = new Scanner(System.in);
		int s;
		String q;
		System.out.println("���ȵ���ϵͳ");
		System.out.println("1--ѧ����¼            2--��ʦ��¼");
		s = src.nextInt();
		if (s == 1) {
			System.out.println("���������룺 (xuesheng)");
			q = src.next();
			if (q.equals("xuesheng")) {
				zhixing();// ִ��
			} else {
				System.out.println("��ȷ�Ϻ����µ��룡����");
				denglu();
			}
		} else {
			if (s == 2) {
				System.out.println("���������룺  (jiaoshi)");
				q = src.next();
				if (q.equals("jiaoshi")) {
					zhixing();// ִ��
				} else {
					System.out.println("��ȷ�Ϻ����µ��룡����");
					denglu();
				}
			}
		}
	}

	public void zhixing() {
		Scanner src = new Scanner(System.in);
		Stu_manage guanli = new Stu_manage();
		int m = 0;
		int t = 0;
		while (m != 4) {
			switch (t) {
			case 0:
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 1:
				guanli.luru();
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 2:
				guanli.chaxun();
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 3:
				guanli.xiugai();
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 4:
				guanli.shanchu();
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 5:
				guanli.zengjia();
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 6:
				guanli.chaxun1();
				guanli.menu();
				System.out.println("��������Ӧ�ı����ɲ�����");
				t = src.nextInt();
				break;
			case 7:
				m = 4;
			}
		}

	}

	public class xuesheng extends person {
		public String[] zybj = new String[100];
		public int[] chinese = new int[100];
		public int[] math = new int[100];
		public int[] english = new int[100];

		public void luru() {
			int r;
			System.out.println("������ԭʼѧ��������");
			r = src.nextInt();
			i = r;
			for (int t = 0; t < i; t++) {
				System.out.println("������ѧ��������");
				N[t] = name[t] = src.next();
				System.out.println("������ѧ��ѧ�ţ�");
				I[t] = id[t] = src.next();
				System.out.println("������ѧ���Ա�");
				S[t] = sex[t] = src.next();
				System.out.println("������ѧ�����䣺");
				A[t] = age[t] = src.nextInt();
				System.out.println("������ѧ��רҵ�༶��");
				Z[t] = zybj[t] = src.next();
				System.out.println("���ĳɼ���");
				C[t] = chinese[t] = src.nextInt();
				System.out.println("��ѧ�ɼ���");
				M[t] = math[t] = src.nextInt();
				System.out.println("Ӣ��ɼ���");
				E[t] = english[t] = src.nextInt();

			}
			System.out.println("�����ɹ���");
			System.out.println("---------------------------");

		}

		public void zengjia() {
			int f;
			i = i + 1;
			f = i - 1;
			System.out.println("������ѧ��������");
			N[f] = name[f] = src.next();
			System.out.println("������ѧ��ѧ�ţ�");
			I[f] = id[f] = src.next();
			System.out.println("������ѧ���Ա�");
			S[f] = sex[f] = src.next();
			System.out.println("������ѧ�����䣺");
			A[f] = age[f] = src.nextInt();
			System.out.println("������ѧ��רҵ�༶��");
			Z[f] = zybj[f] = src.next();
			System.out.println("���ĳɼ���");
			C[f] = chinese[f] = src.nextInt();
			System.out.println("��ѧ�ɼ���");
			M[f] = math[f] = src.nextInt();
			System.out.println("Ӣ��ɼ���");
			E[f] = english[f] = src.nextInt();
			System.out.println("�����ɹ���");
			System.out.println("---------------------------");
		}

		public void shanchu() {
			String m;
			int s;
			System.out.println("��������Ҫɾ���� ѧ����ѧ�ţ�");
			m = src.next();
			for (s = 0; s < i; s++) {
				if (m.equals(I[s])) {
					for (; s < i; s++) {
						N[s] = N[s + 1];
						name[s] = name[s + 1];
						I[s] = I[s + 1];
						id[s] = id[s + 1];
						S[s] = S[s + 1];
						sex[s] = sex[s + 1];
						A[s] = A[s + 1];
						age[s] = age[s + 1];
						Z[s] = Z[s + 1];
						zybj[s] = zybj[s + 1];
						C[s] = C[s + 1];
						chinese[s] = chinese[s + 1];
						M[s] = M[s + 1];
						math[s] = math[s + 1];
						E[s] = E[s + 1];
						english[s] = english[s + 1];
					}
					i = i - 1;
				}
			}
			System.out.println("�����ɹ���");
			System.out.println("---------------------------");
		}

		public void chaxun1() {
			String m;
			int s;
			System.out.println("��������Ҫ��ѯ��ѧ����ѧ�ţ�");
			m = src.next();
			for (s = 0; s < i; s++) {
				if (m.equals(I[s])) {
					System.out.println("ѧ��������" + N[s]);
					System.out.println("ѧ��ѧ�ţ�" + I[s]);
					System.out.println("ѧ���Ա�" + S[s]);
					System.out.println("ѧ�����䣺" + A[s]);
					System.out.println("ѧ��רҵ�༶��" + Z[s]);
					System.out.println("���ĳɼ���" + C[s]);
					System.out.println("��ѧ�ɼ���" + M[s]);
					System.out.println("Ӣ��ɼ���" + E[s]);
					System.out.println("�����ɹ���");
					System.out.println("---------------------------");

				}
			}
		}

		public void xiugai() {
			String n;
			int s;
			System.out.println("��������Ҫ�޸ĵ�ѧ����ѧ�ţ�");
			n = src.next();
			for (s = 0; s < i; s++) {
				if (n.equals(I[s])) {
					System.out.println("������ѧ��������");
					N[s] = name[s] = src.next();
					System.out.println("������ѧ��ѧ�ţ�");
					I[s] = id[s] = src.next();
					System.out.println("������ѧ���Ա�");
					S[s] = sex[s] = src.next();
					System.out.println("������ѧ�����䣺");
					A[s] = age[s] = src.nextInt();
					System.out.println("������ѧ��רҵ�༶��");
					Z[s] = zybj[s] = src.next();
					System.out.println("���ĳɼ���");
					C[s] = chinese[s] = src.nextInt();
					System.out.println("��ѧ�ɼ���");
					M[s] = math[s] = src.nextInt();
					System.out.println("Ӣ��ɼ���");
					E[s] = english[s] = src.nextInt();
				}
			}
			System.out.println("�����ɹ���");
			System.out.println("---------------------------");
		}

		public void chaxun() {
			for (int y = 0; y < i; y++) {
				System.out.println("ѧ��������" + N[y]);
				System.out.println("ѧ��ѧ�ţ�" + I[y]);
				System.out.println("ѧ���Ա�" + S[y]);
				System.out.println("ѧ�����䣺" + A[y]);
				System.out.println("ѧ��רҵ�༶��" + Z[y]);
				System.out.println("���ĳɼ���" + C[y]);
				System.out.println("��ѧ�ɼ���" + M[y]);
				System.out.println("Ӣ��ɼ���" + E[y]);
			}
			System.out.println("�����ɹ���");
			System.out.println("---------------------------");
		}
	}

	public static void main(String[] arge) {
		Stu_manage guanli = new Stu_manage();
		guanli.denglu();

	}

}
