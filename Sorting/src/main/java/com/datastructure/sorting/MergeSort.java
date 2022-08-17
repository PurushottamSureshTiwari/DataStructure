package com.datastructure.sorting;

public class MergeSort {


    public  void  sort(int a[], int leftinedx , int rightIndex ){
        System.out.println("L :"+leftinedx);
        System.out.println("R :"+rightIndex);
        if(leftinedx < rightIndex){
            int mid =leftinedx+ (rightIndex-leftinedx)/2;
            sort(a, leftinedx, mid);
            sort(a, mid+1,rightIndex);
            merge(a,leftinedx,rightIndex,mid);
        }
        System.out.println("Done");
    }

    private  void merge(int[] a, int leftinedx, int rightIndex, int mid) {

        int size1 = mid - leftinedx +1;
        int size2 = rightIndex - mid;

        int M[] = new int[size1];
        int N[] = new int[size2];

        for(int i = 0 ; i< size1 ;i++){
            M[i] = a[leftinedx +i];
        }


        for(int j = 0 ; j< size2 ;j++) N[j] = a[mid + 1 + j];

        //int K[] = new int[a.length];

        int c = 0 , d = 0, e = leftinedx;

        while(c < size1 && d < size2){
            if(M[c] > N[d]){
                a[e] = N[d];
                d++;
            }else{
                a[e] = M[c];
                c++;
            }
            e++;
        }

        while(c < size1){
            a[e] = M[c]; c++;e++;
        }
        while(d < size2){
            a[e] = N[d]; d++;e++;
        }
    }

    public static void main(String[] args) {
        int a[] = new int[]{15,5,7,3,2,9};

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(a, 0, a.length-1);
        for(int x : a){
            System.out.println(x);
        }

    }
}
