package hw2;

public class Hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 char c = 'g'; // 임의의 소문자로 초기화된 변수 c
	        int difference = (int) 'A' - (int) 'a'; // 대문자와 소문자의 정수 값 차이 계산
	        
	        // 소문자를 대문자로 변환하여 출력
	        char upperCaseC = (char) (c + difference);
	        System.out.println("대문자로 변환된 결과: " + upperCaseC);
	}

}
