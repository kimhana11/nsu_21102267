package hw2;
import java.util.Scanner;
public class Hw08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		// 입력 받은 숫자의 각 자릿수를 계산하여 변수에 저장
		int a = num/100;
		int b = (num%100)/10;
		int c = (num%100)%10;
		
		int sum = a+b+c;// 각 자릿수의 합 계산
		
		System.out.print("각 자릿수의 합 = "+sum);
	}

}
