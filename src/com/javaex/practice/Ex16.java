package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int result=0;
		int sum_result=0;
		for(int i=1;i<=num;i++) {
			if(i%5==0) {
				result=result+1;
				sum_result=sum_result+i;
			}
		}
		System.out.print("5의 배수의 개수: "+result+"개\n");
		System.out.print("5의 배수의 합: "+sum_result);
		sc.close();
	}

}
