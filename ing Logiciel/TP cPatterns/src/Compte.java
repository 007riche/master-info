public class Compte {
    private  Client client;
    public Compte(Client c) {
        this.client = c;
    }

    public double prixLocation(Produit p) {
        double prixLocProduit = p.getPrixLocation();
        return prixLocProduit + prixLocProduit/10;
    }
}
