//9. 숫자만 추출
//설명
//
//문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
//
//만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//
//추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
//
//
//입력
//첫 줄에 숫자가 섞인 문자열이 주어집니다. 문자열의 길이는 100을 넘지 않습니다.
//
//
//출력
//첫 줄에 자연수를 출력합니다.

package section1;

import java.util.Scanner;

public class SubstractNumber_2 {

	public static void main(String[] args) {
		SubstractNumber_2 getter = new SubstractNumber_2();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(getter.solution(input));
		sc.close();
	}
	
	public int solution(String input) {
		int answer = 0;
		
		char[] c = input.toCharArray();
		
		for(char x : c) {
			//방법1: Character.isDigit(); 사용.
//			if(Character.isDigit(x)) {
//				answer = answer * 10 + x;
//			}
			
			//방법2: ASCII코드 사용. 숫자(0~9)는 48~57.
			if( x >= 48 && x <= 57) {
				answer = answer * 10 + (x - 48);
			}
		}
		
		return answer;
	}

}
