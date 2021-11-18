package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		// 1/2/3/4 출력    --> 5까지 출력됨!!! 출력이 if 함수 밑에 있음!
		
		int i=1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}

	}

}
