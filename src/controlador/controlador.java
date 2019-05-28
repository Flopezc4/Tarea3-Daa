package controlador;

import gui.GUI1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Duration;
import java.time.Instant;
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
        this.frame.BotonOrdenadosArraySort.addActionListener(this);
        this.frame.BotonOrdenadosCollectionSort.addActionListener(this);
        this.frame.BotonRandomArraysSort.addActionListener(this);
        this.frame.BotonRandomCollectionSort.addActionListener(this);
        
        
        
       // this.frame.BotonTablaInsertion.addActionListener(this);
       // this.frame.BotonTablaQuick.addActionListener(this);
       // this.frame.BotonTablaMerge.addActionListener(this);
       // this.frame.BotonTablaArrays.addActionListener(this);
       // this.frame.BotonTablaCollection.addActionListener(this);

        
        
        
        
    }
    
    public void iniciar(){
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frame.BotonOrdenadosInsertionSort){
        	
        	frame.JTextAreaInsertionSort.setText(" ");
        	frame.TiempoEstimadoInsertion.setText(" ");
            int n = Integer.parseInt(frame.TextNumerosInsertion.getText());
            arreglo = new int[n];
            String text = " ";
       
            
            modelo.NumerosOrdenados(arreglo);
            
            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaInsertionSort.setText(text);
           
            
            modelo.insertionSortArray(arreglo);
   
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaInsertionSort.setText(text);
            
 
        }
        if(e.getSource() == frame.BotonRandomInssertionSort){
        	frame.JTextAreaInsertionSort.setText(" ");
        	frame.TiempoEstimadoInsertion.setText(" ");
        	
            int n = Integer.parseInt(frame.TextNumerosInsertion.getText());
            arreglo = new int[n];
            String text = " ";
           
            modelo.NumerosRandom(arreglo);

            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaInsertionSort.setText(text);
  
          
            modelo.insertionSortArray(arreglo);
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaInsertionSort.setText(text);
            
            
            
        }
        if(e.getSource() == frame.BotonOrdenadosMergeSort){
        	frame.JTextAreaMergeSort.setText(" ");
        	frame.TiempoEstimadoMerge.setText(" ");
        	
        	int n = Integer.parseInt(frame.TextNumerosMerge.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosOrdenados(arreglo);
                     
            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaMergeSort.setText(text);
            
            Instant ini = Instant.now();
            
            
            modelo.OrdenarPorMerge(arreglo);
            
            Instant fin = Instant.now();
            
            
            System.out.println(Duration.between(ini, fin).toMillis()+ " MiliSegundos");
            frame.TiempoEstimadoMerge.setText(" "+Duration.between(ini, fin).toMillis());
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaMergeSort.setText(text);
            
            
            
            //modelo.merge.Show(arreglo);
        }
        
        if(e.getSource() == frame.BotonRandomMergeSort){
        	
        	frame.JTextAreaMergeSort.setText(" ");
        	frame.TiempoEstimadoMerge.setText(" ");
            int n = Integer.parseInt(frame.TextNumerosMerge.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosRandom(arreglo);
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaMergeSort.setText(text);
            
            
            Instant ini = Instant.now();
            
            
            modelo.OrdenarPorMerge(arreglo);
            
            Instant fin = Instant.now();
            
            
            System.out.println(Duration.between(ini, fin).toMillis()+ " MiliSegundos");
            frame.TiempoEstimadoMerge.setText(" "+Duration.between(ini, fin).toMillis());
            
            
            
            
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaMergeSort.setText(text);
           // modelo.merge.Show(arreglo);

       
            
        }
        
        if(e.getSource() == frame.BotonOrdenadosQuickSort){
            
        	
        	frame.JTextAreaQuickSort.setText(" ");
        	frame.TiempoEstimadoQuick.setText(" ");
        	
        	
            int n = Integer.parseInt(frame.TextNumerosQuick.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosOrdenados(arreglo);
                  
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaQuickSort.setText(text);
    
            
            Instant ini1 = Instant.now();
            
            
            modelo.OrdenarPorQuick(arreglo);
            
            Instant fin2 = Instant.now();
            
            
           //System.out.println(Duration.between(ini1, fin2).toMillis()+ " MiliSegundos");
            frame.TiempoEstimadoQuick.setText(" "+Duration.between(ini1, fin2).toMillis());
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaQuickSort.setText(text);
            

        }
        if(e.getSource() == frame.BotonRandomQuickSort){
                       
        	frame.JTextAreaQuickSort.setText(" ");
        	frame.TiempoEstimadoQuick.setText(" ");
            int n = Integer.parseInt(frame.TextNumerosQuick.getText());
            arreglo = new int[n];
            String text = " ";
            modelo.NumerosRandom(arreglo);
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaQuickSort.setText(text);
         
           Instant ini = Instant.now();
            
            
            modelo.OrdenarPorQuick(arreglo);
            
            Instant fin = Instant.now();
            
            
            //System.out.println(Duration.between(ini, fin).toMillis()+ " MiliSegundos");
            frame.TiempoEstimadoQuick.setText(" "+Duration.between(ini, fin).toMillis());
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            frame.JTextAreaQuickSort.setText(text);
            

            
            
        }if(e.getSource() == frame.BotonOrdenadosCollectionSort){
        	frame.JTextAreaCollectionSort.setText(" ");
        	frame.TiempoEstimadoCollection.setText(" ");
        	
            int n = Integer.parseInt(frame.TextNumerosCollectionSort.getText());
            arreglo = new int[n];
            String text = " ";

            
            modelo.NumerosOrdenados(arreglo);
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            	text += "\n";
            frame.JTextAreaCollectionSort.setText(text);
            
            modelo.collectionSortJava(arreglo);
            // modelo.insertionSortArray(arreglo);
    
             for(int i =0 ;i<arreglo.length;i++ )
                 text = text+arreglo[i]+" ";
             
             frame.JTextAreaCollectionSort.setText(text);

            
            
        }
        if(e.getSource() == frame.BotonRandomCollectionSort){
        	frame.JTextAreaCollectionSort.setText(" ");
        	frame.TiempoEstimadoCollection.setText(" ");
        	
            int n = Integer.parseInt(frame.TextNumerosCollectionSort.getText());
            arreglo = new int[n];
            String text = " ";
           
            
            
            modelo.NumerosRandom(arreglo);
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            	text += "\n";
            frame.JTextAreaCollectionSort.setText(text);
            
            modelo.collectionSortJava(arreglo);
            //modelo.insertionSortArray(arreglo);
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            
            frame.JTextAreaCollectionSort.setText(text);
            
            
            
        }
        
        if(e.getSource() == frame.BotonOrdenadosArraySort){
        	frame.JTextAreaArraysSort.setText(" ");
        	frame.TiempoEstimadoArrays.setText(" ");
        	
            int n = Integer.parseInt(frame.TextNumerosArrays.getText());
            arreglo = new int[n];
            String text = " ";
           
            
            modelo.NumerosOrdenados(arreglo);
           // modelo.sortJava(arreglo);
   
           
            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaArraysSort.setText(text);
           
            
            modelo.sortJava(arreglo);
           // modelo.insertionSortArray(arreglo);
   
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            
            frame.JTextAreaArraysSort.setText(text);
            
            
            
            
        }
        if(e.getSource() == frame.BotonRandomArraysSort){
        	

        	frame.JTextAreaArraysSort.setText(" ");
        	frame.TiempoEstimadoArrays.setText(" ");
        	
            int n = Integer.parseInt(frame.TextNumerosArrays.getText());
            arreglo = new int[n];
            String text = " ";
                     
            //modelo.sortJava(arreglo);
            modelo.NumerosRandom(arreglo);


            for(int i  =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            text += "\n";
            frame.JTextAreaArraysSort.setText(text);
  
          
            modelo.sortJava(arreglo);
            //modelo.insertionSortArray(arreglo);
            
            for(int i =0 ;i<arreglo.length;i++ )
                text = text+arreglo[i]+" ";
            
            frame.JTextAreaArraysSort.setText(text);
   
            ///////////////////////////////////////////////////////TODOS LOS SORT/////////////////////////////////////////////////////////
        }
        
        
        
    }

}