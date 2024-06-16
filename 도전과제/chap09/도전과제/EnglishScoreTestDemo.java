package hw9;

public class EnglishScoreTestDemo {
	static <T extends Comparable<Object>> T findBest(T[] a) {
		T best = a[0];

		int number = 0;
		for (T e : a) {
			number += e.compareTo(best);
			best = a[number];
		}
		return best;
	}

	static <T> T findScore(T[] a, String name) {
		T best = a[0];
		for (T e : a) {
			best = (T) e.toString().substring(0, 3);
			if (best.equals(name)) {
				return e;
			}
		}
		return (T) "일치 x";
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
		String name = null;
		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));

		try {
			name = args[0];
			System.out.println("영어     점수 : " + findScore(ea, name));
			System.out.println("수학     점수 : " + findScore(ma, name));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령행 인자가 없습니다.");
		}
	}
}