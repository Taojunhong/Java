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
		System.out.println("欢迎登入学生档案管理系统");
		System.out.println("1--录入学生信息");
		System.out.println("2--查询所有学生信息");
		System.out.println("3--修改某位学生信息");
		System.out.println("4--删除某位学生信息");
		System.out.println("5--增加某位学生信息");
		System.out.println("6--查询某位学生信息");
		System.out.println("7--退出");
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
		System.out.println("请先登入系统");
		System.out.println("1--学生登录            2--教师登录");
		s = src.nextInt();
		if (s == 1) {
			System.out.println("请输入密码： (xuesheng)");
			q = src.next();
			if (q.equals("xuesheng")) {
				zhixing();// 执行
			} else {
				System.out.println("请确认后重新登入！！！");
				denglu();
			}
		} else {
			if (s == 2) {
				System.out.println("请输入密码：  (jiaoshi)");
				q = src.next();
				if (q.equals("jiaoshi")) {
					zhixing();// 执行
				} else {
					System.out.println("请确认后重新登入！！！");
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
				System.out.println("请输入相应的编号完成操作：");
				t = src.nextInt();
				break;
			case 1:
				guanli.luru();
				guanli.menu();
				System.out.println("请输入相应的编号完成操作：");
				t = src.nextInt();
				break;
			case 2:
				guanli.chaxun();
				guanli.menu();
				System.out.println("请输入相应的编号完成操作：");
				t = src.nextInt();
				break;
			case 3:
				guanli.xiugai();
				guanli.menu();
				System.out.println("请输入相应的编号完成操作：");
				t = src.nextInt();
				break;
			case 4:
				guanli.shanchu();
				guanli.menu();
				System.out.println("请输入相应的编号完成操作：");
				t = src.nextInt();
				break;
			case 5:
				guanli.zengjia();
				guanli.menu();
				System.out.println("请输入相应的编号完成操作：");
				t = src.nextInt();
				break;
			case 6:
				guanli.chaxun1();
				guanli.menu();
				System.out.println("请输入相应的编号完成操作：");
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
			System.out.println("请输入原始学生人数：");
			r = src.nextInt();
			i = r;
			for (int t = 0; t < i; t++) {
				System.out.println("请输入学生姓名：");
				N[t] = name[t] = src.next();
				System.out.println("请输入学生学号：");
				I[t] = id[t] = src.next();
				System.out.println("请输入学生性别：");
				S[t] = sex[t] = src.next();
				System.out.println("请输入学生年龄：");
				A[t] = age[t] = src.nextInt();
				System.out.println("请输入学生专业班级：");
				Z[t] = zybj[t] = src.next();
				System.out.println("语文成绩：");
				C[t] = chinese[t] = src.nextInt();
				System.out.println("数学成绩：");
				M[t] = math[t] = src.nextInt();
				System.out.println("英语成绩：");
				E[t] = english[t] = src.nextInt();

			}
			System.out.println("操作成功！");
			System.out.println("---------------------------");

		}

		public void zengjia() {
			int f;
			i = i + 1;
			f = i - 1;
			System.out.println("请输入学生姓名：");
			N[f] = name[f] = src.next();
			System.out.println("请输入学生学号：");
			I[f] = id[f] = src.next();
			System.out.println("请输入学生性别：");
			S[f] = sex[f] = src.next();
			System.out.println("请输入学生年龄：");
			A[f] = age[f] = src.nextInt();
			System.out.println("请输入学生专业班级：");
			Z[f] = zybj[f] = src.next();
			System.out.println("语文成绩：");
			C[f] = chinese[f] = src.nextInt();
			System.out.println("数学成绩：");
			M[f] = math[f] = src.nextInt();
			System.out.println("英语成绩：");
			E[f] = english[f] = src.nextInt();
			System.out.println("操作成功！");
			System.out.println("---------------------------");
		}

		public void shanchu() {
			String m;
			int s;
			System.out.println("请输入您要删除的 学生的学号：");
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
			System.out.println("操作成功！");
			System.out.println("---------------------------");
		}

		public void chaxun1() {
			String m;
			int s;
			System.out.println("请输入您要查询的学生的学号：");
			m = src.next();
			for (s = 0; s < i; s++) {
				if (m.equals(I[s])) {
					System.out.println("学生姓名：" + N[s]);
					System.out.println("学生学号：" + I[s]);
					System.out.println("学生性别：" + S[s]);
					System.out.println("学生年龄：" + A[s]);
					System.out.println("学生专业班级：" + Z[s]);
					System.out.println("语文成绩：" + C[s]);
					System.out.println("数学成绩：" + M[s]);
					System.out.println("英语成绩：" + E[s]);
					System.out.println("操作成功！");
					System.out.println("---------------------------");

				}
			}
		}

		public void xiugai() {
			String n;
			int s;
			System.out.println("请输入您要修改的学生的学号：");
			n = src.next();
			for (s = 0; s < i; s++) {
				if (n.equals(I[s])) {
					System.out.println("请输入学生姓名：");
					N[s] = name[s] = src.next();
					System.out.println("请输入学生学号：");
					I[s] = id[s] = src.next();
					System.out.println("请输入学生性别：");
					S[s] = sex[s] = src.next();
					System.out.println("请输入学生年龄：");
					A[s] = age[s] = src.nextInt();
					System.out.println("请输入学生专业班级：");
					Z[s] = zybj[s] = src.next();
					System.out.println("语文成绩：");
					C[s] = chinese[s] = src.nextInt();
					System.out.println("数学成绩：");
					M[s] = math[s] = src.nextInt();
					System.out.println("英语成绩：");
					E[s] = english[s] = src.nextInt();
				}
			}
			System.out.println("操作成功！");
			System.out.println("---------------------------");
		}

		public void chaxun() {
			for (int y = 0; y < i; y++) {
				System.out.println("学生姓名：" + N[y]);
				System.out.println("学生学号：" + I[y]);
				System.out.println("学生性别：" + S[y]);
				System.out.println("学生年龄：" + A[y]);
				System.out.println("学生专业班级：" + Z[y]);
				System.out.println("语文成绩：" + C[y]);
				System.out.println("数学成绩：" + M[y]);
				System.out.println("英语成绩：" + E[y]);
			}
			System.out.println("操作成功！");
			System.out.println("---------------------------");
		}
	}

	public static void main(String[] arge) {
		Stu_manage guanli = new Stu_manage();
		guanli.denglu();

	}

}
