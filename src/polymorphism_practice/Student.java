package polymorphism_practice;

public class Student {
    private String name;
    private double gpa;

    public Student( String name, double gpa ) {
        this.name = name;
        this.gpa = gpa;
    }

    public boolean isInGoodStanding() {
        return (gpa >= getGPACutoff());
    }

    public String getName() {
        return name;
    }

    public double getGPACutoff() {
        return 0.0;
    }

}
