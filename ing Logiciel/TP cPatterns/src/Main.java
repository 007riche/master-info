public class Main {
    public static void main(String[] args) {
        Produit lgv = new Produit("La grande vadrouille", 10.0);
        Client cl = new Client("Dupont");
        Compte cmt = new Compte(cl);
        cmt.prixLocation(lgv);

        Compte cmt2 = new CompteReduction(cl);
        System.out.println("CompteReduction : " + cmt2.prixLocation(lgv));

        Compte cmt3 = new CompteSeuil(cl); // le seuil est `a 2 par d´efaut
        System.out.println("CompteSeuil : " + cmt3.prixLocation(lgv));
        System.out.println("CompteSeuil : " + cmt3.prixLocation(lgv));
        System.out.println("CompteSeuil : " + cmt3.prixLocation(lgv)); // doit afficher 0

        Produit r4 = new ProduitSoldes("RockyIV", 10.0);
        System.out.println("CompteNormal+ProduitSold´e : " + cmt.prixLocation(r4));
        System.out.println("CompteReduction+ProduitSold´e : " + cmt2.prixLocation(r4));
    }
}