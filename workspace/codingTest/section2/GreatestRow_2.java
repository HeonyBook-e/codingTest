//9. 격자판 최대합
//설명
//
//5*5 격자판에 아래롸 같이 숫자가 적혀있습니다.
//
//Image1.jpg
//
//N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
//
//
//입력
//첫 줄에 자연수 N이 주어진다.(2<=N<=50)
//
//두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
//
//
//출력
//최대합을 출력합니다.

package section2;

import java.util.Scanner;

public class GreatestRow_2 {
	public static void main(String[] args) {
		GreatestRow_2 getter = new GreatestRow_2();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[][] num = new int[cnt][cnt];
		
		for(int i = 0; i < cnt; i++){
			for(int j = 0; j < cnt; j++){
				num[j][i] = sc.nextInt();
			}	
		}
		
		System.out.print(getter.solution(cnt, num));
		sc.close();	 	
	}
	
	public int solution(int cnt, int[][] num){
		int answer = Integer.MIN_VALUE;
		int sum1, sum2;
		
		for(int i =0; i < cnt; i++) {
			sum1=sum2=0;
			for(int j =0; j < cnt; j++) {
				sum1 += num[i][j];
				sum2 += num[j][i];
			}
			answer = Math.max(answer, sum1); // Math.max(a, b) a와 b 중 큰 값이 선택됨.
			answer = Math.max(answer, sum2);
		}
		
		sum1=sum2=0;
		for(int i = 0; i < cnt; i++) {
			sum1+=num[i][i];
			sum2+=num[i][cnt-1-i];
		}
		answer = Math.max(answer, sum1); 
		answer = Math.max(answer, sum2);
		
		return answer;
	}
}