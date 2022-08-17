package com.datastructure.sorting;

public class insertionSort {
    public static void main(String[] args) {
        int a[] = new int[]{15,5,7,3,2,9};

        for(int  i = 1;i< a.length ;i++){

            int key = a[i];

            int j = i -1;
            while(j > -1 && a[j] > key){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                j--;
            }
        }
        for(int x : a){
            System.out.println(x);
        }
    }
}
