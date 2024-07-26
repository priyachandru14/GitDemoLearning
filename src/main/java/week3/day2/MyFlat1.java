package week3.day2;

public class MyFlat1 extends MyFlat{
	public void servicearea()
	{
		System.out.println("store room");
	}
	public void terrace() {
		System.out.println("common for all");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFlat1 call=new MyFlat1();
		call.terrace();
		call.park();
		call.servicearea();
		call.flats();
	}

}
