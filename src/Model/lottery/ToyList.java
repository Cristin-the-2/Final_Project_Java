package Model.lottery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Model.lottery.iterators.ToyIterator;
import Model.toy.Toy;

public class ToyList implements Iterable<Toy> {
    private List<Toy> toys;

    public ToyList() {
        toys = new ArrayList<>();
    }
    
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void removeToy(Toy toy) {
        toys.remove(toy);
    }

    @Override
    public Iterator<Toy> iterator() {
        return new ToyIterator(toys);
    }
}