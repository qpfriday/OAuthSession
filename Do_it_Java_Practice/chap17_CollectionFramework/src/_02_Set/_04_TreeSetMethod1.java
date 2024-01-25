package _02_Set;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class _04_TreeSetMethod1 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 50; i > 0; i-=2) { // [50, 48, 46, ..., 2]
            treeSet.add(i);
        }
        System.out.println(treeSet.toString()); // [2, 4, 6, ..., 50]

        // 데이터 검색 메소드
        // #1. first()
        System.out.println(treeSet.first()); // 2
        // #2. last()
        System.out.println(treeSet.last()); // 50
        // #3. lower(E element)
        System.out.println(treeSet.lower(26)); // 24
        // #4. higher(E element)
        System.out.println(treeSet.higher(26)); // 28
        // #5. floor(E element)
        System.out.println(treeSet.floor(25)); // 24
        System.out.println(treeSet.floor(26)); // 26
        // #6. ceiling(E element)
        System.out.println(treeSet.ceiling(25)); // 26
        System.out.println(treeSet.ceiling(26)); // 26

        // 데이터 추출 메소드
        // #7. pollFirst()
        int treeSetSize = treeSet.size();
        System.out.println("size: " + treeSetSize); // 25
        for (int i = 0; i < treeSetSize; i++) {
            System.out.print(treeSet.pollFirst() + " "); // 2 4 6 ... 50
        }
        System.out.println();
        System.out.println("size: " + treeSet.size()); // 0

        // #8. pollLast()
        for (int i = 50; i > 0; i-=2) { // [50, 48, 46, ..., 2]
            treeSet.add(i);
        }
        treeSetSize = treeSet.size();
        for (int i = 0; i < treeSetSize; i++) {
            System.out.print(treeSet.pollLast() + " "); // 50 48 46 .. 2
        }
        System.out.println();
        System.out.println("size: " + treeSet.size()); // 0

        // 부분집합 생성
        // #9. Sorted<E> headSet(E element)
        for (int i = 50; i > 0; i-=2) { // [2, 4, 6, ..., 50]
            treeSet.add(i);
        }
        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println(sSet.toString()); // [2, 4, 6, ..., 18]

        // #10. NavigableSet<E> headSet(E element, boolean inclusive)
        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println(nSet.toString()); // [2, 4, 6, ..., 18, 20]
        nSet = treeSet.headSet(20, false);
        System.out.println(nSet.toString()); // [2, 4, 6, ..., 18]

        // #11. Sorted<E> tailSet(E element)
        sSet = treeSet.tailSet(20);
        System.out.println(sSet.toString()); // [20, 22, ..., 50]

        // #12. NavigableSet<E> tailSet(E element, boolean inclusive)
        nSet = treeSet.tailSet(20, true);
        System.out.println(nSet.toString()); // [20, 22, ..., 50]
        nSet = treeSet.headSet(20, false);
        System.out.println(nSet.toString()); // [22, 24, ..., 50]

        // #13. Sorted<E> subSet(E element, E element)
        sSet = treeSet.subSet(10, 20);
        System.out.println(sSet.toString()); // [10, 12, 14, 16, 18]

        // #14. NavigableSet<E> subSet(E element, boolean inclusive, E element, boolean inclusive)
        nSet = treeSet.subSet(10, true, 20, false);
        System.out.println(nSet.toString()); // [10, 12, 14, 16, 18]
        nSet = treeSet.subSet(10, false, 20, true);
        System.out.println(nSet.toString()); // [12, 14, 16, 18, 20]

        // #15. NavigableSet<E> descendingSet()
        System.out.println(treeSet); // 오름차순
        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println(descendingSet); // 내림차순
        descendingSet = descendingSet.descendingSet();
        System.out.println(descendingSet); // 오름차순
    }
}
