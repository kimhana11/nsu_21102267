package hw4;

class Car{
	
    private static int numOfCar = 0; // 생성된 모든 자동차 수
    private static int numOfRedCar = 0; // 빨간색 자동차 수
    private String color; // 자동차 색상
	
    // 생성자
    public Car(String color) {
        this.color = color.toLowerCase(); // 색상을 소문자로 변환하여 저장
        numOfCar++; // 모든 자동차 수 증가
        if (this.color.equals("red")) {
            numOfRedCar++; // 빨간색 자동차 수 증가
        }
    }

    // 접근자
    public static int getNumOfCar() {
        return numOfCar;
    }

    public static int getNumOfRedCar() {
        return numOfRedCar;
    }

    public String getColor() {
        return color;
    }

	
}
public class Hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("RED");
		
		System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",Car.getNumOfCar(),Car.getNumOfRedCar());
		
		
	}

}
