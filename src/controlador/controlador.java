package controlador;

import gui.GUI1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;

import javax.swing.JOptionPane;

import modelo.Ordenamiento;

public class controlador implements ActionListener {
	private int[] arreglo;
	private GUI1 frame;
	private Ordenamiento modelo;
	public long startTime;
	public long endTime;
	private int[] arreglo2;
	private int[] arreglo3;
	private int[] arreglo4;
	private int[] arreglo5;

	public controlador(GUI1 frame, Ordenamiento modelo) {
		this.frame = frame;
		this.modelo = modelo;
		this.frame.BotonOrdenadosInsertionSort.addActionListener(this);
		this.frame.BotonOrdenadosMergeSort.addActionListener(this);
		this.frame.BotonRandomInssertionSort.addActionListener(this);
		this.frame.BotonRandomMergeSort.addActionListener(this);
		this.frame.BotonRandomQuickSort.addActionListener(this);
		this.frame.BotonOrdenadosQuickSort.addActionListener(this);
		this.frame.BotonOrdenadosArraySort.addActionListener(this);
		this.frame.BotonOrdenadosCollectionSort.addActionListener(this);
		this.frame.BotonRandomArraysSort.addActionListener(this);
		this.frame.BotonRandomCollectionSort.addActionListener(this);
		this.frame.JButtonComparar.addActionListener(this);
		// this.frame.BotonComparacionQuick.addActionListener(this);

	}

