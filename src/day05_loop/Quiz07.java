package day05_loop;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(i % 7 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~1000������ 7�� ����� ���� " + sum + "�Դϴ�");
	}

}
