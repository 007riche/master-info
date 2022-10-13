package dicos;

import commun.AbstractDictionary;

public class OrderedDictionary extends AbstractDictionary {

    @Override
    protected int indexOf(Object key) {
        return 0;
    }

    protected int newIndexOf(Object key) {
        int size = this.size;
        if (size == keys.length) {
            this.grow();
            return keys.length - 1;
        }
        return -1;

    }

    protected void grow() {
        Object[] newKeys = new Object[keys.length + 1];
        Object[] newValues = new Object[keys.length + 1];

        for (int i = 0; i < keys.length; i++) {
            newKeys[i] = keys[i];
            newValues[i] = values[i];
        }
        keys = newKeys;
        values= newValues;
    }
}
