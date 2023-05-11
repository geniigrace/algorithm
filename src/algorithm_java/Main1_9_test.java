package algorithm_java;

import java.util.Scanner;

public class Main1_9_test {
	
	/*
    문제 : String 으로 받은 값이 숫자인지 검출하는 코드
    조건 : 기본 flag = true 이며 flag로 숫자인지 아닌지 리턴함
    풀이 : 문자가 포함되어있는 경우 숫자가 아닌것으로 간주하여 flag값을 false 로 변경
           입력된 값을 char 로 나누어 아스키코드값으로 48~57 범위 외 값이면 false로 변경
    */

   public boolean solution(String str) {

       boolean flag = true;

       for(char c : str.toCharArray()){
    	  //System.out.println(c); //검수를 위한 출력을 주석처리 하였음 
           if(!(c>=48 && c<=57)){
               flag = false;
               //System.out.println(flag); //검수를 위한 출력을 주석처리 하였음 
           }
       }

       return flag;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main1_9_test T = new Main1_9_test();
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.print(T.solution(str));

	}

}
