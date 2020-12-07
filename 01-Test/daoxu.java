package Shuzu;

import java.util.Scanner;

public class daoxu {

	public void daoxu(String str1) {
		String str2="";
		char[] c = str1.toCharArray();
		for (int i = str1.length()-1; i >=0; i--) {
			str2 += c[i] ;
		}
		System.out.println("倒序输出：" + str2);
	}

	public static void main(String[] args) {
		System.out.println("请输入一串字符：");
		Scanner in = new Scanner(System.in);
		String str1 = in.nextLine();
		daoxu s = new daoxu();
		s.daoxu(str1);
	}

}
