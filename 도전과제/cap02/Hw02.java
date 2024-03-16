package hw2;

import java.util.Scanner;
public class Hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.print("정수를 입력하세요: "); 
	    Scanner sc = new Scanner(System.in); 
	    int num = sc.nextInt(); // 정수 입력 받음
	    int result = num * num; // 입력된 정수의 제곱을 계산하여 result 변수에 저장
	    System.out.print(num + "의 제곱은 " + result); // 결과 출력
	}

}
