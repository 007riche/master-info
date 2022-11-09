public class Produit {
    private String  nom;
    private double prixAchat;

 //   public Produit() {
 //  }

    public Produit(String nom, double prixAchat) {
        this.nom = nom;
        this.prixAchat = prixAchat;
    }

    public double getPrixLocation() {
return this.prixAchat + 10 * this.prixAchat /100;
    }

}
