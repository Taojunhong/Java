package PrimaryStage02Control;

public class ForTest04�˷��� {

	public static void main(String[] args) {
		//Ƕ��ѭ��
		for(int i=1;i<=10;i++){
			for(int j=1;j<=3;j++){
				System.out.print(j+"\t");
			}
			System.out.println();
		}
		
		//�žų˷���:
		//��Ҫ˼�룺k<=j��
		System.out.println("������   �žų˷���");
		for(int j=1;j<=9;j++){
			for(int k=1;k<=j;k++){
				System.out.printf("%d*%d=%d\t",k,j,j*k);
			}
			System.out.println();
		}

	}

}
