//1. 학급 회장(해쉬)
//설명
//
//학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
//
//투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
//
//선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
//
//반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.
//
//
//입력
//첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
//
//두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.
//
//
//출력
//학급 회장으로 선택된 기호를 출력합니다.

package section4;

import java.util.*;
public class ClassLeader_1{
	public static void main(String[] args){
		ClassLeader_1 getter = new ClassLeader_1();
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String can = sc.next();
		
		System.out.println(getter.solution(len, can));
		sc.close();		
	}
	
	public String solution(int len, String can){
		String answer = "";
		
		int A = 0, B = 0, C = 0, D = 0, E = 0;
		
		char[] cans = can.toCharArray();
		
		for(int i = 0; i < len; i++){
			switch(cans[i]){
				case 'A':
					A++;
					break;
				case 'B':
					B++;
					break;
				case 'C':
					C++;
					break;
				case 'D':
					D++;
					break;
				case 'E':
					E++;
					break;
			}
		}
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("A");
		array.add("B");
		array.add("C");
		array.add("D");
		array.add("E");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", A);
		map.put("B", B);
		map.put("C", C);
		map.put("D", D);
		map.put("E", E);
		
		int max = 0;
		
		for(int i = 0; i < map.size(); i++){
			if(max < map.get(array.get(i))){
				max = map.get(array.get(i));
				answer = array.get(i);
			}
		}
		
		
		return answer;
	}
}