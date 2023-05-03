package quiz;

public class WonToEuro extends Converter {

	public WonToEuro(double ratio) {
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
		return "유로";
	}

}
