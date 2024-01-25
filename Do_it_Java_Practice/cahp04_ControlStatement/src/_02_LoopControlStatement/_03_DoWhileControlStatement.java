package _02_LoopControlStatement;

public class _03_DoWhileControlStatement {
    public static void main(String[] args) {

        // #1. 반복횟수가 0인 경우 do-while 문 비교
        int a;
        a = 0;
        while (a < 0) {
            System.out.print(a + " ");
            a++;
        } // 실행 횟수 0번
        System.out.println();

        do {
            System.out.print(a + " ");
            a++;
        } while (a < 0); // 실행 횟수 1번
        System.out.println();

        // #2. 반복횟수가 1인 경우 do-while 문 비교
        a = 0;
        while (a < 1) {
            System.out.print(a + " ");
            a++;
        } // 실행 횟수 1번
        System.out.println();


        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while (a < 1); // 실행 횟수 1번
        System.out.println();

        // #3. 반복횟수가 10인 경우 do-while 문 비교
        a = 0;
        while (a < 10) {
            System.out.print(a + " ");
            a++;
        } // 실행 횟수 10번
        System.out.println();

        a = 0;
        do {
            System.out.print(a + " ");
            a++;
        } while (a < 10); // 실행 횟수 10번
        System.out.println();
    }
}
