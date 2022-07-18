package com.ssafy.hw.step4;

public class DayCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월과 일을 입력하세요.");
		int month = scan.nextInt();
		int day = scan.nextInt();
		
		int arr[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int result = 0;
		result += day;
		
		for(int i=0;i<month-1;i++) {
			result += arr[i];
			
		}
		
		
		System.out.println(month + "월 " + day + "일은 " +  result +"번째 날입니다.");
	}

}
