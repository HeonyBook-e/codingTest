//6. 뒤집은 소수
//설명
//
//N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
//
//예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
//
//첫 자리부터의 연속된 0은 무시한다.
//
//
//입력
//첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.
//
//각 자연수의 크기는 100,000를 넘지 않는다.
//
//
//출력
//첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversedPrimeNum_1 {
	public static void main(String[] args) {
		ReversedPrimeNum_1 getter = new ReversedPrimeNum_1();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		String[] pn = new String[cnt];
		for(int i = 0; i < cnt; i++){
			pn[i] = sc.next();
		}
		
		for(int x : getter.solution(cnt, pn)){
			System.out.print(x + " ");	
		}
		
		sc.close();
	}
	
	public ArrayList<Integer> solution(int cnt, String[] pn){
		ArrayList<Integer> temp = new ArrayList<>();
		
		for(int i = 0; i < cnt; i++){
			char[] c = pn[i].toCharArray();
			for(int j = 0; j < c.length/2; j++){
				char tmp = c[j];
				c[j] = c[c.length-1-j];
				c[c.length-1-j] = tmp;
			}
			String reversedTmp = "";
			for(int j = 0; j < c.length; j++){
				reversedTmp += c[j];
			}
			temp.add(Integer.parseInt(reversedTmp));
		}
		
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i = 0 ; i < temp.size(); i++){
			for(int j = 2; j <= temp.get(i); j++){
				if(temp.get(i) != j){
					if(temp.get(i)%j == 0){
						break;
					} else {
						continue;
					}
				} else {
					answer.add(j);				
				}
			}
		}
		
		return answer;		
	}
	
			
}