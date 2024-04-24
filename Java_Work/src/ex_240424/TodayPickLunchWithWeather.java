package ex_240424;

import java.util.Scanner;

public class TodayPickLunchWithWeather {

	public static void main(String[] args) {

//		출력: 오늘 점심 메뉴 무엇을 먹을까요 프로젝트 , 제목
//		출력: 날씨가 어떤가요? 1.비 2.흐림 3.맑음 4.바람 5. 기타
		
		// 작업순서1, 입력 받은 내용을 숫자, 문자열 등을 읽을 도구 필요. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("오늘 점심 메뉴 무엇을 먹을까요 프로젝트");
		System.out.println("날씨가 어떤가요? 1.비 2.흐림 3.맑음 4.바람 5.기타");
//		System.out.println("숫자를 선택해주세요.");
		System.out.println("날씨를 적어주세요. 가정");
		System.out.println("=================================");
		
		// 순서2, 선택 받은 숫자 임시로 담을 변수 지정. 
//		int pickNumber = scanner.nextInt();
		
		// 순서2-2, 문자열로 날씨를 담을 변수 지정. 
		String weather = scanner.next();
		
		// 순서3, 다중 if 문 이용해서, 조건 설정. 
//		1번  비가 오는 경우 -> 삼선우동
//		2번  흐림 일 경우 -> 밀면 
//		3번  맑음 일 경우 -> 된장찌개
//		4번  바람이 많이 부는 경우 -> 돼지국밥
//		if(pickNumber == 1) {
//			System.out.println("비가 오는 경우 삼선우동 추천합니다.");
//		} else if (pickNumber == 2) {
//			System.out.println("흐림 일 경우 밀면 추천합니다.");
//		} else if (pickNumber == 3) {
//			System.out.println("맑음 일 경우 된장찌개 추천합니다.");
//		} else if (pickNumber == 4) {
//			System.out.println("바람이 많이 부는 경우 돼지국밥 추천합니다.");
//		} else {
//			System.out.println("디폴트 된장찌개 추천합니다.");
//		}
		// 숫자 비교 할 경우, 연산자 ==
		// 문자열를 비교 할 경우, 문자열.equals("") => 
		if(weather.equals("비")) {
			System.out.println("비가 오는 경우 삼선우동 추천합니다.");
		} else if (weather.equals("흐림")) {
			System.out.println("흐림 일 경우 밀면 추천합니다.");
		} else if (weather.equals("맑음")) {
			System.out.println("맑음 일 경우 된장찌개 추천합니다.");
		} else if (weather.equals("바람")) {
			System.out.println("바람이 많이 부는 경우 돼지국밥 추천합니다.");
		} else {
			System.out.println("디폴트 비빔밥 추천합니다.");
		}
		
		// 자원 반납
		scanner.close();
		

	}

}







