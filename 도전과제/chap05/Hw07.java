package hw5;

public class Hw07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,2,4,1,5};
		int[] b = {3,2,4,1};
		int[] c = {3,2,4,1,5};
		int[] d = {2,7,1,8,2};
		
        System.out.println("배열 a와 배열 c는 내용이 같습니다: " + isArrayEqual(a, c));
        System.out.println("배열 a와 배열 b는 내용이 같습니다: " + isArrayEqual(a, b));
        System.out.println("배열 a와 배열 d는 내용이 같습니다: " + isArrayEqual(a, d));
    }

    public static boolean isArrayEqual(int[] array1, int[] array2) {
        //배열의 길이가 다르면 내용이 다르다고 판단
        if (array1.length != array2.length) {
            return false;
        }

        // 각 배열의 원소를 순회하면서 내용이 같은지 비교
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        // 모든 원소가 같으면 내용이 같다고 판단
        return true;
    }
}