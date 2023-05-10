package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[MAX_SIZE];

    private int total = EMPTY;

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getFULL() {
        return FULL;
    }

    public int getTotal() {
        return total;
    }

    protected void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    protected boolean callCheck() {
        return total == EMPTY;
    }

    protected boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    protected int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
