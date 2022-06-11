//1. 올바른 괄호 ★★★★★ 스택으로 풀어야. push(), pop(), isEmpty()
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

public class RightBracket_2 {

	public static void main(String[] args){
		RightBracket_2 getter = new RightBracket_2();
		Scanner sc = new Scanner(System.in);
		String br = sc.next();
		System.out.println(getter.solution(br));
		sc.close();
	}
	
	public String solution(String br){		
		Stack<Character> st = new Stack<Character>();
		
		for(char x : br.toCharArray()) {
			if(x == '(') {
				st.push(x);
			} else if(x == ')') {
				if(st.isEmpty()) return "NO";
				st.pop();
			}
		}
		
		
		if(st.isEmpty()) return "YES";
		else return "NO";
	}
}