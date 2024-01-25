package _01_DataType;

public class _02_NamingVariableAndConstant {
    public static void main(String[] args) {

        // #1. 변수의 이름
        boolean aBcD; // 가능하지만 권고사항에 위배
        byte 가나다;
        short _abcd;
        char $ab_cd;
//      int 3abcd; // 숫자는 앞에 올 수 없음
        long abcd3;
//      float int; // 자바 키워드 불가능
        double main; // 삽가능. 메서드 이름과 변수 이름은 동일해도 무관
//      int my work; // 불가능
        String muClassName;
        final int ABC = 7; // 가능은 하지만 권고사항 위배

        // #2. 상수 이름
        final double PI;
        final int MY_DATA;
        final float myData; // 가능은 하지만 권고사항 위배


    }
}
