package controlador;

import gui.GUI1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Ordenamiento;

public class controlador implements ActionListener{
    private int[] arreglo ;
    private Comparable[] arreglo2;
    private GUI1 frame;
    private Ordenamiento modelo;
    
    public controlador(GUI1 frame,Ordenamiento modelo){
        this.frame = frame;
        this.modelo = modelo;
        this.frame.BotonOrdenadosInsertionSort.addActionListener(this);
        this.frame.BotonOrdenadosMergeSort.addActionListener(this);
        this.frame.BotonRandomInssertionSort.addActionListener(this);
        this.frame.BotonRandomMergeSort.addActionListener(this);
        this.frame.BotonRandomQuickSort.addActionListener(this);
        this.frame.BotonOrdenadosQuickSort.addActionListener(this);
    }
    
    public void iniciar(){
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frame.BotonOrdenadosInsertionSort){
            int n = Integer.parseInt(frame.TextNumerosInsertion.getText());
            arreglo = new int[n];
            
        }
        if(e.getSource() == frame.BotonRandomInssertionSort){
            int n = Integer.parseInt(frame.TextNumerosInsertion.getText());
            arreglo = new int[n];
         
        }
        if(e.getSource() == frame.BotonOrdenadosMergeSort){
            int n = Integer.parseInt(frame.TextNumerosMerge.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosOrdenados(arreglo);
                     
            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaMergeSort.setText(text);
            frame.JTextAreaMergeSort.setText(text);
            modelo.OrdenarPorMerge(arreglo);
            modelo.merge.Show(arreglo);
        }
        
        if(e.getSource() == frame.BotonRandomMergeSort){
        	
        	 
            int n = Integer.parseInt(frame.TextNumerosMerge.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosRandom(arreglo);
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaMergeSort.setText(text);
            frame.JTextAreaMergeSort.setText(text);
            modelo.OrdenarPorMerge(arreglo);
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaMergeSort.setText(text);
            modelo.merge.Show(arreglo);

       
            
        }
        
        if(e.getSource() == frame.BotonOrdenadosQuickSort){
            
            int n = Integer.parseInt(frame.TextNumerosQuick.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosOrdenados(arreglo);
                     
            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaQuickSort.setText(text);
            frame.JTextAreaQuickSort.setText(text);
            modelo.OrdenarPorQuick(arreglo);
            modelo.quick.Show(arreglo);
            

        }
        if(e.getSource() == frame.BotonRandomQuickSort){
                       
            
            int n = Integer.parseInt(frame.TextNumerosQuick.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosRandom(arreglo);
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaQuickSort.setText(text);
            frame.JTextAreaQuickSort.setText(text);
            modelo.OrdenarPorMerge(arreglo);
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaQuickSort.setText(text);
            modelo.quick.Show(arreglo);

            
            
        }
    }

}