package BehavioralPattern.Iterator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:29
 */
public class NameRepository implements Container{
    public String[] names = {"Robert", "John", "Julie", "Lora"};
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}

class NameIterator implements Iterator{
    int index;
    String[] names;
    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return index < names.length;
    }

    @Override
    public Object next() {
        return names[index++];
    }
}
