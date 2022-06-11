//6. 중복문자제거
//설명
//
//소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
//
//중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
//
//
//입력
//첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 중복문자가 제거된 문자열을 출력합니다.

package section1;

import java.util.Scanner;

public class DelDuplChar_2 {

	public static void main(String[] args) {
		DelDuplChar_2 getter = new DelDuplChar_2();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(getter.solution(input));
		sc.close();
	}
	
	public String solution(String input) {
		String answer = "";		
		for(int i = 0; i  < input.length(); i++) {
			int a = input.indexOf(input.charAt(i)); //특정 char가 첫 번째로 발견되는 인덱스 위치
			if(a == i) {
				answer += input.charAt(i);
			}
		}		
		return answer;
	}

}
