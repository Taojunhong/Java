package KeysWord_this03;

/**
 * ����Ա�Ա�дDate��
 * 		this���������ģ�
 * 			1.����ʹ����ʵ���������У�����ǰ�����﷨��ʽ��this.��
 * 			2.����ʹ���ڹ��췽�����У�ͨ����ǰ�Ĺ��췽�����������Ĺ��췽�����﷨��ʽ��this(ʵ��)��
 * 		�ص㣺this()�����﷨ֻ�ܳ����ڹ��캯���ĵ�һ�С�
 * @author ASUS
 *
 */
public class Date {
	
	//����
	private int year;
	private int mouth;
	private int day;
	
	//���췽��
	public Date(int year, int mouth, int day) {
		this.year = year;
		this.mouth = mouth;
		this.day = day;
	}
	
	/**
	 * Ĭ�ϴ�������Ϊ1970��1��1��
	 */
	public Date() {
		/*this.year=1970;
		this.mouth=1;
		this.day=1;*/
		//���ϴ����ظ�������ͨ������һ�����췽�������
		//��ǰ���ǲ��ܴ����µĶ������´����ʾ������һ��ȫ�µĵĶ���
		//new Date(1970,1,1);
		
		//���·������ᴴ���µĶ���ͬʱ���ԴﵽĿ��
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
	
	//��ӡ���������̨
	public void print(){
		System.out.println(this.year+"��"+this.mouth+"��"+this.day+"��");
	}
	
	
	

}
