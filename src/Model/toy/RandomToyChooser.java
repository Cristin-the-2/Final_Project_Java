package Model.toy;


import Model.lottery.ToyList;

public class RandomToyChooser {
    public Toy chooseOnWeight(ToyList toys) {
        double completeWeight = 0.0;
        for (Toy toy : toys)
            completeWeight += toy.getWeight();
        double rand = Math.random() * completeWeight;
        double countWeight = 0.0;
        for (Toy toy : toys) {
            countWeight += toy.getWeight();
            if (countWeight >= rand)
                return toy;
        }
        throw new RuntimeException("RuntimeException");
    }
}
