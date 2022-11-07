package arrayQuestion.bubbleSort;
import java.util.*;
public class binary_searshing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a ={2,3,4,5,7,9,11,14,16,18,19,44,63,66,67,55,76,77,88,99,100};
        int element = sc.nextInt();
        int li = 0;
        int hi = a.length-1;
        //  int mi = (li+hi)/2;
        int mi = li+(hi-li)/2;
        while (li<=hi) {
            if (a[mi] == element) {
                System.out.println("Element at index " + mi + " index");
                break;
            } else if (a[mi] < element) {
                li = mi + 1;
            } else {
                hi = mi - 1;
            }
            mi = li + (hi - li) / 2;
        }
        if (li>hi){
            System.out.println("Element is not found");
        }
    }
}
