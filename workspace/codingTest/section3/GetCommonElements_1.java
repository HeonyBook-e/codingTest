//2. 공통원소 구하기
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

public class GetCommonElements_1{
	public static void main(String[] args){
		GetCommonElements_1 getter = new GetCommonElements_1();
		Scanner sc = new Scanner(System.in);
		
		int size1 = sc.nextInt();
		ArrayList<Integer> array1 = new ArrayList<Integer>();;
		for(int i = 0; i < size1; i++){
			array1.add(sc.nextInt());
		}
		
		int size2 = sc.nextInt();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		for(int i = 0; i < size2; i++){
			array2.add(sc.nextInt());
		}
		
		for(int x : getter.solution(size1, array1, size2, array2)){
			System.out.print(x + " ");
		}
		
		sc.close();		
	}
	
	public ArrayList<Integer> solution(int size1, ArrayList<Integer> array1, int size2, ArrayList<Integer> array2){
		ArrayList<Integer> answer = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		for(int x : array1){
			temp.add(x);
		}
		for(int x : array2){
			temp.add(x);
		}
		
		temp.sort(null);
		
		for(int i = 0; i < temp.size()-1; i++){
			if(temp.get(i).equals(temp.get(i+1))){
				answer.add(temp.get(i));
			}
		}
		
		return answer;		
	}
}