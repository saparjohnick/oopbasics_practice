package polymorphism_practice;

public class Undergraduatestudent extends Student {
    public Undergraduatestudent(String name, double gpa) {
        super(name, gpa);
    }

    public double getGPACutoff() {
        return 3.0;
    }

    public boolean isInGoodStanding() {
        return super.isInGoodStanding() && checkOutCourses();
    }

    public boolean checkOutCourses() {
        return true;
    }

}
