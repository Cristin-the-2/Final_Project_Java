package Model.service;

import Model.fileHandlers.TxtFileHandler;
import Model.lottery.ToyList;
import Model.toy.RandomToyChooser;
import Model.toy.Toy;

public class Service {
    private int idToy;
    private ToyList toys;

    public Service() {
        toys = new ToyList();
    }

    public void addToy(String name, double weight){
        Toy toy = new Toy(idToy++, name, weight);
        toys.addToy(toy);
    }

    public Toy getToyForWeight() {
        RandomToyChooser random = new RandomToyChooser();
        Toy toy = random.chooseOnWeight(toys);
        return toy;
    }

    public void saveToyForLottery() {
        Toy toy = getToyForWeight();
        String text = toy.toString();
        TxtFileHandler txtFileHandler = new TxtFileHandler();
        txtFileHandler.saveToyForLottery(text);
        toys.removeToy(toy);
    }
}
