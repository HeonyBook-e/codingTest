//10. 가장 짧은 문자거리
//설명
//
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
package section1;

import java.util.Scanner;

public class ShortestDistance_2 {
	public static void main(String[] args) {
		ShortestDistance_2 getter = new ShortestDistance_2();
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		char input2 = sc.next().charAt(0);
		
		for(int x : getter.solution(input1, input2)) {
			System.out.print(x+" ");
		}
		
		sc.close();	
	}
	
	public int[] solution(String input1, char input2){
		int[] answer = new int[input1.length()];
		int p = 1000;
		
		for(int i = 0; i < input1.length(); i++) {
			if(input1.charAt(i) == input2) {
				p=0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		
		p = 1000;
		
		for(int i = input1.length()-1; i >= 0; i--) {
			if(input1.charAt(i) == input2) {
				p=0;
			} else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}
}