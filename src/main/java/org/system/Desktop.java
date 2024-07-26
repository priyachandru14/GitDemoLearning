package org.system;

public class Desktop extends Computer {
	public void desktopSize()
	{
	System.out.println("Desktop size = 20 inches");	
	}
	public static void main(String[] args) {
		Desktop sys=new Desktop();
		sys.desktopSize();
		sys.computerModel();
	}
}

