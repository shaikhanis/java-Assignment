package arrayQuestion;
import java.util.Arrays;
public class sum_Of_Two_Array_Element {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9, 10};
        int b1 = b.length;
        int[] c = new int[b1];
        for (int i = 0; i < b1; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.println(Arrays.toString(c));
    }
}