package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int result=0;
		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			if (i <= num - 1) {
				System.out.print("+");
			}
			result= result+i;
		}
		System.out.println("");
		System.out.println("합계: "+result);
		sc.close();
	}
}
