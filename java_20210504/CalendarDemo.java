package java_20210504;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2021;
		int month = 5;
		int day = 4;

		int leapYear = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// and문이 or문보다 연산순서가 앞서므로 괄호가 필요없긴함.
		boolean isLeafYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0; // 앞에 and문이 false여도 뒤에 조건이 true이므로
																					// 전체 or문은 true.
		if (isLeafYear) {
			monthArray[1] = 29;
		}
		int numOfDay = (year - 1) * 365 + leapYear; // 2021년 4월 30일까지의 총일수
		for (int i = 0; i < month - 1; i++) {
			numOfDay += monthArray[i];

		}
		numOfDay += day;

		if (numOfDay % 7 == 1) {
			System.out.printf("%d년 %d월 %d일은 월요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 2) {
			System.out.printf("%d년 %d월 %d일은 화요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 3) {
			System.out.printf("%d년 %d월 %d일은 수요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 4) {
			System.out.printf("%d년 %d월 %d일은 목요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 5) {
			System.out.printf("%d년 %d월 %d일은 금요일입니다.%n", year, month, day);
		} else if (numOfDay % 7 == 6) {
			System.out.printf("%d년 %d월 %d일은 토요일입니다.%n", year, month, day);
		} else {
			System.out.printf("%d년 %d월 %d일은 일요일입니다.%n", year, month, day);
		}
	}
}
