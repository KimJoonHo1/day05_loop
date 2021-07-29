package day05_loop;

public class Quiz10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<= 100; i+=2) {
			sum = sum + i;
		}
		System.out.println("sum의 합계 : " + sum); // 합계 : 2500
	}

}
