package day05_loop;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
			if(sum == 528) {
				System.out.println(i);
			}
		}
	}

}
