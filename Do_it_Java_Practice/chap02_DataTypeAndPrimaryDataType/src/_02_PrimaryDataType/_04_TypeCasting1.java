package _02_PrimaryDataType;

public class _04_TypeCasting1 {
    public static void main(String[] args) {

        // #1. 캐스팅 방법
        // @1-1. 캐스팅 방법 1 (테이터타입)
        int value1 = (int)5.3;
        long value2 = (long)10;
        float value3 = (float)5.8;
        double value4 = (double)16;

        System.out.println(value1); // 5
        System.out.println(value2); // 10
        System.out.println(value3); // 5.8
        System.out.println(value4); // 16.0

        // @1-2. 캐스팅 방법 2 (L, F)

        long value5 = 10L;
        long value6 = 10l;
        float value7 = 5.8F;
        float value8 = 5.8f;

        System.out.println(value5); // 10
        System.out.println(value6); // 10
        System.out.println(value7); // 5.8
        System.out.println(value8); // 5.8
    }
}
