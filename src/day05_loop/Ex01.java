package day05_loop;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 for문 : 개수가 무조건 2개
		 for(초기값; 조건식; 증감식) {
		 	종속문장
		 }
		 */
		int sum = 0;
		int cnt;
		for(cnt = 1; cnt <= 10; cnt++) {
			sum+=cnt;
		}
		System.out.println("sum : " + sum);
		System.out.println("cnt : " + cnt);
	}

}
