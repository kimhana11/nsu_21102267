package hw2;
import java.util.Scanner;
public class Hw09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전공 이수 학점 :");
		int major = sc.nextInt(); // 전공 이수 학점 입력 받음
		System.out.print("교양 이수 학점 :");
		int liberal = sc.nextInt();// 교양 이수 학점 입력 받음
		System.out.print("일반 이수 학점 :");
		int general = sc.nextInt();// 일반 이수 학점 입력 받음
		
		if(major>=70) {
			if(liberal>=30 && general>=30) {
				System.out.print("졸업 가능");
			}
			else if((liberal+general)>=80) {
				System.out.print("졸업 가능");
			}
			else {
				System.out.print("졸업 불가능");
			}
		}else System.out.print("졸업 불가능");
	}

}
