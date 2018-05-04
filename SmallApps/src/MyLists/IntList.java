package MyLists;

public class IntList {
    public int value;
    public IntList next;

    public IntList(int value, IntList next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public IntList getNext() {
        return next;
    }

    public void setNext(IntList next) {
        this.next = next;
    }
}
