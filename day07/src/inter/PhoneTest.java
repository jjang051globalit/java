package inter;

public class PhoneTest {
	public static void main(String[] args) {
		Gallaxy gallaxy22 = new Gallaxy();
		gallaxy22.sendCall();
		gallaxy22.receiveCall();
		gallaxy22.samsungPay();
		
		Iphone iphone10  = new Iphone();
		iphone10.sendCall();
		iphone10.receiveCall();
		
		PhoneInterface myPhone = new Gallaxy();
		
	}
}
