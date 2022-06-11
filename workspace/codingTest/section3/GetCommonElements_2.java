//2. 공통원소 구하기★★★★★ Arrays.sort()
//설명
//
//A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
//
//두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//
//세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
//
//네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
//
//각 집합의 원소는 1,000,000,000이하의 자연수입니다.
//
//
//출력
//두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

package section3;

import java.util.*;

public class GetCommonElements_2{
	public static void main(String[] args){
		GetCommonElements_2 getter = new GetCommonElements_2();
		Scanner sc = new Scanner(System.in);
		
		int size1 = sc.nextInt();
		int[] array1 = new int[size1];
		for(int i = 0; i < size1; i++){
			array1[i] = sc.nextInt();
		}
		
		int size2 = sc.nextInt();
		int[] array2 = new int[size2];
		for(int i = 0; i < size2; i++){
			array2[i] = sc.nextInt();
		}
		
		for(int x : getter.solution(size1, array1, size2, array2)){
			System.out.print(x + " ");
		}
		
		sc.close();		
	}
	
	public ArrayList<Integer> solution(int size1, int[] array1, int size2, int[] array2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		int p1 = 0, p2 = 0;
		
		while(p1 < size1 && p2 < size2) {
			if( array1[p1]== array2[p2]) {
				answer.add(array1[p1++]);
				p2++;
			} else if(array1[p1] > array2[p2]) {
				p2++;
			} else if(array1[p1] < array2[p2]) {
				p1++;
			}
		}
		
		
		return answer;		
	}
}