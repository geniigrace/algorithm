package algorithm_java;

import java.util.Scanner;

public class Main02 {
	
	public static void main(String[] agrs) {
	// 대문자, 소문자가 같이 있는 문자열을 입력받아 대문자는 소문자로, 소문자는 대문자로 변환
	
	/* 1. 입력받기
	 * 2. 문자열 순서대로 문자로 읽기
	 * 3. 유니코드 값을 사용해서 대소문자 구분 후 출력 
	 */

	//1. 입력받기
	Scanner sc = new Scanner(System.in);
	System.out.print("문자열을 입력하세요 : ");
	String str = sc.next();
	
	char chr; // 문자 읽어올 변수 
	
	for(int i=0; i<str.length(); i++) {
		chr=str.charAt(i); // 문자열을 0번 배열부터 문자 읽어오기 .charAt() : 스트링에 인덱스로 접근 
		if(chr>=65 && 90>=chr) { // 읽은 문자가 대문자일 때 
			chr=Character.toLowerCase(chr); // 소문자로 변환 
			System.out.print(chr); //출력  
		}else { // 대문자가 아닐 때(소문자 일때)
			chr=Character.toUpperCase(chr); // 대문자로 변환 
			System.out.print(chr);// 출력 
		}
	}
	
	}
	
}
