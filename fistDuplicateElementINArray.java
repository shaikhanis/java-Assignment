package arrayQuestion;

import java.util.HashSet;

public class fistDuplicateElementINArray {
    public static void main(String[] args) {
        int[] a = {55,66,5,44,11,22,4,8,9,6,1,4,5,12,};
        int len = a.length;
        int i,j;
        int temp = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (i = len-1; i>=0; i--){
            if(hs.contains(a[i])){
                temp = i;
            }else{
                hs.add(a[i]);
            }
        }
        if(temp != -1){
            System.out.println("fist duplicate element is : "+a[temp]);
        }else{
            System.out.println(" first duplicate element is not fond : ");
        }
//        for(i = 0; i<len-1; i++){
//            for(j=i+1; j<len; j++){
//                if (a[i] == a[j]&& (i!=j)){
//                    System.out.println("first duplicate element is in array: "+a[j]+" index number is  "+j);
//                    temp = temp+1;
//                    break;
//                }
//            }
//            if(temp >0){
//                break;
//            }
//        }


    }
}
