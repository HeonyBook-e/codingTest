//4. 단어 뒤집기
//설명
//
//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
//
//두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다.

package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseString_3 {

	public static void main(String[] args) {
		ReverseString_2 getter = new ReverseString_2();
		Scanner sc = new Scanner(System.in);
		int scannerCount = sc.nextInt();
		String[] inputs = new String[scannerCount];
		
		for(int i = 0; i < scannerCount; i++) {
			inputs[i] = sc.next();
		}
		for(String x : getter.solution(inputs)) {
			System.out.println(x);
		}
		sc.close();
	}
	
	public ArrayList<String> solution(String[] inputs) {
		ArrayList<String> answer = new ArrayList<String>();
		
		for(String x : inputs) { // String에서 한 Char씩 String으로 추출.
			char[] s = x.toCharArray();
			int lt = 0;
			int rt = x.length()-1;
			while(lt<rt) {
				char tmp = s[lt];
				s[lt] = s[rt];
				s[rt] = tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(s); // 스트링화.
			answer.add(tmp);
		}			
			
		return answer;
	}

}