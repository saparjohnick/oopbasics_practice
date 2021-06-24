
import java.util.Iterator;
import java.util.LinkedList;

public class DoubleEndedQueue implements doubleended_queue_practice.Deque {
private LinkedList<Object> list = new LinkedList<Object>();
    @Override
    public boolean addAtTail(Object object) {
        try {
            list.addLast(object);
            return true;
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
            return false;
        }
    }

    @Override
    public Object removeElementAtTail() {
        try {
            System.out.println(list.removeLast() + " has successfully deleted");
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
        }
        return list;
    }

    @Override
    public Object getElementAtTail() {
        try {
            return list.getLast();
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
            return null;
        }
    }

    @Override
    public boolean addAtHead(Object value) {
        try {
            list.addFirst(value);
            return true;
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
            return false;
        }
    }

    @Override
    public Object removeElementAtHead() {
        try {
            System.out.println(list.removeFirst() + " has successfully deleted");
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
        }
        return list;
    }

    @Override
    public Object getElementAtHead() {
        try {
            return list.getFirst();
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
            return null;
        }
    }

    @Override
    public int size() {
        try {
            return list.size();
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
            return 0;
        }
    }

    @Override
    public void clear() {
        try {
            list.clear();
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
        }
    }

    @Override
    public Iterator iterator() {
        try {
            return list.iterator();
        } catch (Exception e) {
            System.out.println("Something wrong happened " + e.fillInStackTrace());
            return null;
        }
    }

    public static void main(String[] args) {
        DoubleEndedQueue list = new DoubleEndedQueue();
        inheritance_practice.Television television = new inheritance_practice.Television("S", "Sony", 23);
        list.addAtTail(television);
        list.getElementAtTail();
        list.iterator();
        System.out.println(list);
    }
}
