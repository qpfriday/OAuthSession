package _01_List;

import java.util.*;

public class _05_LinkedListMethod {
    public static void main(String[] args) {

        List<Integer> linkedList1 = new LinkedList<>();

        // #1. add(E element)
        linkedList1.add(3);
        linkedList1.add(4);
        linkedList1.add(5);
        System.out.println(linkedList1.toString()); // =~.println(linkedList1) [3, 4, 5]

        // #2. add(int index, E element)
        linkedList1.add(1, 6);
        System.out.println(linkedList1.toString()); // [3, 6, 4, 5]

        // #3. addAll(또 다른 List 객체)
        List<Integer> linkedList2 = new ArrayList<>();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.addAll(linkedList1);
        System.out.println(linkedList2); // [1, 2, 3, 6, 4, 5]

        // #4. addAll(int index, 또 다른 List객체)
        List<Integer> linkedList3 = new ArrayList<>();
        linkedList3.add(1);
        linkedList3.add(2); // [1, 2]
        linkedList3.addAll(1, linkedList3);
        System.out.println(linkedList3); // [1, 1, 2, 2]


        // #5. set(int index, E element)
        linkedList3.set(1, 5);
        linkedList3.set(3, 6);
//      linkedList3.set(4, 7); // IndexOutOfBound

        System.out.println(linkedList3); // [1, 5, 2, 6]

        // #6. remove(int index)
        linkedList3.remove(1); // 1번 index삭제
        System.out.println(linkedList3); // [1, 2, 6]

        // #7. remove(Object o)
        linkedList3.remove(new Integer(2));
        System.out.println(linkedList3); // [1, 6]

        // #8. clear()
        linkedList3.clear();
        System.out.println(linkedList3); // []

        // #9. isEmpty()
        linkedList3.isEmpty();
        System.out.println(linkedList3.isEmpty()); // true

        // #10. size()
        System.out.println(linkedList3.size()); // 0
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.add(3);
        System.out.println(linkedList3); // [1, 2, 3]
        System.out.println(linkedList3.size()); // 3

        // #11. get(int index)
        System.out.println("0번 째: " + linkedList3.get(0)); // 1
        System.out.println("1번 째: " + linkedList3.get(1)); // 2
        System.out.println("2번 째: " + linkedList3.get(2)); // 3
        for (int i = 0; i < linkedList3.size(); i++) {
            System.out.println(i + "번 째: " + linkedList3.get(i));
        }

        // #12. toArray() List -> Array. Object 타입으로 업캐스팅
        Object[] object = linkedList3.toArray();
        System.out.println(Arrays.toString(object)); // [1, 2, 3]

        // #13-1. toArray(T[] t) -> T[]
        Integer[] integer1 = linkedList3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integer1)); // [1, 2, 3]

        // #13-2. toArray(T[] t) -> T[]
        Integer[] integer2 = linkedList3.toArray(new Integer[5]);
        System.out.println(Arrays.toString(integer2)); // [1, 2, 3, null, null]


    }
}
