package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님 중 노쇼 손님 있다고 가정
        // For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다");

            // 치킨을 가져가는 상황
            // 손님이 없다면?

            if (i == noShow) {
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님으로 넘어갑니다");
                continue; // 아래로 내려가지 않고 바로 다시 위로 올라감
            }

            sold++; // 판매처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-------------");

        // While 문
        sold = 0;
        int index = 1; // 손님 번호
        while (index <= 50) {
            System.out.println(index + "번 손님, 주문하신 치킨나왔습니다.");

            // 손님이 없다면 (noShow)
            if (index == noShow) {
                System.out.println(index + "번 손님, 노쇼로 인해 다음으로 넘어갑니다");
                index++;
                continue;
            }
            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다.");
    }
}
