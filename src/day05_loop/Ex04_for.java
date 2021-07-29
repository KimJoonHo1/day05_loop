package day05_loop;

public class Ex04_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su=1, sum=0;
		for(; su<= 10;) {
			sum+=su;
			su++;
		}
		System.out.println("1~10 ÇÕ : " + sum);
		for(; ;) {
			System.out.println("½ÇÇà");
		}
	}

}
