package arrayQuestion;

import java.util.HashSet;

public class find_Comman_Element_In_2Array {
    public static void main(String[] args) {
        int [] arr1= {1,2,3,4,5,10,6,7,8,9};
        int [] arr2= {11,22,33,10,44,55,6,77,88,99};
//        for(int i = 0; i<arr1.length; i++){
//            for(int j = 0; j<arr2.length; j++){
//                if(arr1[i]==arr2[j]){
//                    System.out.println(arr2[j]);
//                }
//            }
//        }
        // abow method is very basic method to print the same element is an 2 array.
        // by using Hash set method because ser not get the duplicate element.
//        HashSet<Integer> hs = new HashSet<>();
//
//        for(int i = 0; i<arr1.length; i++){
//            for(int j = 0; j<arr2.length; j++){
//                if(arr1[i]==arr2[j]){
//                    hs.add(arr1[i]);
//                    break;
//                }
//            }
//        }
//        for(int no : hs){
//            System.out.println("same element in 2 arrays are :"+no);
//        }
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int no :arr1){
            hs1.add(no);
        }
        for(int no : arr2){
            hs2.add(no);
        }
        for(int no : arr2){
             boolean b =hs1.add(no);
             if(b == false){
                 System.out.println("same element is "+no);
             }
        }
    }
}
