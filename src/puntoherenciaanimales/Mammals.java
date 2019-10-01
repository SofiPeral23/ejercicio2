package puntoherenciaanimales;

import javax.swing.JOptionPane;

public final class Mammals extends Animals {
    
    private String fur;
    private String teeth;
    private String bloodH;

    public Mammals(String fur, String teeth, String bloodH, int legs, String natality, String breathing) {
        super(legs, natality, breathing);
        this.fur = fur;
        this.teeth = teeth;
        this.bloodH = bloodH;
    }
    
    public void show(){
        JOptionPane.showMessageDialog(null,"                        MAMIFEROS   "+"\npatas: "+getLegs()
                +"\nTipo de nacimiento: "+getTypeOfNat()
                +"\nTipo de respiracion: "+getBreathing()
                + "\npelaje"+fur
                +"\nDientes: "+teeth
                +"\nTipo de sangre: "+bloodH);
    }
    
    @Override
    public void food(){
        
        JOptionPane.showMessageDialog(null, "Son hervivoros, carnivores y omnivoros");
        
    }
  
}
