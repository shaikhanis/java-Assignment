package arrayQuestion.bubbleSort;

import java.util.Scanner;

public class QuickSort {
        public static void main(String[] args) {
        /*
        Quick sort

         */

            Scanner sc = new Scanner(System.in);
            System.out.println(" Please Enter the size of the Array");
            int size = sc.nextInt();
            int[] a = new int[size];
            System.out.println("Please enter the array element");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            // int [] a = {4,5,4,7,8,9,3,12,4,5,55,66,88,99,77,11,22,30,};
            int len = a.length;
            QuickSort asm = new QuickSort();
            asm.Quick_Sort_Recursion(a, 0,len-1);
            asm.printArray(a);

        }
        static int parts(int [] a,int low ,int high){
            int pivot = a[low+(high-low)/2];
            while (low<= high){
                while (a[low] < pivot){
                    low++;
                }

                while (a[high] > pivot){
                    high--;
                }
                if(low<=high){
                    int temp = a[low];
                    a[low] = a[high];
                    a[high] = temp;
                    low++;
                    high--;
                }
            }
            return low;
        }
        void Quick_Sort_Recursion(int [] a , int low, int high){
            int pi = parts(a, low, high);
            if(low<pi-1){
                Quick_Sort_Recursion(a, low, pi-1);
            }
            if(pi<high){

                Quick_Sort_Recursion(a,pi, high);
            }
        }
        void printArray(int[] a){
            for(int k : a){
                System.out.print(k+" ");
            }
        }
    }
