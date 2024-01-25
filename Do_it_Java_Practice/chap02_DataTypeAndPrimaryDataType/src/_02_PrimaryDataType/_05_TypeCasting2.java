package _02_PrimaryDataType;

public class _05_TypeCasting2 {
    public static void main(String[] args) {

        // #1. 자동 타입 변환 (업캐스팅)
        float value1 = 3; // (float)3
        long value2 = 5; // (long)5
        double value3 = 7;
        byte value4 = 9; // 저장할 수 있는 값의 범위값을 byte 나 short 에 입력하는 경우
        short value5 = 11; // 정수는 각각 byte 나 short 로 캐스팅

        System.out.println(value1); // 3.0
        System.out.println(value2); // 5
        System.out.println(value3); // 7.0
        System.out.println(value4); // 9
        System.out.println(value5); // 11

        // #2. 수동 타입 변환
        byte value6 = (byte)128;
        int value7 = (int)3.5;
        float value8 = (float)7.5;

        System.out.println(value6); // -128
        System.out.println(value7); // 3
        System.out.println(value8); // 7.5
    }
}
