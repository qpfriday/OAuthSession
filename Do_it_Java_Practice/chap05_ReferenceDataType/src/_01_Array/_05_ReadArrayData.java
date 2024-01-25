package _01_Array;

import java.util.Arrays;

public class _05_ReadArrayData {
    public static void main(String[] args) {

        int[] array = new int[] {3, 4, 5, 6, 7};

        // #1. 배열의 길이 구하기
        System.out.println(array.length); // 배열이 가리키는 방에 가서 방의 개수를 세는 메소드
        System.out.println();

        // #2. 출력하기 1:
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println();

        // #3. 출력하기 2:
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();

        // #4. 출력하기 3:
        // for each : for(꺼낸 하나의 원소를 저장할 수 있는 변수 : 집합객체(배열, 컬렉션)) {}
        for (int k : array) {
            System.out.println(k);
        }
        System.out.println();

        // #5. 출력하기 4:
        System.out.println(Arrays.toString(array));
    }
}
