package day05_loop;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 for�� : ������ ������ 2��
		 for(�ʱⰪ; ���ǽ�; ������) {
		 	���ӹ���
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
