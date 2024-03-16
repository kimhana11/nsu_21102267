package hw2;

public class Hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  i 값을 0부터 10까지 2씩 증가
		for(int i = 0; i <= 10; i += 2) {
			// 공백을 출력하는 내부 for문, k 값을 0부터 10 - i까지 2씩 증가
			for(int k = 0; k <= 10 - i; k += 2) {
				System.out.print(" ");
			}
			// 별표를 출력하는 내부 for문, j 값을 0부터 i까지 증가
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); // 한 줄 출력 후 줄 바꿈
		}
	}
}