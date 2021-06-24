package polymorphism_practice;

import classes_practice.StudentArrayList;

public class Test {
    public static void main(String[] args) {
        StudentArrayList students = new StudentArrayList();
        Undergraduatestudent student1 = new Undergraduatestudent("Alex", 4.0);
        Graduatestudent student2 = new Graduatestudent("Alina", 4.3);
        Graduatestudent student3 = new Graduatestudent("Patricia", 1.7);
        students.add(student1);
        students.add(student2);
        students.add((student3));
        students.print();
        // dynamic binding is we unaware of .isInGoodStanding() called on wrong type ~ polymorphism
        // the same if Student -- interface
        for (int index = 0; index < students.size(); index++) {
            if (students.get(index).isInGoodStanding()) {
                System.out.println(students.get(index).getName() + " is in good standing");
            } else {
                System.out.println(students.get(index).getName() + " is not in good standing");
            }
        }
    }
}
