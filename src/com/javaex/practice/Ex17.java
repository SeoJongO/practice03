package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		for (int i = num; i >= 1; i--) {
			for (int c = i; c >= 1; c--) {
				System.out.print("*");
			}
			System.out.println("");
			sc.close();
		}

	}
}
