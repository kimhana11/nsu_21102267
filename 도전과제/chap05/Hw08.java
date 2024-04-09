package hw5;
import java.util.*;
public class Hw08 {

    enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayStr = scanner.nextLine().toUpperCase(); // 입력 받은 문자열을 대문자로 변환
        printEmotion(dayStr);
        scanner.close();
    }

    public static void printEmotion(String dayStr) {
        Day day = Day.valueOf(dayStr); // 대문자로 변환된 문자열을 해당하는 요일로 변환

        switch (day) {
            case MONDAY:
                System.out.println("월요일은 싫다");
                break;
            case FRIDAY:
                System.out.println("금요일은 좋다");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말은 최고");
                break;
            default:
                System.out.println("그저 그렇다");
        }
    }
}