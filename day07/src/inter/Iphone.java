package inter;

public class Iphone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("아이폰 신호음이 울립니다.");
		
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요. ");
	}
	
}
