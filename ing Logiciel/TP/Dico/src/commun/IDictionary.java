package commun;

public interface IDictionary {


    //rend la valeur associ´ee `a key dans le receveur
    Object get(Object key);

    //entre une nouveau couple cl´e-valeur dans le receveur, rend le receveur.
    IDictionary put(Object key, Object value);

    //rend vrai si le receveur est vide, faux sinon
    boolean isEmpty();

    //rend vrai si la cl´e est connue dans le receveur, faux sinon.
    boolean containsKey(Object key);


    //rend le nombre d’´el´ements (donc le nombre de couples cl´e-valeur) contenus dans le receveur.
    int size();
}
