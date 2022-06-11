//1. 올바른 괄호
//설명
//
//괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
//
//(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.
//
//
//입력
//첫 번째 줄에 괄호 문자열이 입력됩니다. 문자열의 최대 길이는 30이다.
//
//
//출력
//첫 번째 줄에 YES, NO를 출력한다.

package section5;

import java.util.*;

public class RightBracket_1 {

	public static void main(String[] args){
		RightBracket_1 getter = new RightBracket_1();
		Scanner sc = new Scanner(System.in);
		String br = sc.next();
		System.out.println(getter.solution(br));
		sc.close();
	}
	
	public String solution(String br){
		String answer;
		
		char[] bracket = br.toCharArray();
		int l = 0;
		int r = 0;
		
		if(bracket[0] == ')') return "NO";
		if(bracket[bracket.length-1] == '(') return "NO";
		
		for(char x : bracket){
			if(x == '(') l++;
			else if(x == ')') r++;
		}
		
		if(l == r) answer = "YES";
		else answer = "NO";		
		
		return answer;
	}
}