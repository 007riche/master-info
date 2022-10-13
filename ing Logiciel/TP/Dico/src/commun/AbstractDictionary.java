package commun;

import java.util.Objects;

abstract public class AbstractDictionary implements IDictionary {
    protected Object[] keys = {};
    protected Object[] values = {};

    protected int size;

    protected abstract int indexOf(Object key);
    protected abstract int newIndexOf(Object key);

    @Override
    public Object get(Object key) {
       if (!this.containsKey(key)) return null;
       int index = this.indexOf(key);
       return (index) == -1 ? null : this.values[index];
    }

    @Override
    public IDictionary put(Object key, Object value)  {
        int index = this.indexOf(key);
        if (index== -1) {
            final int newIndex = this.newIndexOf(key);
            this.keys[newIndex] =key;
            this.values[newIndex] =key;
            this.size++;
        } else {
            this.keys[index] = key;
            this.values[index] = value;
        }
        return this;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public boolean containsKey(Object key) {
        return this.indexOf(key) != -1;
    }

    @Override
    public int size() {
        return this.size;
    }
}
