package Classes;

import java.io.*;

public class ToRoute implements ModelRoute{

    @Override
    public Place getRoute() {
        try {
            // Створення FileInputStream для читання з файлу
            FileInputStream fileIn = new FileInputStream("person.ser");

            // Створення ObjectInputStream для десеріалізації об'єкта з файлу
            ObjectInputStream in = new ObjectInputStream(fileIn);

            // Десеріалізація об'єкта з файлу
            Route route = (Route) in.readObject();

            // Закриття потоку ObjectInputStream та FileInputStream
            in.close();
            fileIn.close();



        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}