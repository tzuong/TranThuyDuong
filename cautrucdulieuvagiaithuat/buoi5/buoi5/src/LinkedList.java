// Định nghĩa lớp LinkedList
public class LinkedList<T> {
    private Node<T> head;  // Tham chiếu tới nút đầu tiên trong danh sách

    // Constructor mặc định
    public LinkedList() {
        this.head = null;
    }

    // Phương thức duyệt qua danh sách và in ra giá trị của các phần tử
    public void traverse() {
        Node<T> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getData());
            tmp = tmp.getNext();
        }
    }

    // Thêm phần tử vào đầu danh sách
    public void addFirst(T item) {
        Node<T> newNode = new Node<>(item, head); // Tạo một nút mới
        this.head = newNode;                      // Đặt nút mới làm nút đầu
    }

    // Thêm phần tử vào cuối danh sách
    public void addLast(T item) {
        if (head == null) {
            addFirst(item); // Nếu danh sách rỗng, thêm vào đầu
        } else {
            Node<T> newNode = new Node<>(item, null); // Tạo một nút mới
            Node<T> tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext(); // Duyệt đến nút cuối
            }
            tmp.setNext(newNode); // Thêm nút mới vào cuối
        }
    }

    public void insertAfter(T key, T toInserT){
        Node<T> newNode = new Node<>(toInserT, null); // Fix instantiation
        Node<T> tmp = head;
        
        while(tmp != null && !tmp.getData().equals(key)){ // You missed the negation (!)
            tmp = tmp.getNext();
        }
    
        if(tmp != null){
            newNode.setNext(tmp.getNext());
            tmp.setNext(newNode);
        }
    }
    // Xóa phần tử khỏi danh sách
    public boolean remove(T key) {
        if(head == null)
        return false;

        if(head.getData().equals(key)){
            this.head = head.getNext();
            return true;
        }
        Node<T> prev = null;
        Node<T> cur = head;

        while (cur!=null && !cur.getData().equals(key)) {
            prev = cur;
            cur = cur.getNext();
            
        }
        if(cur == null)
            return false;

        prev.setNext(cur.getNext());
        return true;
    }
    public boolean isEmty(){
        return head == null;
    }

    public int size() {
        int size = 0; // Correct variable name
        Node<T> tmp = head;
        
        while (tmp != null) {
            size++;  // Increment the size variable
            tmp = tmp.getNext();  // Move to the next node
        }
        
        return size; // Return the size
    }
    
}
