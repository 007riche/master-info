public class CompteReduction extends Compte {
    double reduction = 0.10;

    public CompteReduction(Client c) {
        super(c);
    }

    @Override
    public double prixLocation(Produit p) {
        return super.prixLocation(p) - super.prixLocation(p) * reduction;
    }
}
