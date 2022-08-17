package com.datastructure.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = new int[]{15,5,7,3,2,9};

        for(int  i = 0 ; i< a.length -1; i++){
            int min = i;
            for(int j = i+1;j < a.length;j++){
               if(a[j] < a[min]){
                   min  = j;
               }
            }
            int  t = a[min];
            a[min] = a[i];
            a[i] =t;
        }



        for(int x : a){
            System.out.println(x);
        }
    }

}

