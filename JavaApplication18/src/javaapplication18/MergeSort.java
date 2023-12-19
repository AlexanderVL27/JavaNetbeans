/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author villa_xaz9a7o
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public class MergeSort{public void sort(int arr[], int left, int right){if(left < right){
//Encuentra el punto medio del vector.int middle = (left + right) / 2;//Divide la primera y segunda mitad (llamada recursiva).sort(arr, left, middle);sort(arr, middle+1, right);//Une las mitades.merge(arr, left, middle, right);}}public void merge(int arr[], int left, int middle, int right) {//Encuentra el tamaño de los sub-vectores para unirlos.int n1 = middle -left + 1;int n2 = right -middle;//Vectores temporales.int leftArray[] = new int [n1];int rightArray[] = new int [n2];//Copia los datos a los arrays temporales.for (int i=0; i < n1; i++) {leftArray[i] = arr[left+i];}for (int j=0; j < n2; j++) {rightArray[j] = arr[middle + j + 1];}/* Une los vectorestemporales. *///Indices inicial del primer y segundo sub-vector.int i = 0, j = 0;//Indice inicial del sub-vector arr[].int k = left;//Ordenamiento.while(i < n1 && j < n2) {if (leftArray[i] <= rightArray[j]) {arr[k] = leftArray[i];i++;} else {arr[k] = rightArray[j];j++;
}k++;}//Fin del while./* Si quedan elementos por ordenar *///Copiar los elementos restantes de leftArray[].while (i < n1) {arr[k] = leftArray[i];i++;k++;}//Copiar los elementos restantes de rightArray[].while (j < n2) {arr[k] = rightArray[j];j++;k++;}}public void printArray(int arr[]) {int n = arr.length;for (int i=0; i<n; ++i) {System.out.print(arr[i] + " ");}System.out.println();}public static void main(String[] args) {// para tiempo de ejecuciónlong tiempoinicial=0;long tiempofinal=0;MergeSort mergeSort = new MergeSort();///int arr [] = //{ 618,825,544,407,551,351,803,234,454,567,506,889,632,862,574,259,379,231,958,609,440,145,602,447,863,672,461,870,398,689,951,160,514,446,774,308,405,554,170,132,285,245,117,181,49,592,137,649,208,230,418,265,336,462,289,698,356,441,360,887,909,805,69,131,676,204,184,883,941,278,139,134,707,57,149,430,975,293,846,333,130,830,591,447,705,307,685,87,549,175,889,618,386,959,509,254,307,821,122,503,671,600}; 
//int n=arr.length;int[] arr = new int[10000];int n=arr.length;for (int i=0; i<arr.length; ++i) {arr[i]=(i*i-i)/3;}//int arr [] = {21, 1, 26, 45, 29, 28, 2, 9, 16, 49, 39, 27, 43, 34, 46, 40 };//int n=arr.length;System.out.println();System.out.println();System.out.println("Arreglo original:");for (int value : arr) {System.out.print(value + " ");}System.out.println();System.out.println();System.out.println("Array ordenado:");tiempoinicial = System.nanoTime(); //nanosegundosmergeSort.sort(arr,0,n-1);tiempofinal= System.nanoTime() -tiempoinicial; //nanosegundosmergeSort.printArray(arr);System.out.println("\n\niempo de ejecución sort:\n" + tiempofinal + " nanosegundos\n" + ((double)tiempofinal/1000000) + " milisegundos");        System.out.println();}} 
}
