package _01_Operator1;

public class _03_ShiftOperator {
    public static void main(String[] args) {

        // #1. 산술쉬프트 (부호변화가 없음 * 2, / 2 효과)
        // @ << Left Shift
        System.out.println(3 << 1); // 6
        System.out.println(-3 << 1); // -6
        System.out.println(3 << 2); // 12
        System.out.println(-3 << 2); // -12
        System.out.println();

        //@ >> Right Shift
        System.out.println(5 >> 1); // 2
        System.out.println(-5 >> 1); // -3
        System.out.println(5 >> 2); // 1
        System.out.println(-5 >> 2); // -2
        System.out.println();

        // #2. 논리쉬프트 (>>>)
        System.out.println(3 >>> 1); // 1 : 0000...0011 -> 0000...0001
        System.out.println(-3 >>> 31); // 1 : 1111...1101 -> 0000...0001
    }
}
