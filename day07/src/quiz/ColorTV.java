package quiz;

public class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color=color;
	}
	public void showInfo() {
		System.out.println( 
				this.getSize()+"인치"+this.color+"컬러");
	}
	public int getColor() {
		return color;
	}
	
	
}
//ColorTV를 만들고 TV를 상속 받는다.
//color라는 속성을 가진다.
//showInfo를 통해 (66인치 1024컬러)
//를 출력한다.