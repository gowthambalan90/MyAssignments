package week1.day1;

public class Mobile1 {
	
	private void makeCall() {
		System.out.println("I am making the call");
	}

		public void sendSms() {
		System.out.println( "Hi How Are You");

	}

	       private void mobileModel() {
			String mobileModel;
			Float  mobileWeight;

			System.out.println( "Samsung M31" + "130grms");
		}
		public void FullCharged() {

			boolean a,b, result; 
			a= true;
			b= false;
			result= a|b;

			System.out.println("FullyCharged" + result);

			int  c=7000;

			System.out.println("mobileCost" + c );
		}

		public static void main(String[] args) {
			Mobile1 obj= new Mobile1();
			obj.makeCall();obj.mobileModel();obj.sendSms();obj.FullCharged();

		}
}
