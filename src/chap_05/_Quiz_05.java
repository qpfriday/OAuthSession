package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // int[] sizes = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        int[] sizeArray = new int[10];

        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        /* for (int i = 0; i < 10; i++) {
            System.out.println("사이즈 " + sizeArray[i] + " (재고 있음)");
        }

         */

        for (int size : sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }
    }
}
