//5. 특정 문자 뒤집기
//설명
//
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.
//
//
//출력
//첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.

package section1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSpecificChar_1 {

	public static void main(String[] args) {
		ReverseSpecificChar_1 getter = new ReverseSpecificChar_1();
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(getter.solution(input));
		sc.close();
	}
	
	public String solution(String input) {
		String answer = "";
		Stack<Character> tmp = new Stack<Character>();
		
		for(int i = 0; i < input.length(); i ++) {
			if(Character.isLetter(input.charAt(i))) {
				tmp.push(input.charAt(i));
			}
		}
		
		for(int i = 0; i < input.length(); i ++) {
			if(Character.isLetter(input.charAt(i))){				
				answer += tmp.pop();				
			} else {
				answer += input.charAt(i);
			}
		}
		
		return answer;
	}

}
