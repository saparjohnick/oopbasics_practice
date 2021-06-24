package polymorphism_practice;

public abstract class AbstractBuffer implements Extendable{
    protected String[] chars;
    protected int elementCount;

    public AbstractBuffer(int capacity) {
        chars = new String[capacity];
    }
    public String toString() {
        String result = "";
        for (int index = 0; index <= chars.length; index++) {
            result += chars[index] + "\n";
        }
        return result;
    }

}
