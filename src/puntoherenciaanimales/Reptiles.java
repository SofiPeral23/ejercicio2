package puntoherenciaanimales;

import javax.swing.JOptionPane;

public final class Reptiles extends Animals{
    
    private String blood;
    private String Movement;

    public Reptiles(String blood, String Movement, int legs, String natality, String breathing) {
        super(legs, natality, breathing);
        this.blood = blood;
        this.Movement = Movement;
    }
    
    public void show(){
        JOptionPane.showMessageDialog(null,"                   REPTILES   "+"\npatas: "+getLegs()
                +"\nTipo de nacimiento: "+getTypeOfNat()
                +"\nTipo de respiracion: "+getBreathing()
                + "\nTipo de sangre: "+blood
                +"\nMovimiento: "+Movement);
    }
    
    @Override
    public void food(){
        JOptionPane.showMessageDialog(null, "Algunos son carnivoros como las serpientes y los cocodrilos \notros son insectivoros como las lagartijas ");
    }
   
}
