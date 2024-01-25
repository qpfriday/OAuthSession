package _01_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class _04_VectorMethod {
    public static void main(String[] args) {

        List<Integer> vector1 = new Vector<>();

        // #1. add(E element)
        vector1.add(3);
        vector1.add(4);
        vector1.add(5);
        System.out.println(vector1.toString()); // =~.println(vector1) [3, 4, 5]

        // #2. add(int index, E element)
        vector1.add(1, 6);
        System.out.println(vector1.toString()); // [3, 6, 4, 5]

        // #3. addAll(또 다른 List 객체)
        List<Integer> vector2 = new ArrayList<>();
        vector2.add(1);
        vector2.add(2);
        vector2.addAll(vector1);
        System.out.println(vector2); // [1, 2, 3, 6, 4, 5]

        // #4. addAll(int index, 또 다른 List객체)
        List<Integer> vector3 = new ArrayList<>();
        vector3.add(1);
        vector3.add(2); // [1, 2]
        vector3.addAll(1, vector3);
        System.out.println(vector3); // [1, 1, 2, 2]


        // #5. set(int index, E element)
        vector3.set(1, 5);
        vector3.set(3, 6);
//      vector3.set(4, 7); // IndexOutOfBound

        System.out.println(vector3); // [1, 5, 2, 6]

        // #6. remove(int index)
        vector3.remove(1); // 1번 index삭제
        System.out.println(vector3); // [1, 2, 6]

        // #7. remove(Object o)
        vector3.remove(new Integer(2));
        System.out.println(vector3); // [1, 6]

        // #8. clear()
        vector3.clear();
        System.out.println(vector3); // []

        // #9. isEmpty()
        vector3.isEmpty();
        System.out.println(vector3.isEmpty()); // true

        // #10. size()
        System.out.println(vector3.size()); // 0
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);
        System.out.println(vector3); // [1, 2, 3]
        System.out.println(vector3.size()); // 3

        // #11. get(int index)
        System.out.println("0번 째: " + vector3.get(0)); // 1
        System.out.println("1번 째: " + vector3.get(1)); // 2
        System.out.println("2번 째: " + vector3.get(2)); // 3
        for (int i = 0; i < vector3.size(); i++) {
            System.out.println(i + "번 째: " + vector3.get(i));
        }

        // #12. toArray() List -> Array. Object 타입으로 업캐스팅
        Object[] object = vector3.toArray();
        System.out.println(Arrays.toString(object)); // [1, 2, 3]

        // #13-1. toArray(T[] t) -> T[]
        Integer[] integer1 = vector3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1)); // [1, 2, 3]

        // #13-2. toArray(T[] t) -> T[]
        Integer[] integer2 = vector3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2)); // [1, 2, 3, null, null]


    }
}
