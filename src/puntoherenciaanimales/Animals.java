package puntoherenciaanimales;

import javax.swing.JOptionPane;

public class Animals {
    
    private int legs;
    private String typeOfNat;
    private String breathing;

    public Animals(int legs, String natality, String breathing) {
        this.legs = legs;
        this.typeOfNat = natality;
        this.breathing = breathing;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getTypeOfNat() {
        return typeOfNat;
    }

    public void setTypeOfNat(String typeOfNat) {
        this.typeOfNat = typeOfNat;
    }

    public String getBreathing() {
        return breathing;
    }

    public void setBreathing(String breathing) {
        this.breathing = breathing;
    }
    
    public void food(){
        JOptionPane.showInputDialog("comida de animlaes");
    }
    
}
