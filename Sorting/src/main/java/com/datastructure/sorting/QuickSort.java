package com.datastructure.sorting;

public class QuickSort {

    public  void  sort(int a[], int low , int high ){

         if(low < high){
            int pi = partition(a,low,high);
            sort(a, low, pi-1);
            sort(a, pi+1,high);

        }

    }

    private void swap(int a[], int  i , int j){
        int temp = a[i] ;
        a[i] = a[j];
        a[j] = temp;
    }
    private  int partition(int[] a, int low, int high) {
       int pivot  = a[high];

       int  i = (low -1);
       for(int  j = low ; j<= high -1 ;j++){
         if(pivot > a[j]){
             i++;
            swap(a, i, j);

         }
       }
       swap(a, i+1, high);

       return (i+1);

    }

    public static void main(String[] args) {
        int a[] = new int[]{0,1,1,0,1,2,1,2,0,0,0,1};

        QuickSort quickSort = new QuickSort();
        quickSort.sort(a, 0, a.length-1);
        for(int x : a){
            System.out.println(x);
        }

    }
}
