package ch5;


//197
public class EnumDemo {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Gender gender = Gender.FEMALE;
		if(gender ==Gender.MALE) {
			System.out.println(Gender.MALE+"는 병역 의무가 있다.");
		}else {
			System.out.println(Gender.FEMALE+"는 병역 의무가 없다.");
		}
		
//		if(gender ==Direction.SOUTH) {
//			System.out.println(Direction.SOUTH+"는 누구?");
//		}gender = 5;
//	}

}

enum Gender {MALE, FEMALE}
enum Direction{EAST,WEST,SOUTH, NORTH}
}
