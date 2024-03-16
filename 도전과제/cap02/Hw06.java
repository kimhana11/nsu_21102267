package hw2;
import java.util.Scanner;

public class Hw06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨온도(°F)를 입력해주세요: ");
		double f = sc.nextDouble();
		double c = (f - 32) * 5 / 9;
		
		// 섭씨 온도 출력
		System.out.println("섭씨 온도는 " + c + "도 입니다.");
	}

}
