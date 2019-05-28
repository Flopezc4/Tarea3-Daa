package controlador;

import gui.GUI1;
import modelo.Ordenamiento;


public class main {
    
    public static void main(String [] args){
        GUI1 vista =new GUI1();
        Ordenamiento modelo = new Ordenamiento();
        controlador contro = new controlador(vista,modelo);
        
        contro.iniciar();
        
    }
}