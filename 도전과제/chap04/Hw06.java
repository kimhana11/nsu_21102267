package hw4;

class Complex{

    private double r; // 실수부
    private double i; // 허수부

    // 생성자 - 허수부가 없는 경우
    public Complex(double real) {
        this.r = real;
        this.i = 0.0;
    }

    // 생성자 - 실수부와 허수부가 모두 있는 경우
    public Complex(double real, double imaginary) {
        this.r = real;
        this.i = imaginary;
    }

	
    // 복소수 출력 메서드
    public void print() {
        if (i >= 0) {
            System.out.printf("%.2f + %.2fi\n", r, i);
        } else {
            System.out.printf("%.2f - %.2fi\n", r, Math.abs(i));
        }
    }
}
public class Hw06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(2.0);
		c1.print();
		
		Complex c2 = new Complex(1.5,2.5);
		c2.print();
		
	}

}
