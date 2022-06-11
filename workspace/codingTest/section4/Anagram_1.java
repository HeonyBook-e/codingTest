//2. 아나그램(해쉬)
//설명
//
//Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
//
//예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
//
//알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
//
//길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.
//
//
//입력
//첫 줄에 첫 번째 단어가 입력되고, 두 번째 줄에 두 번째 단어가 입력됩니다.
//
//단어의 길이는 100을 넘지 않습니다.
//
//
//출력
//두 단어가 아나그램이면 “YES"를 출력하고, 아니면 ”NO"를 출력합니다.

package section4;

import java.util.*;
public class Anagram_1{
	public static void main(String[] args){
		Anagram_1 getter = new Anagram_1();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(getter.solution(str1, str2));
		sc.close();		
	}
	
	public String solution(String str1, String str2){
		String answer = "";
		
		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		
		for(int i = 0; i < chr1.length; i++){
			if(!map1.containsKey(chr1[i])){
				map1.put(chr1[i], 1);
			}else{
				map1.put(chr1[i], map1.get(chr1[i]) +1);
			}
		}
		for(int i = 0; i < chr2.length; i++){
			if(!map2.containsKey(chr2[i])){
				map2.put(chr2[i], 1);
			}else{
				map2.put(chr2[i], map2.get(chr2[i]) +1);
			}
		}
		
		if(map1.equals(map2)) answer = "YES";
		else answer = "NO";
		
		return answer;
	}
}