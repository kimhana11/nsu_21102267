package hw2;
import java.util.Scanner;
public class Hw07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		
		 // 4와 5로 나누어지는지 여부 확인
        boolean and = (num % 4 == 0) && (num % 5 == 0);
        
        // 4 또는 5로 나누어지는지 여부 확인
        boolean or = (num % 4 == 0) || (num % 5 == 0);

        // 두 수 중 하나로는 나누어지지만 두 수 모두로는 나누어지지 않는지 여부 확인
        boolean xor = (num % 4 == 0) ^ (num % 5 == 0);

        // 결과 출력
        System.out.println("4와 5로 나누어지는가?: " + and);
        System.out.println("4 또는 5로 나누어지는가?: " + or);
        System.out.println("두 수 중 하나로는 나누어지지만 두 수 모두로는 나누어지지 않는가?: " + xor);
	}

}
