package hw2;
import java.util.Scanner;
public class Hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int time = sc.nextInt();
		
		// 입력 받은 초를 시간, 분, 초로 변환하여 각각의 변수에 저장
		int h= (time /  (1 * 60)) * 60% 60;
		int m = time / (1 * 60 ) % 60;
		int s = time / 1 % 60 ;
		
		System.out.println(h+"시간 "+m+"분"+s+"초"); // 변환된 시간 출력
		
	}

}
