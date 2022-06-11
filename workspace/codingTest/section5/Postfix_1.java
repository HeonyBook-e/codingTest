//4. 후위식 연산(postfix)
//설명
//
//후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
//
//만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
//
//
//입력
//첫 줄에 후위연산식이 주어집니다. 연산식의 길이는 50을 넘지 않습니다.
//
//식은 1~9의 숫자와 +, -, *, / 연산자로만 이루어진다.
//
//
//출력
//연산한 결과를 출력합니다.

package section5;

import java.util.*;

public class Postfix_1{
	public static void main(String[] args){
		Postfix_1 getter = new Postfix_1();
		Scanner sc = new Scanner(System.in);
		String ex = sc.next();
		
		System.out.print(getter.solution(ex));
		sc.close();
	}
	
	public int solution(String ex){
		Stack<Integer> st = new Stack<>();
		
		for(char x : ex.toCharArray()){
			if(Character.isDigit(x)){
				st.push(Character.getNumericValue(x));
			} else {
				int post = st.pop();
				int pre = st.pop();
				if(x == '+') st.push(pre + post);
				if(x == '-') st.push(pre - post);
				if(x == '*') st.push(pre * post);
				if(x == '/') st.push(pre / post);
			}
		}
		
		return st.pop();
	}
}