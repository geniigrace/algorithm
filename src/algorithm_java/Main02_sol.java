package algorithm_java;

import java.util.Scanner;

class Main02_sol {
	public String solution(String str) {
		
		String answer="";
		
		for(char x : str.toCharArray()) { // for-each문 찾아보기 // 문자를 배열로 바꿔주고 문자x로 배열 탐색  
			if(Character.isLowerCase(x)) {//문자가 소문자인지 확인 
				answer+=Character.toUpperCase(x); //대문자로 저장 
			}
			else { //문자가 대문자이면 
				answer+=Character.toLowerCase(x); //소문자로 저장 
			}
		}
		
		return answer;
	}
	

public static void main(String[] args) {
	
	Main02_sol T = new Main02_sol();
	Scanner sc = new Scanner(System.in);
	String str=sc.next();
	System.out.print(T.solution(str));
	}
}