package modelo;

import java.util.Scanner;
import Sorted.MergeSort;
import Sorted.QuickSort;

public class Ordenamiento {

    public MergeSort merge;
    public QuickSort quick;

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
}



/*public static void main(String[] args) {
        int n;
        Scanner neme = new Scanner(System.in);
        System.out.println("Introduzca un n:");
        n = neme.nextInt();
        int arreglo2[] = new int[n];
        //int arreglo22[]=new int[n];
        long INICIO_MS1 = System.currentTimeMillis();
        System.out.println("QuickSort:");
        NumerosRandom(arreglo2);
        QuickSort quick = new QuickSort();
        quick.Sort(arreglo2);
        quick.Show(arreglo2);
        long DURACION_MS1 = System.currentTimeMillis() - INICIO_MS1;
        System.out.println("El algoritmo QuickSort se demor� " + DURACION_MS1 + " MiliSegundos");
        long INICIO_MS2 = System.currentTimeMillis();
        System.out.println("MergeSort:");
        NumerosRandom(arreglo2);
        MergeSort merge = new MergeSort();
        merge.Sort(arreglo2);
        merge.Show(arreglo2);
        long DURACION_MS2 = System.currentTimeMillis() - INICIO_MS2;
        System.out.println("El algoritmo MergeSort se demor� " + DURACION_MS2 + " MiliSegundos");
        /*Scanner neme2 = new Scanner(System.in);
		System.out.println("Introduzca un n(Ordenado):");
		n2=neme2.nextInt();
		
		int arreglo22[]=new int[n2];
		
		NumerosOrdenados(arreglo22);
		QuickSort quick2= new QuickSort();
		quick2.QuickSort(arreglo22);
		quick.Show(arreglo22);
    }
 */