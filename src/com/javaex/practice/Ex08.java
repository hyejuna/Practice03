package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {

		for (int num=1; num<=9; num++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan+"*"+num+"="+(dan*num));
				if(dan*num<10) {
					System.out.print("   ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
