package week3.day2;

public class Desktop implements Software {
	public void desktopModel()
	{
	System.out.println("Desktop Model in Desktop Class");	
	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Hardware Resouces from Hardware interface");
		
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Software Resouces from Software interface");
	}
public static void main(String[] args) {
	Desktop desk=new Desktop();
	desk.desktopModel();
	desk.hardwareResources();
	desk.softwareResources();
}
}
