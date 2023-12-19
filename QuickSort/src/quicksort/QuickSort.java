/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author villa_xaz9a7o
 */
public class QuickSort {
    int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++)
        {
            if (arr[j] >= pivot){
                i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp; 
            }
        }
        int temp = arr[i+1]; 
            arr[i+1] = arr[high];
            arr[high] = temp;
            return i+1;
    }
    void sort(int arr[], int low, int high) 
    {
        if (low< high){
            int pi = partition(arr, low, high); 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    }
    static void printArray(int arr[]){
        int n = arr.length; 
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println(); 
    }
    public static void main(String args[]) 
    {
        long startTime = 0;
        long endTime = 0;
        //int arr [] = //{ 618,825,544,407,551,351,803,234,454,567,506,889,632,862,574,259,379,231,958,609,440,145,602,447,863,672,461,870,398,689,951,160,514,446,774,308,405,554,170,132,285,245,117,181,49,592,137,649,208,230,418,265,336,462,289,698,356,441,360,887,909,805,69,131,676,204,184,883,941,278,139,134,707,57,149,430,975,293,846,333,130,830,591,447,705,307,685,87,549,175,889,618,386,959,509,254,307,821,122,503,671,600}; 
        //int n=arr.length;
        int[] arr = new int[5000];
        int n=arr.length;
        for (int i=0; i<arr.length; ++i) {
           arr[i]=(i*i-i)/3;
         }
        //int arr [] = {30, 410, -52, 126, 8, 7, 9, 9};
        //int n=arr.length;
        System.out.println("Arreglo original"); 
        printArray(arr); 
        QuickSort ob = new QuickSort();
        //startTime = System.currentTimeMillis(); // milisegundos
        startTime = System.nanoTime(); //nanosegundos
        ob.sort(arr, 0, n-1); 
        //endTime = System.currentTimeMillis() -startTime; // milisegundos
        endTime = System.nanoTime() -startTime; //nanosegundos
        System.out.println("Arreglo ordenado"); 
        printArray(arr); 
        //System.out.println("Tiempo de ejecución sort: " + endTime+ " milisegundos");
        System.out.println("\n\niempo de ejecución sort:\n" + endTime + " nanosegundos\n" + ((double)endTime/1000000) + " milisegundos");
    }
}
