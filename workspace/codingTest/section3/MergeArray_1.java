//1. 두 배열 합치기★★★★★
//설명
//
//오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.
//
//
//입력
//첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
//
//두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
//
//세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
//
//네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
//
//각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.
//
//
//출력
//오름차순으로 정렬된 배열을 출력합니다.

package section3;

import java.util.*;

public class MergeArray_1{
	public static void main(String[] args){
		MergeArray_1 getter = new MergeArray_1();
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

		for(int x : array1){
			answer.add(x);
		}
		for(int x : array2){
			answer.add(x);
		}
		
		answer.sort(null);
		
		return answer;		
	}
}