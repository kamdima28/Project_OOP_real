package Classes;

import javax.swing.*;
import java.io.*;

public class Serialization {

    public <T> byte[] serialization (T Object) {

        byte[] serializedPerson = null;
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(Object);
            serializedPerson = baos.toByteArray();
            JOptionPane.showMessageDialog(null, "Saved");
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }

        return serializedPerson;
    }
    public <T> T DeSerialization (byte[] serializedObject) {

        T deserializedObject = null;
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedObject);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            deserializedObject = (T) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");
        }
        return deserializedObject;
    }
}
