package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		int num = 29;
		
		System.out.println("====================");
		System.out.println("    [숫자맞추기게임 시작]");
		System.out.println("====================");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			int input = sc.nextInt();
			if(num>input) {
				System.out.println("더 높게");
			} else if(num<input) {
				System.out.println("더 낮게");
			} else {
				System.out.println("맞앚습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				String end = sc.next();
				if(end.equals("y")) {
					System.out.println("====================");
					System.out.println("    [숫자맞추기게임 종료]");
					System.out.println("====================");
					break;
				}
			}
		}
		
		
		sc.close();

	}

}
