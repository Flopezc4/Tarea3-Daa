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

    public void NumerosRandom(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            arreglo[i] = (int) (Math.random() * 100);

        }

    }

    public void NumerosOrdenados(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i;

        }

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
    public static void sortJava(int[] arreglo) {
 
        AlgoritmoOrdenamiento.sortJava(arreglo);
    }

    // CollectionSort
    public static void collectionSortJava(int[] arreglo) {

        AlgoritmoOrdenamiento.collectionSortJava(arreglo);
    }

    // InsertionSort
    public void insertionSortArray(int[] arreglo) {

        AlgoritmoOrdenamiento.insertionSortArray(arreglo);
    }

}


