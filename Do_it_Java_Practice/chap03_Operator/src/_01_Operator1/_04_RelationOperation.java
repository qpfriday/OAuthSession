package _01_Operator1;

public class _04_RelationOperation {
    public static void main(String[] args) {

        // #1. 크기비교 (<, >, <=, >=) : true, false
        System.out.println(5 < 2); // false
        System.out.println(5 > 2); // true
        System.out.println(5 < 5); // false
        System.out.println(5 <= 5); // true
        System.out.println(5 >= 5); // true

        // #2. 등가비교 (==, !=) : true, false
        int a = 2;
        System.out.println(a = 2); // 2
        System.out.println(5 == 2); // false
        System.out.println(5 != 2); // true
        System.out.println(5 == 5); // true
        System.out.println(5 != 5); // false

        // @ 참조자료형 등가비교
        String str1 = new String("안녕");
        String str2 = new String("안녕");
        System.out.println(str1 == str2); // false
    }
}
