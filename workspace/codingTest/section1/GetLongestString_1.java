//3. 문장 속 단어
//설명
//
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//
//문장속의 각 단어는 공백으로 구분됩니다.
//
//
//입력
//첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//
//출력
//첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
//
//단어를 답으로 합니다.



package section1;

import java.util.ArrayList;
import java.util.Scanner;

public class GetLongestString_1 {

	public static void main(String[] args) {
		GetLongestString_1 getter = new GetLongestString_1();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();		
		System.out.println(getter.solution(input));
		sc.close();
	}

	public String solution(String input) {
		String answer = "";		
		String a = "";
		
		ArrayList list = new ArrayList();
		
		int length = input.split(" ").length;
		
		for(int i = 0; i < length; i++) {
			if(input.lastIndexOf(" ") != -1) {
				a = input.substring(input.lastIndexOf(" "));
				input = input.substring(0, input.lastIndexOf(" "));
				list.add(a);
			}else{
				list.add(input);
			}
			
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(answer.length() <= ((String) list.get(i)).length()) {
				answer = list.get(i).toString();
			}
		}
		
		return answer.trim();
	}

}
