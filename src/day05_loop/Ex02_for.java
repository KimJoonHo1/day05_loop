package day05_loop;

import java.util.Scanner;

public class Ex02_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int reqet;
		System.out.println("반복 횟수 입력");
		reqet = scanner.nextInt();
		for(int i = 0; i<reqet; i++) {
			System.out.println(i + ".반복");
		}
		System.out.println("=== 감소식 ===");
		for(int i=10; i>0; i--) {
			System.out.println(i + ". 실행");
		}
		
		System.out.println("---- 2증가 -----");
		for(int i = 0; i<10; i+=2) {
			System.out.println(i + ". 실행");
		}
	}

}
