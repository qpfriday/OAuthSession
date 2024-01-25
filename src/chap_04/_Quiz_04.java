package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차
        boolean withDisabledPerson = true; // 장애인 차량

        int fee = hour * 4000; // 주차 정산 요금

        // 30000원 초과시 일일 최대 요금 설정
        if (fee >= 30000) {
            fee = 30000;
        }

        // 경차, 장애인 차량 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