	public void iniciar() {
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			if (e.getSource() == frame.JButtonComparar) {
				frame.textAreaTabla.setText(" ");
				frame.JTextComparacionInsert.setText(" ");
				frame.JTextComparacionMerge.setText(" ");
				frame.JTextComparacionQuick.setText(" ");
				frame.JTextComparacionArrays.setText(" ");
				frame.JTextComparacionCollection.setText(" ");

				int n = Integer.parseInt(frame.TextCompararNumeros.getText());
				arreglo = new int[n];
				arreglo2 = new int[n];
				arreglo3 = new int[n];
				arreglo4 = new int[n];
				arreglo5 = new int[n];
				String text = " ";
				modelo.NumerosRandom(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++) {
					text = text + arreglo[i] + " ";
				}
				
				
				for (int i = 0; i < arreglo.length; i++) {
					arreglo2[i] = arreglo[i];
					arreglo3[i] = arreglo[i];
					arreglo4[i] = arreglo[i];
					arreglo5[i] = arreglo[i];

				}
				text += "\n";
				frame.textAreaTabla.setText(text);

				
				startTime = System.nanoTime();
				modelo.insertionSortArray(arreglo3);
				endTime = System.nanoTime() - startTime; //
				frame.JTextComparacionInsert.setText(" " + endTime / 1e6);

				/*startTime = System.nanoTime();
				modelo.insertionSortArray(arreglo3);
				endTime = System.nanoTime() - startTime; //
				frame.JTextComparacionInsert.setText(" " + endTime / 1e6);*/

				startTime = System.nanoTime();
				modelo.OrdenarPorMerge(arreglo2);
				endTime = System.nanoTime() - startTime; //
				frame.JTextComparacionMerge.setText(" " + endTime / 1e6);

				startTime = System.nanoTime();
				modelo.OrdenarPorQuick(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.JTextComparacionQuick.setText(" " + endTime / 1e6);
				
				//startTime = System.nanoTime();
				//modelo.OrdenarPorQuick(arreglo3);
				//endTime = System.nanoTime() - startTime; //
				//frame.JTextComparacionQuick.setText(" " + endTime / 1e6);

				startTime = System.nanoTime();
				modelo.sortJava(arreglo4);
				endTime = System.nanoTime() - startTime; //
				frame.JTextComparacionArrays.setText(" " + endTime / 1e6);

				startTime = System.nanoTime();
				modelo.collectionSortJava(arreglo5);
				endTime = System.nanoTime() - startTime; //
				frame.JTextComparacionCollection.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.textAreaTabla.setText(text);
			}
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
		}

		if (e.getSource() == frame.BotonOrdenadosInsertionSort) {

			try {
				frame.JTextAreaInsertionSort.setText(" ");
				frame.TiempoEstimadoInsertion.setText(" ");
				int n = Integer.parseInt(frame.TextNumerosInsertion.getText());
				arreglo = new int[n];
				String text = " ";

				modelo.NumerosOrdenados(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaInsertionSort.setText(text);

				startTime = System.nanoTime();
				modelo.insertionSortArray(arreglo);
				endTime = System.nanoTime() - startTime; //
				frame.TiempoEstimadoInsertion.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaInsertionSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}

		if (e.getSource() == frame.BotonRandomInssertionSort) {

			try {
				frame.JTextAreaInsertionSort.setText(" ");
				frame.TiempoEstimadoInsertion.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosInsertion.getText());
				arreglo = new int[n];
				String text = " ";

				modelo.NumerosRandom(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaInsertionSort.setText(text);

				startTime = System.nanoTime();
				modelo.insertionSortArray(arreglo);
				endTime = System.nanoTime() - startTime; //
				frame.TiempoEstimadoInsertion.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaInsertionSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}
		if (e.getSource() == frame.BotonOrdenadosMergeSort) {

			try {
				frame.JTextAreaMergeSort.setText(" ");
				frame.TiempoEstimadoMerge.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosMerge.getText());
				arreglo = new int[n];
				String text = " ";
				modelo.NumerosOrdenados(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaMergeSort.setText(text);

				startTime = System.nanoTime();
				modelo.OrdenarPorMerge(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoMerge.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaMergeSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}

		if (e.getSource() == frame.BotonRandomMergeSort) {

			try {
				frame.JTextAreaMergeSort.setText(" ");
				frame.TiempoEstimadoMerge.setText(" ");
				int n = Integer.parseInt(frame.TextNumerosMerge.getText());
				arreglo = new int[n];
				String text = " ";
				modelo.NumerosRandom(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaMergeSort.setText(text);

				startTime = System.nanoTime();
				modelo.OrdenarPorMerge(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoMerge.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaMergeSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}

		if (e.getSource() == frame.BotonOrdenadosQuickSort) {

			try {
				frame.JTextAreaQuickSort.setText(" ");
				frame.TiempoEstimadoQuick.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosQuick.getText());
				arreglo = new int[n];
				String text = " ";
				modelo.NumerosOrdenados(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaQuickSort.setText(text);

				startTime = System.nanoTime();
				modelo.OrdenarPorQuick(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoQuick.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaQuickSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}
		if (e.getSource() == frame.BotonRandomQuickSort) {

			try {
				frame.JTextAreaQuickSort.setText(" ");
				frame.TiempoEstimadoQuick.setText(" ");
				int n = Integer.parseInt(frame.TextNumerosQuick.getText());
				arreglo = new int[n];
				String text = " ";
				modelo.NumerosRandom(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaQuickSort.setText(text);

				startTime = System.nanoTime();
				modelo.OrdenarPorQuick(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoQuick.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaQuickSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}
		}
		if (e.getSource() == frame.BotonOrdenadosCollectionSort) {

			try {
				frame.JTextAreaCollectionSort.setText(" ");
				frame.TiempoEstimadoCollection.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosCollectionSort.getText());
				arreglo = new int[n];
				String text = " ";

				modelo.NumerosOrdenados(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaCollectionSort.setText(text);

				startTime = System.nanoTime();
				modelo.collectionSortJava(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoCollection.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaCollectionSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}
		if (e.getSource() == frame.BotonRandomCollectionSort) {

			try {
				frame.JTextAreaCollectionSort.setText(" ");
				frame.TiempoEstimadoCollection.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosCollectionSort.getText());
				arreglo = new int[n];
				String text = " ";

				modelo.NumerosRandom(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaCollectionSort.setText(text);

				startTime = System.nanoTime();
				modelo.collectionSortJava(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoCollection.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaCollectionSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}

		if (e.getSource() == frame.BotonOrdenadosArraySort) {

			try {
				frame.JTextAreaArraysSort.setText(" ");
				frame.TiempoEstimadoArrays.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosArrays.getText());
				arreglo = new int[n];
				String text = " ";

				modelo.NumerosOrdenados(arreglo);
				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaArraysSort.setText(text);

				startTime = System.nanoTime();
				modelo.sortJava(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoArrays.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaArraysSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

		}
		if (e.getSource() == frame.BotonRandomArraysSort) {

			try {
				frame.JTextAreaArraysSort.setText(" ");
				frame.TiempoEstimadoArrays.setText(" ");

				int n = Integer.parseInt(frame.TextNumerosArrays.getText());
				arreglo = new int[n];
				String text = " ";

				modelo.NumerosRandom(arreglo);

				int vv = arreglo.length;
				if (vv >= 1000) {
					vv = 1000;
				}

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				text += "\n";
				frame.JTextAreaArraysSort.setText(text);

				startTime = System.nanoTime();
				modelo.sortJava(arreglo);
				endTime = System.nanoTime() - startTime;
				frame.TiempoEstimadoArrays.setText(" " + endTime / 1e6);

				for (int i = 0; i < vv; i++)
					text = text + arreglo[i] + " ";
				frame.JTextAreaArraysSort.setText(text);

			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Por Favor Ingrese un numero!!", null, JOptionPane.WARNING_MESSAGE);
			}

			/////////////////////////////////////////////////////// TODOS LOS
			/////////////////////////////////////////////////////// SORT/////////////////////////////////////////////////////////
		}

	}

}