import java.util.Scanner;
import Sorted.QuickSort; 


public class Ordenamiento {
	
	
	public static void NumerosRandom(int[]arreglo){
	
	for(int i = 0; i<arreglo.length;i++) {
		
		arreglo[i]=(int)(Math.random()*100);
		System.out.println(arreglo[i]);
		}
		
	}
	

	public static void main(String[]args) {
	
		int n;
		Scanner neme = new Scanner(System.in);
		System.out.println("Introduzca un n:");
		n=neme.nextInt();
		
        int arreglo2[]=new int[n];
        		
        NumerosRandom(arreglo2);
	
		QuickSort quick = new QuickSort();
		quick.QuickSort(arreglo2);
		quick.Show(arreglo2);
	}
	
}
