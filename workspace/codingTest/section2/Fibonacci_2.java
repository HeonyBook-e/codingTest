//4. 피보나치 수열
//설명
//
//1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
//
//2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
//
//
//입력
//첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
//
//
//출력
//첫 줄에 피보나치 수열을 출력합니다.

package section2;

import java.util.Scanner;

public class Fibonacci_2 {
	
	public static void main(String[] args){
		Fibonacci_2 getter = new Fibonacci_2();
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		
		for(int x : getter.solution(cnt)){
			System.out.print(x + " ");
		}
		
		sc.close();
	}
	
	
	public int[] solution(int cnt){
		int[] answer = new int[cnt];
		answer[0] = 1;
		answer[1] = 1;
		
		if(cnt <= 2){
			return answer;
		} else {
			for(int i = 2; i < cnt; i++){
				answer[i] = answer[i-1] + answer[i-2];
			}
			return answer; 
		}
	}

}
