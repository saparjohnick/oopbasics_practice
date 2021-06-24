package classes_practice;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String address;
    private double gpa;
    private static double minimumGPA;

    public Student(String studentName) {
        name = studentName;
    }

    public Student(String studentName, String studentAddress) {
        name = studentName;
        address = studentAddress;
    }

    public String toString() {
        return "Name: " + name + " \nAddress: " + address;
    }

    public static void main(String[] args){
        Student aStudent = new Student("Michael", "Akademika Dovzhenko 6k3");
        Student bStudent = new Student("Michael", "Akademika Dovzhenko 6k3");
        System.out.println(aStudent.equals(bStudent)); // just to check a new equal().
        Student.setMinimumGPA(2.0);
        System.out.println("Minimum GPA is: " + Student.getMinimumGPA());
    }

    public void setName(String studentName) {
        name = studentName;
    }

    public void setAddress(String studentAddress) {
        address = studentAddress;
    }

    public static void setMinimumGPA(double newMinimum) {
        minimumGPA = newMinimum;
    }

    public static double getMinimumGPA() { return minimumGPA; }

    public String getName() {
        return name;
    }

    public String getAddress() { return address; }

    public double getGpa() { return gpa; }

    public void computeGPA() {
        // code to access the stored courses, compute and set the gpa
    }
    public void assignGrade(char newGrade) {
        // code to assign newGrade to aCourse
        computeGPA();
    }

    public boolean equals(Object anObject) {
        Student student = (Student) anObject;
        return student.name.equals(name) && student.address.equals(address);
    }
}
