package day05_loop;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=25; i++) {
			System.out.print(i + "\t");
			if(i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
