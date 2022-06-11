//4. 연속 부분수열★★★★★ Sliding Window(not 이중for문)
//설명
//
//N개의 수로 이루어진 수열이 주어집니다.
//
//이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
//
//만약 N=8, M=6이고 수열이 다음과 같다면
//
//1 2 1 3 1 1 1 2
//
//합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
//
//
//입력
//첫째 줄에 N(1≤N≤100,000), M(1≤M≤100,000,000)이 주어진다.
//
//수열의 원소값은 1,000을 넘지 않는 자연수이다.
//
//
//출력
//첫째 줄에 경우의 수를 출력한다.

package section3;
	
import java.util.*;

public class SumationSequence_2{
	public static void main(String[] args){
		SumationSequence_2 getter = new SumationSequence_2();
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int sum = sc.nextInt();
		int[] seq = new int[len];
		for(int i = 0; i < len; i++){
			seq[i] = sc.nextInt();
		}
		
		System.out.println(getter.solution(len, sum, seq));
		sc.close();
	}
	
	public int solution(int len, int sum, int[] seq){
		int answer = 0;
		
		int pl = 0;
		int pr = 0;
		int tempSum = 0;
		
		while(pr < len) {	
			if(tempSum > sum) {
				tempSum -= seq[pl++];
			} else if(tempSum < sum) {
				tempSum += seq[pr++];
			}
			
			if(tempSum == sum) {
				answer++;
				if(pr < len) tempSum += seq[pr++];
				if(pl < len) tempSum -= seq[pl++];
			} 
		}
		
		return answer;
	}
}