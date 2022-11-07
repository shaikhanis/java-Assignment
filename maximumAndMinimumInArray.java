package arrayQuestion;
import java.util.*;
public class maximumAndMinimumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please enter the size of the array");
//        int size = sc.nextInt();
//        int[] a = new int[size];
//        for (int i = 0; i < size; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int j : a) {
//            System.out.print(j + ",");
//
//        }
//        System.out.println();
        int [] a = {3,6,5,4,9};
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if ( min>a[i]) {
                min = a[i];
            }

        }
        System.out.println("minimum Element is " + min);
        System.out.println("maximum Element is " + max);
    }
}

//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 1; i < a.length; i++) {
//            if (a[i] > max) {
//                max = a[i];
//            }
//            if (a[i] < min) {
//                min = a[i];
//            }
//        }
//        System.out.println("maximum Element is "+max);
//        System.out.println("minimum Element is "+min);
//
//