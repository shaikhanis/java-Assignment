package arrayQuestion.bubbleSort;
import java.util.*;
public class forMore {
    public static void main(String[] args) {
        /*
           In This Code We put 1000s Element it's Gets less tme
           and reduce time complexity...
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int i,temp,j;
        System.out.println("Enter Array Element");
        int [] a = new int[size];
        for(i = 0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for(i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Before Sorting");
        for(i = 0; i<a.length; i++){
            for(j = 0; j<a.length-1-i; j++) {

                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After the sorting");
        for (i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
