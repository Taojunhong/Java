package PrimaryStage02Control;

public class IFTest03 {
	public static void main(String[] args) {
		/*
		 * 需求： 判断当前天气 下雨时 男，带大黑伞 女，带小花伞 晴天时 温度30度以上时 男，戴墨镜 女，擦防晒霜
		 */
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.println("请输入当前天气：1.下雨  或者  2.晴天");
		//int str = s.nextInt();
		String str = s.next();
		System.out.println("请输入自己的性别： 1.男  或者  2.女");
		int sex=s.nextInt();
		//String res = "";
		//if (str ==1) {
		if(str.equals("下雨")){
			if (sex == 1) {
				System.out.println("当前天气为" + str + "，男，应该带大黑伞");
			} else {
				System.out.println("当前天气为" + str + "，女，应该带小花伞");
			}
		} else  {
			System.out.println("请输入天气温度：例如32度则输入32");
			int temper = s.nextInt();
			if (temper > 30) {
				if (sex == '男') {
					System.out.println("当前天气为" + str + "，温度为" + temper + "度，男，应该戴墨镜");
				} else {
					System.out.println("当前天气为" + str + "，温度为" + temper + "度，女，应该擦防晒霜");
				}
			}
		}
	}

}
