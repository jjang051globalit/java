package inter;

public class Gallaxy implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("띵띠링띠 띵띠링띠디");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화왔어요...");
	}
	
	public void samsungPay() {
		System.out.println("삼성페이 결제할 수 있음");
	}

}
