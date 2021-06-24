package classes_practice;

import polymorphism_practice.Student;

public class StudentArrayList implements StudentList {
    private Student[] students;
    private int count;
    private int first;
    private int initialCapacity;

    public StudentArrayList() {
        this(10);
    }

    /* Declare a field in the class StudentArrayList, which is an array of type Student.
    */
    public StudentArrayList(int capacity) {
        students = new Student[capacity];
        initialCapacity = capacity;
    }

    /* last = (first + count) % array.lengh -- actual loading vs array's capacity i.e. 10
    We will have two variables, first that gives the index of the first occupied cell, and count, the number of
    objects in the list. When the list is empty, both are 0. When we add an object to the list, we will insert it
    at (first + count) % array size and increment count.
     */
    public void add(Student student) {
        if (count == students.length) {
            reallocate(count * 2);
        }
        int last = (first + count) % students.length;
        students[last] = student;
        count++;
    }

    public void delete(String name) {
        for (int index = first, counter = 0; counter < count; counter++, index = (index + 1) % students.length) {
            if (students[index].getName().equals(name)) {
                students[index] = students[(first + count - 1) % students.length];
                students[(first + count - 1) % students.length] = null;
                count--;
                return;
            }
        }
    }

    public Student get(int index) {
        if (index >= 0 && index < count) {
            return students[index];
        }
        return null;
    }

    public int size() {
        return count;
    }

    public void print() {
        for (int index = first, counter = 0; counter < count; counter++, index = (index + 1) % students.length ) {
            System.out.println(students[index]);
        }
    }

    /*
    Allocate an array of the required size.We will allocate storage for as many students as the user wishes;
    if the user does not specify a number, we will allocate space for a small number, say, 10, of objects.
    In any case, when this array fills up, we will allocate more.
     */
    public void reallocate(int size) {
        Student[] temp = new Student[size];
        if (first + count >= students.length) {
            int count1 = students.length - first;
            int count2 = count - count1;
            System.arraycopy(students, first, temp, 0, count1);
            System.arraycopy(students, first + count1, temp, count1, count2);
        } else {
            System.arraycopy(students, first, temp, 0, count);
        }
        students = temp;
        first = 0;
    }
}
