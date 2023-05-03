package quiz;

public class WonToDollar extends Converter {
	
	public WonToDollar(double ratio) {
		this.ratio = ratio;
	}
	
	@Override
	public double convert(double src) {
		return src/ratio;
	}

	@Override
	public String srcString() {
		return "원";
	}

	@Override
	public String destString() {
		return "달러";
	}

}
