public class Produit {
    private String  nom;
    private double prixAchat;

    public Produit(String nom, int prixAchat) {
        this.nom = nom;
        this.prixAchat = prixAchat;
    }

    public double getPrixLocation() {
return this.prixAchat + 10 * this.prixAchat /100;
    }

}
