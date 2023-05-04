package quiz;

public class WonToYuan extends Converter {
	
	public WonToYuan(double ratio) {
		this.ratio = ratio;// 상속받은순간 내께 되기때문에 this 사용가능 내ratio와 부모의 ratio가 따로 취급? 
	}
	
	@Override
	public double convert(double src) {
		System.out.println("conver ratio==="+ratio);
		return src/ratio;
	}

	@Override
	public String srcString() {
		return "원";
	}

	@Override
	public String destString() {
		return "위안";
	}

}
