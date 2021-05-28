package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		System.out.println("숫자를 입력하세요");
		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			if (num > num1) {
				num1 = num;
			}
		}
		System.out.println("최대값은 " + num1 + "입니다.");

		sc.close();
	}

}
