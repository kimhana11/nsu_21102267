package hw9;

public class EnglishScore implements Comparable<Object> {
	String name;
	int score;

	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	@Override
	public int compareTo(Object e) {
		EnglishScore score2 = (EnglishScore) e;
		return (score > score2.score) ? 1 : 0;
	}
}