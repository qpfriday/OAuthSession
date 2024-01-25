package _02_PrimaryDataType;

public class _03_PrimaryDataType2 {
    public static void main(String[] args) {

        // #4. 문자 (char) : 문자, 정수
        // #4-1. 문자로 저장하는 방법
        char value1 = 'A';
        char value2 = '가';
        char value3 = '3';
        System.out.println(value1); // A
        System.out.println(value2); // 가
        System.out.println(value3); // 3

        // #4-2. 정수로 저장하는 방법
        char value4 = 65;
        char value5 = 0xac00;
        char value6 = 51;
        System.out.println(value4); // A
        System.out.println(value5); // 가
        System.out.println(value6); // 3

        // #4-3. 유니코드로 저장하는 방법
        char value7 = '\u0041';
        char value8 = '\uac00';
        char value9 = '\u0033';
        System.out.println(value7); // A
        System.out.println(value8); // 가
        System.out.println(value9); // 3
    }
}
