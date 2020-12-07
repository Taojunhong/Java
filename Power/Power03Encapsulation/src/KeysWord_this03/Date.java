package KeysWord_this03;

/**
 * 程序员自编写Date类
 * 		this可以用在哪：
 * 			1.可以使用在实例方法当中，代表当前对象【语法格式：this.】
 * 			2.可以使用在构造方法当中，通过当前的构造方法调用其他的构造方法【语法格式：this(实参)】
 * 		重点：this()这种语法只能出现在构造函数的第一行。
 * @author ASUS
 *
 */
public class Date {
	
	//属性
	private int year;
	private int mouth;
	private int day;
	
	//构造方法
	public Date(int year, int mouth, int day) {
		this.year = year;
		this.mouth = mouth;
		this.day = day;
	}
	
	/**
	 * 默认创建日期为1970年1月1日
	 */
	public Date() {
		/*this.year=1970;
		this.mouth=1;
		this.day=1;*/
		//以上代码重复，可以通过调用一个构造方法来完成
		//但前提是不能创建新的对象，以下代码表示创建了一个全新的的对象
		//new Date(1970,1,1);
		
		//以下方法不会创建新的对象，同时可以达到目标
		this(1970, 1, 1);
	}

	//setter and getter
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMouth() {
		return mouth;
	}

	public void setMouth(int mouth) {
		this.mouth = mouth;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	//打印输出到控制台
	public void print(){
		System.out.println(this.year+"年"+this.mouth+"月"+this.day+"日");
	}
	
	
	

}
