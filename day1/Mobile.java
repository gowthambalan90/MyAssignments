package week1.day1;

public class Mobile {
	public void sendsms() {
		System.out.println("Hi,how are you");
		
	}
    private void takesnapshot() {
    	System.out.println("Please take snapshot");
    		
    }
    public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.sendsms();obj.takesnapshot();
	}
}
