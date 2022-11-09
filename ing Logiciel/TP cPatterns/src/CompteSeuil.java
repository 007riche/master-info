public class CompteSeuil extends Compte {
   static int init = 2;
    int compteur = init;
    public CompteSeuil(Client c) {
        super(c);
    }

    @Override
    public double prixLocation(Produit p) {
        if (compteur-- == 0) {
            compteur = init;
            return 0.0;
        } else
            return super.prixLocation(p);
    }
}
