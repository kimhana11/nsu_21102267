package hw4;

class Line{
    private double length; // 길이 속성

    // 생성자
    public Line(double length) {
        this.length = length;
    }

    // 길이를 비교하여 같은 직선인지 확인하는 메서드
    public boolean isSameLine(Line otherLine) {
        return this.length == otherLine.length;
    }
}

public class Hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Line a = new Line(1);
		Line b= new Line(1);
		
		System.out.println(a.isSameLine(b));
		System.out.println(a==b);
	}

}
