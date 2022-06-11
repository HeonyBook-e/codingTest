//1. 큰 수 출력하기
//설명
//
//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
//
//(첫 번째 수는 무조건 출력한다)
//
//
//입력
//첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.
//
//
//출력
//자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class BiggerNum_2 {

	public static void main(String[] args) {
		BiggerNum_2 getter = new BiggerNum_2();
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		int[] arr = new int[digit];
		
		for(int i = 0; i < digit; i++) {
			arr[i] = sc.nextInt();
		}

		for(int x : getter.solution(digit, arr)) {
			System.out.print(x + " ");
		}
		
		sc.close();
	}
	
	public ArrayList<Integer> solution(int digit, int[] input){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(input[0]);
		
		for(int i = 0; i < digit; i++){
			if(input[i-1] < input[i]){
				answer.add(input[i]);
			}	
		}
		
		return answer;
	}

}
