package step3;

public class TestThrow3 {
	public static void main(String[] args) {
		int day=1;
		try {
		MyDate date1=new MyDate(day);
		System.out.println(date1.getDay());//1
		}catch(DayException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("**************************");
		
		day=0;
		try {
		MyDate date2=new MyDate(day);
		System.out.println(date2.getDay());
		}catch(DayException e) {
		//0은 잘못된 입력값입니다 (1~31 사이만 가능)
		System.out.println(e.getMessage());
		}
	}
}
