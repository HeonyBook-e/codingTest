//11. 문자열 압축
//설명
//
//알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
//
//문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
//
//단 반복횟수가 1인 경우 생략합니다.
//
//
//입력
//첫 줄에 문자열이 주어진다. 문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 줄에 압축된 문자열을 출력한다.

package section1;

import java.util.Scanner;

public class CompressString_1 {

	public static void main(String[] args) {
		CompressString_1 getter = new CompressString_1();
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(getter.solution(input));
		sc.close();
	}

	public String solution(String input){
		String answer = "";
		char[] c = input.toCharArray();
		int count = 1;
		
		for(int i = 0; i < input.length()-1; i++){
			if(i != input.length()-2){
				if(c[i] != c[i+1]){
					answer+= Character.toString(c[i]) + count;
					count=1;
				} else {
					count++;
				}	
			} else {
				if(c[i] != c[i+1]){
					answer += Character.toString(c[i]) + count + Character.toString(c[i+1]);
				} else {
					count++;
					answer += Character.toString(c[i]) + count;
				}
			}			
		}	
		answer = answer.replaceAll("1", "");
		return answer;
	}
}
