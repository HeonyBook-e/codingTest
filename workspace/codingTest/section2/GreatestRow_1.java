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

public class GreatestRow_1 {
	public static void main(String[] args) {
		GreatestRow_1 getter = new GreatestRow_1();
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
		int answer = 0;
		int tmp = 0;

		for(int i = 0; i < cnt; i++){
			for(int j = 0; j < cnt; j++){
				tmp += num[j][i];
			}
			if(answer < tmp){
				answer = tmp;
			}
			tmp = 0;
			for(int j = 0; j < cnt; j++){
				tmp += num[i][j];
			}
			if(answer < tmp){
				answer = tmp;
			}
			tmp = 0;			
		}
		
		for(int i = 0; i < cnt; i++){
			tmp += num[i][i];
		}
		if(answer < tmp){
				answer = tmp;
		}
		tmp = 0;	
		for(int i = 0; i < cnt; i++){
			tmp += num[i][cnt-1-i];
		}
		if(answer < tmp){
				answer = tmp;
		}
		tmp = 0;		
	
		return answer;
	}
}