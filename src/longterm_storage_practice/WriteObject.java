package longterm_storage_practice;

import classes_practice.Student;
import inheritance_practice.Television;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        // store some objects
        Television television = new Television("bravia", "sony", 400);
        Student student = new Student("Alex", "Adress 3k3");


        FileOutputStream objectsFile = new FileOutputStream("objects_data");
        ObjectOutputStream outputStream = new ObjectOutputStream(objectsFile);

        outputStream.writeObject(television);
        outputStream.writeObject(student);
        outputStream.close();
    }

    public WriteObject() throws IOException {
    }
}
