package arrayQuestion;

import java.util.ArrayList;

class sum_Of_EvenAnd_OddNumberInArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int j : a) {
            if (j % 2 == 0) {
                al1.add(j);
            } else {
                al2.add(j);
            }
        }
        // this program only for print the all even and odd numbers.
        // but you can print how many numbers are even and odd also using the .size method();
        //and also print the sum of all the numbers using total.
        int total1 = 0;
        System.out.println("all Even number present in the array is ");
        for(int no : al1){
            System.out.print(no+" ,");
            total1 = total1+no;
        }
        System.out.println();
        System.out.println("the sum of all the even number is :"+total1+"\n");

        System.out.println("number present in the Array "+al1.size());
        System.out.println("\n");
        System.out.println("all odd number present in the array is ");
        int total2 = 0;
        for(int no : al2){
            System.out.print(no+" ,");
            total2 = total2 +no;
        }
        System.out.println("\n");
        System.out.println("the sum of all the odd number is :"+total2+"\n");
        System.out.println("number present in the Array "+al2.size());

    }
}
