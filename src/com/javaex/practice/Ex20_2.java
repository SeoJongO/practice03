package com.javaex.practice;

import java.util.Scanner;

public class Ex20_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int card = (int)(Math.random()*100)+1;
		int n;
		while (true) {
			System.out.println("=============================");
			System.out.println("      [숫자맞추기게임 시작]");
			System.out.println("=============================");
			
			do {
				System.out.print(">>");
				n = sc.nextInt();
				
				if (n > card) {
					System.out.println("더 낮게");
				} else {
					System.out.println("더 높게");
				}
			} while (n!=card);
			
			System.out.println("맞았습니다.");
			System.out.print("게임을 종료하시겠습니까?(y/n) >>");
			if (sc.next().equals("y")) {
				System.out.println("=============================");
				System.out.println("      [숫자맞추기게임 종료]");
				System.out.println("=============================");
				break;
			}
		}
		sc.close();
	}
}