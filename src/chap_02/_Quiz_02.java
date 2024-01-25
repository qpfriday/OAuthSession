package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 115;
        int b = 121;
        String x = (a >= 120) ? "가능" : "불가능";
        String y = (b >= 120) ? "가능" : "불가능";

        System.out.println("키가 " + a + "cm 이므로 탑승 " + x + "합니다");
        System.out.println("키가 " + b + "cm 이므로 탑승 " + y + "합니다");
    }
}
