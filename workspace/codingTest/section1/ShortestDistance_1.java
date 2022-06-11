//10. 가장 짧은 문자거리
//설명
//
//한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
//
//문자열의 길이는 100을 넘지 않는다.
//
//
//출력
//첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
package section1;

import java.util.Scanner;

public class ShortestDistance_1 {
	public static void main(String[] args) {
		ShortestDistance_1 getter = new ShortestDistance_1();
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		char input2 = sc.next().charAt(0);
		
		System.out.println(getter.solution(input1, input2));
		sc.close();	
	}
	
	public String solution(String input1, char input2){
		String answer = "";
		
		input1 = input1.toUpperCase();
		input2 = Character.toUpperCase(input2);
		
		char[] c = input1.toCharArray();
		
		boolean loopFlag = false;
		
		for(int i = 0; i < c.length; i++){
			for(int h = 0; h < c.length; h ++){
				if(c[h] == input2){
					loopFlag = true;
					break;
				}
			}
			
			if(loopFlag){
				for(int j = 0; j < c.length; j ++){
					if( i-j < 0){
						if(c[i+j]==input2){
							answer = answer + j + " ";
							loopFlag = false;
							break;
						} 
					}else if (i+j >= c.length){
						if(c[i-j] == input2){
							answer = answer + j + " ";
							loopFlag = false;
							break;
						}		
					} else {
						if(c[i+j] == input2 || c[i-j] == input2){
							answer = answer + j + " ";
							loopFlag = false;
							break;
						}	
					}		
				}
			} else {
				answer = answer + "NaN  ";
			}
		}
		
		return answer;
	}
}