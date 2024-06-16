package hw9;

public class MathScore implements Comparable<Object> {
	String name;
	int score;

	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	@Override
	public int compareTo(Object e) {
		MathScore score2 = (MathScore) e;
		return (score > score2.score) ? 1 : 0;
	}
}