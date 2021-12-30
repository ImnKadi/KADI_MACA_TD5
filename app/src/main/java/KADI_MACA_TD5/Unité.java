package KADI_MACA_TD5;

public class Unité {

    private Déplacement deplacement;
    private Attaque uneattaque;

    private String type;

    public Unité(Déplacement deplacement, String type, Attaque uneattaque){
        this.deplacement = deplacement;
        this.type = type;
        this.uneattaque = uneattaque;
    }

    public void setDeplacer(){
    }

    public String toString(){
        return "la partie" + type + "a pour type de déplacement"  + deplacement.getClass().getSimpleName() + "et de stratégie d'attaque" + uneattaque.getClass().getSimpleName();
    }

    public void combattre(){}

    public static void main(String args[]){
        Déplacement courrez = new Courir();
        Attaque lancezmissile = new Missile();
        Unité unepartie = new Unité(courrez, "premierepartie", lancezmissile);
        System.out.println(unepartie.toString());
    }
}
