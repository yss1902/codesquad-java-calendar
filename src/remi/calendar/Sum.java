package remi.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int result = (number1 + number2);
		System.out.println("두 수의 합은 " + result + "입니다.");
		sc.close();

	}

}
