package hw2;
import java.util.Scanner;

public class Hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? "); 
		int r = sc.nextInt(); 

		System.out.print("원기둥의 높이는? "); 
		int h = sc.nextInt();

		double result = 3.14 * r * r * h; // 원기둥의 부피 계산하여 result 변수에 저장
		System.out.println("원기둥의 부피는 " + result); // 결과 출력
	}

}
