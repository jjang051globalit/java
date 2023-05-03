package quiz;

public class ColorTvTest {
	public static void main(String[] args) {
		ColorTV colorTv = 
				new ColorTV(66, 1920*2);
		colorTv.showInfo();
		
		IPTV iptv = new IPTV("192.168.0.8",66,3840);
		iptv.showInfo();
	}
}
