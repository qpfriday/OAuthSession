package _01_Operator1;

public class _02_BitwiseOperator {
    public static void main(String[] args) {
        // #0. 자바 코드로 진법 변환
        int data = 13;
        System.out.println(Integer.toBinaryString(data)); // 1101 : 2진수
        System.out.println(Integer.toOctalString(data)); // 15 : 8진수
        System.out.println(Integer.toHexString(data)); // d : 16진수
        System.out.println();

        System.out.println(Integer.parseInt("1101", 2)); // 13
        System.out.println(Integer.parseInt("15", 8)); // 13
        System.out.println(Integer.parseInt("d", 16)); // 13

        // #1. 다양한 진법 표현
        System.out.println(13);
        System.out.println(0b1101);
        System.out.println(015);
        System.out.println(0xd);

        // #2. 비트연산자
        // @AND
        System.out.println(3 & 10); // 2
        System.out.println(0b0011 & 0b1010); // 2 : 0010
        System.out.println(0x3 & 0xa); // 2 : 0010

        // @OR
        System.out.println(3 | 10); // 11
        System.out.println(0b0011 | 0b1010); // 11 : 1101
        System.out.println(0x3 | 0xa); // 11 :

        // @XOR
        System.out.println(3 ^ 10); // 9
        System.out.println(0b0011 ^ 0b1010); // 9 : 1001
        System.out.println(0x3 ^ 0xa); // 9

        // @NOT
        System.out.println(~3); // -4
        System.out.println(~0b0011); // -4 : 1111...1100
        System.out.println(~0x3); // -4
    }
}
