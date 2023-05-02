package day06;

public class TV {
	// company , year, size
	// showInfo()를 통해서 제품 정보 출력
	public String company;
	public int year;
	public int size;
	public TV() {
			
	}
	public TV(String company,int year, int size) {
		this.company=company;
		this.year = year;
		this.size = size;
	}
	public void showInfo() {
		System.out.println("우리집 tv는 "+company+"이고 "
							+year+"년도에 생산되었고 "
							+size+"인치 입니다.");
		
	}

	
}
