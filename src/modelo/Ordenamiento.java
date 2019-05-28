package modelo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

import Sorted.MergeSort;
import Sorted.QuickSort;
import Sorted.AlgoritmoOrdenamiento;

public class Ordenamiento {

    public MergeSort merge;
    public QuickSort quick;
    public AlgoritmoOrdenamiento insert;
    public static AlgoritmoOrdenamiento arraysort;
    public static AlgoritmoOrdenamiento collectionsort;

    public void NumerosRandom(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = (int) (Math.random() * 100);
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void NumerosOrdenados(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
             arreglo[i] = i;
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    public void OrdenarPorQuick(int[] arreglo) {
        quick = new QuickSort();
        quick.Sort(arreglo);
    }

    public void OrdenarPorMerge(int[] arreglo) {
        merge = new MergeSort();
        merge.Sort(arreglo);
    }
    
    
 // ArraySort
 	public static void sortJava(int []arreglo) {
 		arraysort = new AlgoritmoOrdenamiento();
 		arraysort.sortJava(arreglo);
 	}
 	
 	
	// CollectionSort
	public static void collectionSortJava(int []arreglo) {
		collectionsort = new AlgoritmoOrdenamiento();
		collectionsort.collectionSortJava(arreglo);
		}
	
 	
 	// InsertionSort
 	
    public void insertionSortArray(int[] arreglo) {
        insert = new AlgoritmoOrdenamiento();
        insert.insertionSortArray(arreglo);
    }
 	
 
}



