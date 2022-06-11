//5. 소수(에라토스테네스 체)
//설명
//
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
//
//
//입력
//첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
//
//
//출력
//첫 줄에 소수의 개수를 출력합니다.

package section2;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimeNum_1 {
	public static void main(String[] args){
		PrimeNum_1 getter = new PrimeNum_1();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.print(getter.solution(num));
		sc.close();	
	}
	
	public int solution(int num){
		ArrayList<Integer> pn = new ArrayList<>();
		
		for(int number = num; number >= 1; number--){
			for(int i = 2; i <= number; i++){
				if(i != number){
					if(number%i == 0){
						break;
					} else {
						continue;
					}
				} 
				pn.add(i);
			}
		}	
		return pn.size();
	}
	
}