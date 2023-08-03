package Model.toy;

public class Toy {

    int id;
    String name;
    double weight;

    public Toy(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Игрушка: id = " + id + ", Наименование = " + name + ", Вес = " + weight;
    }
}