package doubleended_queue_practice;

import java.util.Iterator;

public interface Deque {
    public boolean addAtTail(Object object);
    public Object removeElementAtTail();
    public Object getElementAtTail();
    public boolean addAtHead(Object value);
    public Object removeElementAtHead();
    public Object getElementAtHead();
    public int size();
    public void clear();
    public Iterator iterator();
}
