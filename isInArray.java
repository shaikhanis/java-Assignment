package arrayQuestion;
import java.util.*;
public class isInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please inter your element");
        int element = sc.nextInt();
        int temp=1;
        int [] arr = {0,1,2,3,4,5,6,7,8,9};
        for (int i =0; i<arr.length; i++){
            if (arr[i]==element){
                System.out.println("Element present in Arr "+i+"th Index Number");
                temp++;
            }
        }
        if (temp == 1){
            System.out.println("Element is not Present in Array");
        }
    }
}
