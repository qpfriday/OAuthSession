package _02_LoopControlStatement;

public class _02_WhileControlStatement {
    public static void main(String[] args) {

        // #1. while 의 기본 구조
        int a = 0;
        while (a < 10) {
            System.out.print(a + " ");
            a++;
        } // 0, 1, 2, ..., 9

        // @ for 문으로 변환
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ");
        }

        int b = 0;
        while (b > 0) {
            System.out.print(b + " ");
            b--;
        } // 10, 9, 8, ..., 1 : 10개

        // @ for 문으로 변환
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        } // 10, 9, 8, ..., 1 : 10개

        // #2. while 의 특수한 형태 (무한루프)
//      while (true) {
//          System.out.println("무한루프");
//      }
        System.out.println();

        // #3. 무한루프 탈출하기
        int c = 0;
        while (true) {
            if (c > 10) {
                break;
            }
            System.out.print(c + " "); // 0, 1, 2, ... , 10
            c++;
        }
    }
}
