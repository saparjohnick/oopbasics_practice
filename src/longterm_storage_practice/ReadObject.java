package longterm_storage_practice;

import classes_practice.Student;
import inheritance_practice.Television;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Object[] objects;
        Student student;
        Television television;
        FileInputStream file = new FileInputStream("objects_data");
        ObjectInputStream inputStream = new ObjectInputStream(file);
//        objects = (Object[]) inputStream.readObject();

        television = (Television) inputStream.readObject();
        student = (Student) inputStream.readObject();
        System.out.println(television.toString() + "\n" + student.toString());

    }
}
