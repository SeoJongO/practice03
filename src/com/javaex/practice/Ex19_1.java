package com.javaex.practice;

import java.util.Scanner;

public class Ex19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int money = 0;
		int num;

		do {
			System.out.println("-----------------------------");
			System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택>");
			num = sc.nextInt();
			
			if (num == 1) {
				System.out.print("예금액>");
				int yegeum = sc.nextInt();
				money += yegeum;
				System.out.println("");

			} else if (num == 2) {
				System.out.print("출금액>");
				int chool = sc.nextInt();
				if (money < chool) {
					System.out.println("잔액이 부족합니다");
					money = money + chool;
				}
				money = money - chool;
				System.out.println("");

			} else if (num == 3) {
				System.out.print("잔고액>" + money);

				System.out.println("");

			} else if (num>=5) {
				System.out.println("재입력");
				System.out.println("");
			}
		} while (num != 4);
		System.out.print("프로그램 종료");
		sc.close();
	}

}
