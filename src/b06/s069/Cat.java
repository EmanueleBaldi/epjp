package b06.s069;

public class Cat extends Mammal {
    private Tail tail; // esempio di aggregazione

    public Cat(int gestationDays, int tailLen) {
        super(gestationDays);
        this.tail = new Tail(tailLen);
    }

    @Override
    public String toString() {
        return "Cat [" + tail + ", gestation=" + gestation + "]";
    }
}
