package arrayQuestion;
import java.util.Scanner;
public class kthElement_In_Array {
        public static void main(String[] args) {
        /*
        find the kth the largest Element.
         */
            Scanner sc = new Scanner(System.in);
            System.out.println(" Please Enter the size of the Array");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.println("Please enter the array element");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            for (int j : a) {
                System.out.print(j + " ,");
            }
            System.out.println();
            System.out.println("please inter the kth value");
            int k = sc.nextInt();
            int temp;
            for (int i = 0; i<a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] < a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
                if (i == k - 1) {
                    System.out.println("the largest element present in the position of kth index is " + a[i]);
                    break;
                }
            }
            for (int j :a) {
                System.out.print(j + " ");
            }
        }
}
