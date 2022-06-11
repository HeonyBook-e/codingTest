//3. 최대 매출★★★★★ Sliding Window(not 이중for문)
//설명
//
//현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
//
//만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
//
//12 1511 20 2510 20 19 13 15
//
//연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
//
//여러분이 현수를 도와주세요.
//
//
//입력
//첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
//
//두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.
//
//
//출력
//첫 줄에 최대 매출액을 출력합니다.

package section3;
import java.util.*;

public class MaxSales_1{
	public static void main(String[] args){
		MaxSales_1 getter = new MaxSales_1();
		Scanner sc = new Scanner(System.in);
		
		int bDay = sc.nextInt();
		int sDay = sc.nextInt();
		int[] sales = new int[bDay];
		for(int i = 0; i < bDay; i++){
			sales[i] = sc.nextInt();
		}
		
		System.out.println(getter.solution(bDay, sDay, sales));
		sc.close();
	}
	
	public int solution(int bDay, int sDay, int[] sales){
		int answer = Integer.MIN_VALUE;
		int sumSales = 0;
		for(int i = 0; i < bDay-sDay+1; i++){
			if(i == 0){
				for(int j = 0; j < sDay; j++){
					sumSales += sales[j];
				}
				answer = sumSales;
			} else {
				sumSales = sumSales - sales[i-1] + sales[i+sDay-1];
				if(answer < sumSales){
					answer = sumSales;
				}
			}
		}
		
		return answer;
	}
}