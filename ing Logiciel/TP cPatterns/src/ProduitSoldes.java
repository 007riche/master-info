public class ProduitSoldes extends Produit {
private  String nom;
private  double prixAchat;
    public ProduitSoldes(String nom, double prixAchat) {

        super(nom, prixAchat);
        this.nom = nom;
        this.prixAchat = prixAchat;

    }
    @Override
    public double getPrixLocation() {
        return this.prixAchat /2 ;
    }


}
