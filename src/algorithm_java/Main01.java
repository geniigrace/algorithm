package algorithm_java;

import java.util.Scanner;

public class Main01 {

	
	public static void main(String[] agrs) {
		
		// 하나의 문자열을 입력 받고 해당 특정문자를 입력받아 문자열에 몇개 존재하는지 알아내기
		
		/*  1. 문자열 입력받기
		 *  2. 찾을 문자 입력받기
		 *  3. 대소문자 구분 안함
		 *  4. 찾는 문자 카운팅 하기 
		 * */

		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력받기 
		String str = sc.next();
		
		// 찾을 문자 입력받기 
		char c = sc.next().charAt(0); // 입력받는 문자열 중 0번째 한글자 받아서 c 에 저장
		
		//대소문자 구분 안함 -> 대문자 혹은 소문자로 모두 변환 
		str=str.toUpperCase(); //대문자로 변환 
		//str=str.toLowerCase(); //소문자로 변환 
		c=Character.toUpperCase(c); //대문자로 변환 
		//c=Character.toLowerCase(c); //소문자로 변환
		
		//System.out.println(str+" ,"+c); //대소문자 변환 확인
		
		// 찾는 문자 카운팅 하기 
		int count=0;
		for(int i=0; i<str.length();i++) { //문자열 길이만큼 탐색 
			if(str.charAt(i)==c) { //문자열 배열에 i번째 글자가 입력받은 문자와 같다면 
				count++; //카운트를 올림 
				
			}
		}
		System.out.println(count);
		
	}

}
