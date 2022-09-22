package algorithm_java;

import java.util.Scanner;

public class Main01 {
	public int solution (String str, char t) {
		int answer=0;
		
		//대소문자 구분 없으므로 모두 문자로 변환한 다음 탐색 
		// 대문자로 변환할 때는 toUpperCase
		str=str.toLowerCase(); 
		t=Character.toLowerCase(t); 
		
		//배열을 활용해 문자를 처음부터 끝까지 비교한 후, 동일할 때만 answer 값을올린다. 
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==t) {
				answer++;
			}
		}
		
		
		return answer;
	}//답을 제출하는 형태일 뿐 
	
	public static void main(String[] agrs) {
		
		// 하나의 문자열을 입력 받고 해당 특정문자를 입력받아 문자열에 몇개 존재하는지 알아내기
		
		/*  1. 문자열 입력받기
		 *  2. 찾을 문자 입력받기
		 *  3. 몇개인지 찾아서 출력하기 (대소문자 구분 안함) 
		 * */
		Main01 T = new Main01();
		
		
		// 스캐너 객체 생성 
		Scanner sc = new Scanner(System.in);
		
		//문자열 받기
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.next();
		
		//문자 입력 받기 
		System.out.print("찾을 문자를 입력하세요 : ");
		char c= sc.next().charAt(0);// 입력받은 문자열 중 0번째 문자 한개 읽어오기 
		
		System.out.println("찾는 문자는 총 "+T.solution(str, c)+"개 입니다.");
		
		 
	}

}
