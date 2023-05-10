package edu.kis.vh.nursery.list;

public class Node {

    private final int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    /**
     *
     * @return value of the node
     */
    public int getValue() {
        return value;
    }

    /**
     *
     * @return previous node
     */
    public Node getPrev() {
        return prev;
    }


    /**
     *
     * sets previous node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    /**
     *
     * @return next node
     */
    public Node getNext() {
        return next;
    }


    /**
     *
     * sets next node
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
