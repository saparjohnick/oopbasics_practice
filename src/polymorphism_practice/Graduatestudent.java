package polymorphism_practice;

public class Graduatestudent extends Student{
    public Graduatestudent(String name, double gpa) {
        super(name, gpa);
    }

    public double getGPACutoff () {
        return 2.0;
    }
}
