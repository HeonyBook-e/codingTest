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

import java.util.LinkedHashSet; // Set 구현 클래스 중 순서를 보장하는 집합. 넣은 순서대로 저장됨. 그냥 HashSet은 순서 보장 안 함. TreeSet은 오름차순 정렬.
import java.util.Scanner;
import java.util.Set;

public class DelDuplChar_1 {

	public static void main(String[] args) {
		DelDuplChar_1 getter = new DelDuplChar_1();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		System.out.println(getter.solution(input));
		sc.close();
	}
	
	public String solution(String input) {
		String answer = "";		
		char[] c = input.toCharArray();		
		Set<Character> set = new LinkedHashSet<Character>();		
		for(char x : c) {
			set.add(x);
		}		
		for(int i = 0; i < set.size(); i ++) {
				answer += set.toArray()[i];
		}		
		return answer;
	}

}
