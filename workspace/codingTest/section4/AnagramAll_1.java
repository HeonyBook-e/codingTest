package section4;

import java.util.*;
public class AnagramAll_1{
	public static void main(String[] args){
		AnagramAll_1 getter = new AnagramAll_1();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		
		System.out.println(getter.solution(str1, str2));
		sc.close();
	}
	
	public int solution(String str1, String str2){
		int answer = 0;
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
		
		for(char x : str1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		for(char x : str2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		
		if(map1.equals(map2)) answer++;
		
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		
		for(int i = char2.length; i < char1.length; i++){
			map1.put(char1[i], map1.getOrDefault(char1[i], 0)+1);
			
			map1.put(char1[i-char2.length], map1.get(char1[i-char2.length])-1);
			if(map1.get(char1[i-char2.length]) == 0) map1.remove(char1[i-char2.length]);

			if(map1.equals(map2)) answer++;
		}
		
		return answer;
	}
}