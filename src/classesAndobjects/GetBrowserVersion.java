package classesAndobjects;

public class GetBrowserVersion {

	String name;//global var- non static - object reference - part of object property
	static String hq = "Banglore";//global/class variable - static - class name 
	
	//Static or class variable will be stored in CMA->Permanent Generation->Metaspace
	//Objects can call a static property, but with a warning
	
	
	public int getBrowserVersion() {
		System.out.println("get browser version.");
		return 100;
	}
	public static String getBrowserVendor() {
		System.out.println("get browser vendor.");
		return "Mozilla";
	}
	
	public static void main(String[] args) {
		
		GetBrowserVersion gb = new GetBrowserVersion();
		System.out.println(gb.name);
		System.out.println(GetBrowserVersion.hq);
		System.out.println(hq);
		
		gb.getBrowserVersion();
		GetBrowserVersion.getBrowserVendor();
		
		System.out.println(gb.hq);

	}

}
