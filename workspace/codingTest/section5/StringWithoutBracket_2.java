//2. 괄호문자제거 ★★★★★ get(), add()
//설명
//
//입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//남은 문자만 출력한다.

package section5;

import java.util.*;

public class StringWithoutBracket_2 {

	public static void main(String[] args){
		StringWithoutBracket_2 getter = new StringWithoutBracket_2();
		Scanner sc = new Scanner(System.in);
		String br = sc.next();
		System.out.println(getter.solution(br));
		sc.close();
	}
	
	public String solution(String br){
		String answer = "";
		Stack<Character> st = new Stack<>();
		
		for(char x : br.toCharArray()) {
			if(x == ')') {
				while(st.pop() != '(');
			} else {
				st.push(x);
			}
		}
		
		for(int i = 0; i < st.size(); i++) {
			answer += st.get(i);
		}
		
		return answer;
	}
}