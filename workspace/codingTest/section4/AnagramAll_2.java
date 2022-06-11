package section4;

import java.util.*;
public class AnagramAll_2{
	public static void main(String[] args){
		AnagramAll_2 getter = new AnagramAll_2();
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
		
		for(char x : str2.toCharArray()) map2.put(x, map2.getOrDefault(x, 0)+1);
		int len = map2.size()-1;
		for(int i = 0; i < len; i++) map1.put(str1.charAt(i), map1.getOrDefault(str1.charAt(i), 0)+1);
		
		
		
		int pl = 0;
		
		for(int pr = len; pr < str1.length(); pr++){
			map1.put(str1.charAt(pr), map1.getOrDefault(str1.charAt(pr), 0)+1);

			if(map1.equals(map2)) answer++;
			
			map1.put(str1.charAt(pl), map1.get(str1.charAt(pl))-1);
			if(map1.get(str1.charAt(pl)) == 0) map1.remove(str1.charAt(pl));
			pl++;
		}
		
		return answer;
	}
}