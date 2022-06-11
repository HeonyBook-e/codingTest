//5. K번째 큰 수 ★★★★★ TreeSet: add, remove, size, first, last
//설명
//
//현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
//
//현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
//
//기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
//
//만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다.
//
//
//입력
//첫 줄에 자연수 N(3<=N<=100)과 K(1<=K<=50) 입력되고, 그 다음 줄에 N개의 카드값이 입력된다.
//
//
//출력
//첫 줄에 K번째 수를 출력합니다. K번째 수가 존재하지 않으면 -1를 출력합니다.

package section4;

import java.util.*;

public class KthbiggestNum_2 {
	public static void main(String[] args) {
		KthbiggestNum_2 getter = new KthbiggestNum_2();
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		int k = sc.nextInt();
		int[] cards = new int[size];
		
		for(int i = 0; i < size; i++) {
			cards[i] = sc.nextInt();
		}
		
		System.out.println(getter.solution(size, k, cards));
		
		sc.close();		
	}
	
	public int solution(int size, int k, int[] cards) {
		int answer = 0;
		
		TreeSet<Integer> tSet = new TreeSet<Integer>(Collections.reverseOrder());
		
		for(int i = 0; i < size; i++) {
			for(int j = i+1; j < size; j++) {
				for(int h = j+1; h < size; h++) {
					tSet.add(cards[i] + cards[j] + cards[h]);
				}
			}
		}
		int cnt = 0;
		
		if(tSet.size() > k) return -1;
		else {
			for(int x: tSet) {
				cnt++;
				if(cnt == k) return x;
			}
		}
		return answer;
	}
	
}


