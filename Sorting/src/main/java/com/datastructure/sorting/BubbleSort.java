package com.datastructure.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = new int[]{15,5,7,3,2,9};

        for(int  i = 0 ; i< a.length; i++){
            for(int j = i+1;j < a.length;j++){
                if(a[j] < a[i]){
                    int  t = a[j];
                    a[j] = a[i];
                    a[i] =t;
                }
               /* for(int x : a){
                    System.out.print(x+" ");
                }
                System.out.println("-------------------");
*/
            }

        }
        for(int x : a){
            System.out.println(x);
        }
    }
}
