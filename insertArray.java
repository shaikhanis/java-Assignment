package arrayQuestion;
import java.util.*;
public class insertArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size + 1];
        System.out.println("Enter the Array Element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the position of Array you want to change");
        int pos = sc.nextInt();
        System.out.println("Enter the element you want to change");
        int element = sc.nextInt();

        for(int i = arr.length-1; i>pos-1; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = element;
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

