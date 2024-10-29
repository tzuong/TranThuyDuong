public class Node<T> {
    private T data;
    private Node<T> next;

    // Constructor with data and next node reference
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    // Getter and setter for data
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // Getter and setter for next node
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
