package day05_loop;

public class Quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=1; i<= 500; i++) {
			if(i % 3 == 0) {
				count = count + 1;
			}
		}
		System.out.println("1~500까지의 3의 배수는 총 " + count + "개 입니다");
	}

}
