package Pyramid;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("����һ�����ڴ�����Pyramid������");
		System.out.println("------------------------------");
		System.out.println("������Pyramid�Ĳ�����");
		int cnt=in.nextInt();
		System.out.println("������Pyramid�����Ԫ�أ�");
		String str=in.next();
		Pyramid py=new Pyramid();
		py.show(cnt,str);

	}
	public void show(int cnt,String str){
		int j=0;
		int k=0;
		for(int i=1;i<=cnt;i++){
			for(j=0;j<cnt-i;j++){
				System.out.print(" ");
			}
			for(k=0;k<2*i-1;k++){
				System.out.print(str);
			}
			System.out.println("\n");
		}
	}

}
