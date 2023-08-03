package Model.fileHandlers;

import java.io.FileWriter;
import java.io.IOException;

public class TxtFileHandler {
    public void saveToyForLottery(String text) {
        try(FileWriter writer = new FileWriter("src/Toys.txt", true))
        { 
            writer.write(text);
            writer.append('\n');
            writer.flush();
            System.out.println("Сохранение игрушки прошло успешно!");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
