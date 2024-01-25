package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        // int result = number * number;
        // return result;
        // -> return number * number
        return getPower(number, 2);
    }
    public static  int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2 의 2 승을 구하기
        System.out.println(getPower(2, 2)); // 2 * 2 = 4


        // 3 의 3 승을 구하기
        System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27

        // 4 의 2 승을 구하기
        System.out.println(getPower(4,2)); // 4 * 4 = 16
    }
}
