//8. 등수구하기
//설명
//
//N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
//
//같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
//
//즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
//
//
//입력
//첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
//
//
//출력
//입력된 순서대로 등수를 출력한다.

package section2;

import java.util.Scanner;

public class GetRanking_1 {
	public static void main(String[] args) {
		GetRanking_1 getter = new GetRanking_1();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int[] score = new int[cnt];
		for(int i = 0; i < cnt; i++){
			score[i] = sc.nextInt();	
		}
		
		for(int x : getter.solution(cnt, score)){
			System.out.print(x + " ");
		}
		sc.close();
	}
	
	public int[] solution(int cnt, int[] score){
		int[] answer = new int[cnt];
		int rank = 1;
		for(int i = 0; i < cnt; i++){
			for(int j = 0; j < cnt; j++){
				if(i != j){
					if(score[i] < score[j]){
						rank++;
					}	
				}
			}
			answer[i] = rank;
			rank = 1;
		}
		
		return answer;
	}
}
