package dicos;

import commun.AbstractDictionary;


public class FastDictionary extends AbstractDictionary {
    public FastDictionary() {
        this(4);
    }

    public FastDictionary(int i) {
        keys = new Object[i];
        values = new Object[i];
    }


    public int size() {
        int s =0;
        for (int i= 0; i< keys.length; i++) {
            if (keys[i] != null) s= s+1;
        }
        return s;
    }

    @Override
    protected int indexOf(Object key) {
        int tabSize = keys.length;
        int hash = key.hashCode();
        hash = Math.abs(hash);
        int i = hash % tabSize;
        while ((!key.equals(keys[i])) && (keys[i] != null)) {
            i = (i +1) % tabSize;
        }
        if(keys[i] == null) return -1;
        else return i;
    }

    @Override
    protected int newIndexOf(Object key) {
        if(this.mustGrow()) this.grow();
        int tabSize = keys.length;
        int hash = key.hashCode();
        hash = Math.abs(hash);
        int i= hash % tabSize;
        if (keys[i] == null) return i;
        else {
            do {
               // System.out.println();
                    i= ((i+1) % tabSize);
                } while (keys[i] !=null);
                return i;
            }
        }

    private boolean mustGrow() {
        float i = this.size();
        float j = keys.length;
        if ( j == 0) return true;
        else
            return ((i / j) > 0.7);
    }

    private void grow() {
        System.out.println("Growing a fast dico");
        Object[] oldKeys = keys;
        Object[] oldValues = values;
        keys = new Object[oldKeys.length + 5];
        values = new Object[oldKeys.length + 5];
        for (int i=0; i< oldKeys.length; i++)
        {
            if (oldKeys[i] != null) {
                this.put(oldKeys[i], oldValues[i]);
            }
        }
       // System.out.println("taille du tableau: "+keys.length);
    }

    // return i;


}
