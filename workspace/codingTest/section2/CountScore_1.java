//7. 점수계산
//
//설명
//
//OX 문제는 맞거나 틀린 두 경우의 답을 가지는 문제를 말한다.
//
//여러 개의 OX 문제로 만들어진 시험에서 연속적으로 답을 맞히는 경우에는 가산점을 주기 위해서 다음과 같이 점수 계산을 하기로 하였다.
//
//1번 문제가 맞는 경우에는 1점으로 계산한다. 앞의 문제에 대해서는 답을 틀리다가 답이 맞는 처음 문제는 1점으로 계산한다.
//
//또한, 연속으로 문제의 답이 맞는 경우에서 두 번째 문제는 2점, 세 번째 문제는 3점, ..., K번째 문제는 K점으로 계산한다. 틀린 문제는 0점으로 계산한다.
//
//예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고, 틀린 경우에는 0으로 표시하였을 때,
//
//점수 계산은 아래 표와 같이 계산되어, 총 점수는 1+1+2+3+1+2=10 점이다.
//
//
//시험문제의 채점 결과가 주어졌을 때, 총 점수를 계산하는 프로그램을 작성하시오.
//
//
//입력
//첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
//
//0은 문제의 답이 틀린 경우이고, 1은 문제의 답이 맞는 경우이다.
//
//
//출력
//첫째 줄에 입력에서 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 출력한다.

package section2;

import java.util.Scanner;

public class CountScore_1 {
	
	public static void main(String[] args){
		CountScore_1 getter = new CountScore_1();
		Scanner sc = new Scanner(System.in);
	 	int cnt = sc.nextInt();
		int[] ox = new int[cnt];
		for(int i = 0; i < cnt; i++) {
			ox[i] = sc.nextInt();
		}
		
		System.out.print(getter.solution(cnt, ox));
		sc.close();
	}

	public int solution(int cnt, int[] ox){
			int answer = 0;
			int acumScore = 0;
			
			for(int i = 0; i < cnt; i++){
				if(ox[i] == 1){
					acumScore++;
					answer+= acumScore;
				} else {
					acumScore = 0;
				}
			}
			
			return answer;
	}
}