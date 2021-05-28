package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				if (num != i) {
					System.out.print(i + ",");
				}
				if (num == i) {
					System.out.println(i);
				}

			}
		}
		sc.close();
	}

}
