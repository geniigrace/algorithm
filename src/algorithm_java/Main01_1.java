package algorithm_java;

import java.util.Scanner;

class Main01_1 {
	
	public int solution(String str, char c) {
		int answer = 0;
		
		//대소문자 구분 안함 -> 대문자 혹은 소문자로 모두 변환 
		str=str.toUpperCase(); //대문자로 변환 
		//str=str.toLowerCase(); //소문자로 변환 
		c=Character.toUpperCase(c); //대문자로 변환 
		//c=Character.toLowerCase(c); //소문자로 변환
				
		//System.out.println(str+" ,"+c); //대소문자 변환 확인
				
		// 찾는 문자 카운팅 하기 
		for(int i=0; i<str.length();i++) { //문자열 길이만큼 탐색 
			if(str.charAt(i)==c) { //문자열 배열에 i번째 글자가 입력받은 문자와 같다면 
				answer++; //카운트를 올림 
						
					}
				}
		return answer;
		
	}

	
	public static void main(String[] agrs) {

		Scanner sc = new Scanner(System.in);
		// 문자열 입력받기 
		String str = sc.next();
		// 찾을 문자 입력받기 
		char c = sc.next().charAt(0); // 입력받는 문자열 중 0번째 한글자 받아서 c 에 저장
		Main01_1 T = new Main01_1();
		System.out.print(T.solution(str, c));
		
		
	}

}
