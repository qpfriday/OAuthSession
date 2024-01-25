package _01_Array;

import java.util.Arrays;

public class _03_InitialValue {
    public static void main(String[] args) {

        // #1. stack 메모리값 (강제초기화 되지 않음) 모든 변수는 stack 메모리에, 진짜 값이 Heap으로
        int value;
//      System.out.println(value1); // 오류
        int[] value2;
//      System.out.println(value2); // 오류

        int value3 = 0;
        System.out.println(value3); // 0
        int[] value4 = null;
        System.out.println(value4); // null

        // #2. heap 메모리의 초기값 (강제초기화)
        // @ 기본 자료형 배열
        boolean[] array1 = new boolean[3]; // false 로 초기화
        for (int i = 0; i < 3; i++) {
            System.out.print(array1[i] + " "); // false false false
        }
        System.out.println();

        int[] array2 = new int[3]; // 0 으로 초기화
        for (int i = 0; i < 3; i++) {
            System.out.print(array2[i] + " "); // 0 0 0
        }
        System.out.println();

        double[] array3 = new double[3]; // 0.0 으로 초기화
        for (int i = 0; i < 3; i++) {
            System.out.print(array3[i] + " "); // 0.0 0.0 0.0
        }
        System.out.println();

        // @ 참조 자료형 배열
        String[] array4 = new String[3]; // null 로 초기화
        for (int i = 0; i < 3; i++) {
            System.out.print(array4[i] + " "); // null null null
        }
        System.out.println();

        // Tip. 배열을 쉽게 출력할 수 있는 방법
        System.out.println(Arrays.toString(array1)); // [false, false, false]
        System.out.println(Arrays.toString(array2)); // [0, 0, 0]
        System.out.println(Arrays.toString(array3)); // [0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(array4)); // [null, null, null]

    }
}
