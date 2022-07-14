/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package latihan_3_vol2;

/**
 *
 * @author Lucky
 */
class Sort{
    public void bubblesort(int [] sort_arr){
        int len = sort_arr.length;
        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j+1]<sort_arr[j]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
        }
        
        for (int i = 0; i < len; i++) {
            System.out.println(sort_arr[i]);
        }
    }
    
    public void quicksort(int [] arr){
        int n = arr.length;
        int i, key, j;
        for (i = 1; i < n; i++)
        {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
    
    public void selectionsort(int [] arr){
        for (int i = 0; i <  arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }
    
    void merge(int a[], int beg, int mid, int end)    
    {    
        int i, j, k;  
        int n1 = mid - beg + 1;    
        int n2 = end - mid;    

            int LeftArray[] = new int[n1];  
            int RightArray[] = new int[n2];  

        /* copy data to temp arrays */  
        for (i = 0; i < n1; i++)    
        LeftArray[i] = a[beg + i];    
        for (j = 0; j < n2; j++)    
        RightArray[j] = a[mid + 1 + j];    

        i = 0;
        j = 0;  
        k = beg; 

        while (i < n1 && j < n2)    
        {    
            if(LeftArray[i] <= RightArray[j])    
            {    
                a[k] = LeftArray[i];    
                i++;    
            }    
            else    
            {    
                a[k] = RightArray[j];    
                j++;    
            }    
            k++;    
        }    
        while (i<n1)    
        {    
            a[k] = LeftArray[i];    
            i++;    
            k++;    
        }    

        while (j<n2)    
        {    
            a[k] = RightArray[j];    
            j++;    
            k++;    
        }    
    }    

    void mergeSort(int arr[], int beg, int end)  
    {  
        if (beg < end)   
        {  
            int mid = (beg + end) / 2;  
            mergeSort(arr, beg, mid);  
            mergeSort(arr, mid + 1, end);  
            merge(arr, beg, mid, end);  
        }  
        
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }
    }  
    
    void Insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}

public class latihan_3 {
    public static void main(String[] args) {
        Sort test = new Sort();
        int [] arr = {2,3,5,23,12,56,23,45};
        
        test.bubblesort(arr);
        test.quicksort(arr);
        test.selectionsort(arr);
        test.mergeSort(arr, 0, arr.length-1);
        test.Insertionsort(arr);
    }
}
