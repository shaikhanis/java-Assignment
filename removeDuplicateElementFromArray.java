package arrayQuestion;
import java.util.*;
public class removeDuplicateElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Element");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
        /*
        System.out.println();
        int [] temp = new int [arr.length];
        int j = 0;
        for(int i =0; i < arr.length-1; i++){
            if (arr[i] !=arr[i+1]) {
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length-1];
        for(int no : temp){
            System.out.print(no+" ");
        }
        //second method to remove duplicate element.
     System.out.println();
    int j = 0;
        for(int i =0; i < arr.length-1; i++){
        if (arr[i] !=arr[i+1]) {
            arr[j]=arr[i];
            j++;
        }
    }
    arr[j] = arr[arr.length-1];
        for(int i=0; i<j+1; i++) {
            System.out.print(arr[i] + " ");
        }
        */
        //         third method to remove duplicate element.
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0; i<arr.length; i++){
            hs.add(arr[i]);
        }
        System.out.println();
        System.out.println("all Duplicate element remove successfully"+hs);
    }
}