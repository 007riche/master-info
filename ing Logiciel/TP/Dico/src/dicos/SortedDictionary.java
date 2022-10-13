package dicos;

import commun.AbstractDictionary;

public class SortedDictionary extends OrderedDictionary {
    @Override
    protected int indexOf(Object key) {
        return 0;
    }

    @Override
    protected int newIndexOf(Object key) {
        return 0;
    }
}
