package arrayQuestion;
import java.util.*;
public class lengthOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter te size of Array");
        int size = sc.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
