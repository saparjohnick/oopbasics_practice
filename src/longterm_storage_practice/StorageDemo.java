package longterm_storage_practice;

import classes_practice.Student;
import inheritance_practice.Television;

import javax.security.auth.login.AccountException;
import java.io.*;

public class StorageDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("some_data");
        ObjectOutputStream output = new ObjectOutputStream(file);
        int i = 7;
        char c = 'q';
        boolean b = true;
        double d = 3.14;
        output.writeInt(i);
        output.writeChar(c);
        output.writeBoolean(b);
        output.writeDouble(d);
        output.close();

        FileInputStream inputFile = new FileInputStream("some_data"); // it's a path to already existed some_data file
        ObjectInputStream input = new ObjectInputStream(inputFile);

        int in = input.readInt();
        char ch = input.readChar();
        boolean bo = input.readBoolean();
        double dou =input.readDouble();
        System.out.println(in + " " + ch + " " + bo + " " + dou);

    }

    public StorageDemo() throws IOException {
    }
}
