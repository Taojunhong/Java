package Java01_UpClass;

public class CallRoll {
	
	public void call(Students arriv){
		System.out.println("--"+arriv.getId()+"��"+arriv.getName()+"������"+"--");
		arriv.arrived();
	}
	

}
