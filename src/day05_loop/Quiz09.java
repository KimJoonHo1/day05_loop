package day05_loop;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100까지의 정수를 입력해주세요 : ");
		int num = scanner.nextInt();
		
		if(num >= 1 && num <= 100) {
			int count = 0;
			
			System.out.print(num + "의 약수 : ");
			for(int i=1; i<=num; i++) {
				if(num % i == 0) {
					System.out.print(i);
					if(i != num) {
						System.out.print(", ");
					}
				}
			}
		} else {
			System.out.println("1~100까지의 정수가 아닙니다 !");
		}
	}
		

}
