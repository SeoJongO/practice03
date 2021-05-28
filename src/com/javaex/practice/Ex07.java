package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int i = sc.nextInt();
		for (int c = 1; c <= i; c++) {
			for (int d = 1; d <= c; d++) {
				System.out.print(c);
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
