package hw4;

class Dice {
    private int faces; // 주사위의 면의 개수

    public Dice() {
        this.faces = 6;
    }

    public Dice(int faces) {
        this.faces = faces;
    }

    // 주사위를 굴리는 메서드
    public int roll() {
        return (int) (Math.random() * faces) + 1;
    }

}
public class Hw08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice d = new Dice();
		System.out.println("주사위의 숫자: "+ d.roll());
	}

}
