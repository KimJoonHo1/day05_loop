package day05_loop;

import java.util.Scanner;

public class Ex02_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int reqet;
		System.out.println("�ݺ� Ƚ�� �Է�");
		reqet = scanner.nextInt();
		for(int i = 0; i<reqet; i++) {
			System.out.println(i + ".�ݺ�");
		}
		System.out.println("=== ���ҽ� ===");
		for(int i=10; i>0; i--) {
			System.out.println(i + ". ����");
		}
		
		System.out.println("---- 2���� -----");
		for(int i = 0; i<10; i+=2) {
			System.out.println(i + ". ����");
		}
	}

}
