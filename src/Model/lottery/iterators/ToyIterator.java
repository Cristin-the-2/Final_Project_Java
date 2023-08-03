package Model.lottery.iterators;

import java.util.Iterator;
import java.util.List;

import Model.toy.Toy;

public class ToyIterator implements Iterator<Toy> {
    private int index;
    private List<Toy> toys;

    public ToyIterator(List<Toy> toys) {
        this.toys = toys;
    }

    @Override
    public boolean hasNext() {
        return index < toys.size();
    }

    @Override
    public Toy next() {
        return toys.get(index++);
    } 
}
