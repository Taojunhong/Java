package PrimaryStage02Control;

public class ForTest04乘法表 {

	public static void main(String[] args) {
		//嵌套循环
		for(int i=1;i<=10;i++){
			for(int j=1;j<=3;j++){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		//九九乘法表:
		//重要思想：k<=j，
		System.out.println("下面是   九九乘法表：");
		for(int j=1;j<=9;j++){
			for(int k=1;k<=j;k++){
				System.out.printf("%d*%d=%d\t",k,j,j*k);
			}
			System.out.println();
		}

	}

}
