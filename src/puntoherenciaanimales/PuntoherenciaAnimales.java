package puntoherenciaanimales;

import javax.swing.JOptionPane;

public class PuntoherenciaAnimales {
    
     
    
    public static void main(String[] args) {
        
        int opc;
        String w;
        
        Mammals m1 = new Mammals("tienen dientes con diferentes formas", "Tienen diferentes formas", "son de sangre caliente", 4, "son viviparos", "usan los pulmones para respirar oxigeno");
                
        Reptiles r1 = new Reptiles("Tienen sangre fria ", "Reptan", 4 , "Son oviparos", "usan los pulmones");
        
        
        
        
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("Digite que grupo de animales desea ver: \n1. Reptiles\n2. Mamiferos"));
            switch(opc){
            case 1:
                r1.show();
                r1.food();
                break;
            case 2:
                m1.show();
                m1.food();
                break;
            }
            
            w = JOptionPane.showInputDialog("Desea ver el otro grupo de animales?");
            
        }while(w != "si"|| w != "SI");
        
        
        
    }
    
}
