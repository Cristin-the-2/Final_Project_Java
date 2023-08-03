
import Model.service.Service;

public class Main {
    public static void main(String[] args) {

        Service service = new Service();
        service.addToy("Матрёшка", 65);
        service.addToy("Робот", 3);
        service.addToy("Машинка", 64);
        service.addToy("Кукла", 25);

        service.saveToyForLottery();
        service.saveToyForLottery();
        service.saveToyForLottery();
        service.saveToyForLottery();

    }
}
