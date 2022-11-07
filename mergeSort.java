package arrayQuestion.bubbleSort;
import java.util.*;
public class mergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please inter the size of array");
        int size = sc.nextInt();
        int [] a =new int[size];
        System.out.println(" Enter the array element");
        for (int i =0; i<size; i++){
            a[i] = sc.nextInt();
        }
        for (int j : a){
            System.out.print(j+" ");
        }
    }
}
