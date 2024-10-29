public class Test {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(); // Khởi tạo danh sách liên kết

        // Thêm phần tử vào đầu danh sách
        ll.addFirst("td");
        ll.addFirst("CTDL va Giai thuat java");
        ll.addFirst("TITV");

        //ll.traverse(); // Duyệt và in danh sách

        // Thêm phần tử vào cuối danh sách
        ll.addLast("d ");
        ll.traverse(); // Duyệt và in danh sách

        ll.insertAfter("TITV", ".VN");
        ll.traverse(); // Duyệt và in danh sách
        System.out.println("-----------");
        System.out.println(ll.remove(".Vn"));
        System.out.println(ll.remove(".VN"));
        System.out.println("-----------");
        ll.traverse();
        System.out.println("-----------"); 
        System.out.println("check empty"+ll.isEmty());
        System.out.println("size"+ll.size());
    }
}
