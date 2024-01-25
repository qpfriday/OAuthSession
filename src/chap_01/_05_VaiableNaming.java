package chap_01;

public class _05_VaiableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 버
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용가능
        // 3. 밑줄, 문자로 시작 가능
        // 4. 한 단어 또는 두개 이상의 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어는 사용 불가(public, stastic~)

        // 입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_No2 = "KE657"; // 밑줄 숫자포함
        // String -flightNo = "KE657"; //

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류기간

        String item1= "시계";
        String item2= "가방";
        // String 3item = "전자제품"

        // 프로그램의 흐름을 위해 사용되는 경우(크게 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";


        //상수: 절대 변하지 않음, 대문자
        final String CODE = "KR";
        //CODE = "us";
    }
}
