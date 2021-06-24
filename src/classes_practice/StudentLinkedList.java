package classes_practice;

public class StudentLinkedList implements StudentList{
    private StudentNode head;
    private class StudentNode {
        private Student data;
        private StudentNode next;

        public StudentNode(Student student, StudentNode initialLink) {
            this.data = student;
            next = initialLink;
        }

        public Student getData() { return data; }

        public void setData(Student student) {
            this.data = student;
        }

        public StudentNode getNext() { return next; }

        public void setNext(StudentNode node) {
            next = node;
        }
    }

    /* The code creates a new StudentNode and puts it at the front of the list. */
    public void add(Student student) {
        head = new StudentNode(student, head);
    }

    /* The code first checks if the list is empty; if so, there is nothing to do. With an non- empty list,
    it checks if the name of the student at the front of the list is the same as the name supplied in the parameter.
    If they match, the Student object at the front of the list is deleted from the list by moving the head to the next
    object (which may not exist, in which case we have a null). If the element at the front of the list is not what we
    want, execution proceeds to a loop that examines all elements starting at the second position until the end of the
    list is reached or the student with the given name is located. The variable previous always refers to the object
     preceding the object referred to by temp. Once it is located, the object can be deleted using previous.
     */
    public void delete(String studentName) {
        if (head == null) {
            return;
        }
        if (head.getData().getName().equals(studentName)) {
            head = head.getNext();
        } else {
            for (StudentNode temp = head.getNext(), previous = head; temp != null; temp.getNext()) {
                if (temp.getData().getName().equals(studentName)) {
                    previous.setNext(temp.getNext());
                    return;
                }
            }
        }

    }

    /*
    The code starts at the front of the list, extracts the data in the corresponding node and prints that data.
    Printing ends when the node it points to is null; that is, it doesn’t exist. Assuming that the Student class
    has a proper toString() method, we will get the name, address and GPA of each student printed.
     */
    public void print () {
        System.out.println("List: ");
        for (StudentNode temp = head; temp != null; temp = temp.getNext()) {
            System.out.print(temp.getData() + " ");
        }
        System.out.println();
    }
}
