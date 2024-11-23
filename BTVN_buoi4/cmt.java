/* import: Nhập các lớp trong Java mà chúng ta sẽ sử dụng:
ArrayList: Để tạo danh sách sách động.
Comparator: Để sắp xếp danh sách sách theo các tiêu chí khác nhau.
List: Khai báo danh sách sách.
Scanner: Để nhập dữ liệu từ bàn phím.
java
public class Main {  
    private static final Scanner scanner = new Scanner(System.in);  
    private static final List<Book> books = new ArrayList<>();  
public class Main: Định nghĩa lớp chính ở đây.
scanner: Đối tượng để đọc dữ liệu từ đầu vào.
books: Một danh sách để chứa các đối tượng kiểu Book.
2. Hàm main và Khởi tạo Danh sách Sách
java
public static void main(String[] args) {  
    initializeBooks();  
    int choice;  
    do {  
        choice = showMenu();  
        handleMenuChoice(choice);  
    } while (choice != 7);  
}  
main: Hàm khởi đầu của chương trình.
initializeBooks(): Hàm này được gọi để thêm sách ban đầu vào danh sách.
do-while: Vòng lặp chạy cho đến khi người dùng chọn tùy chọn thoát (7).
3. Khởi Tạo Danh Sách Sách
java
private static void initializeBooks() {  
    books.add(new Book(1, "Java Programming", "John Doe", 2022, "An introduction to Java programming.", 29.99));  
    // Thêm thêm nhiều sách khác  
}  
initializeBooks: Phương thức này khởi tạo và thêm các sách mẫu vào danh sách. Mỗi cuốn sách được khởi tạo bằng cách sử dụng constructor của lớp Book.
4. Hiển Thị Menu
java
private static int showMenu() {  
    System.out.println("Menu:");  
    // Danh sách các tùy chọn  
    return scanner.nextInt();  
}  
showMenu: Hiển thị menu tùy chọn cho người dùng và trả về lựa chọn của họ dưới dạng số nguyên.
5. Xử Lý Lựa Chọn Menu
java
private static void handleMenuChoice(int choice) {  
    scanner.nextLine(); // Đọc newline  
    switch (choice) {  
        case 1: addBook(); break;  
        case 2: editBook(); break;  
        // Các trường hợp khác  
    }  
}  
handleMenuChoice: Nhận lựa chọn của người dùng và gọi phương thức tương ứng để thực hiện chức năng.
6. Thêm Sách Mới
java
private static void addBook() {  
    // Nhập thông tin sách từ người dùng  
    books.add(new Book(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien));  
    System.out.println("Đã thêm sách mới!");  
}  
addBook: Nhập thông tin sách từ người dùng và thêm vào danh sách books.
7. Chỉnh Sửa Thông Tin Sách
java
private static void editBook() {  
    // Tìm sách theo mã và chỉnh sửa  
    if (bookToEdit != null) {  
        // Cập nhật thông tin sách  
    }  
}  
editBook: Cho phép người dùng chỉnh sửa thông tin của sách đã có dựa trên mã sách.
8. In Danh Sách Sách
java
private static void printBooks() {  
    books.forEach(Book::display);  
}  
printBooks: In ra thông tin tất cả các sách trong danh sách bằng cách sử dụng phương thức display.
9. Tìm Cuốn Sách Lâu Đời Nhất
java
private static void printOldestBook() {  
    books.stream().min(Comparator.comparingInt(Book::getNamSanXuat))  
        .ifPresentOrElse(book -> book.display(), () -> System.out.println("Danh sách sách rỗng."));  
}  
printOldestBook: Tìm và in ra sách lâu đời nhất bằng cách sử dụng cấu trúc Stream, min, và ifPresentOrElse.
10. Lọc Sách Theo Giá
java
private static void printBooksByPrice() {  
    double targetPrice = scanner.nextDouble();  
    books.stream().filter(book -> book.getGiaTien() <= targetPrice)  
        .forEach(Book::display);  
}  
printBooksByPrice: Lọc và in ra danh sách sách có giá nhỏ hơn hoặc bằng giá mà người dùng nhập.
11. Sắp Xếp Danh Sách Sách
java
private static void sortBooks() {  
    int sortChoice = scanner.nextInt();  
    if (sortChoice == 1) {  
        books.sort(Comparator.comparing(Book::getTenSach));  
    } else if (sortChoice == 2) {  
        books.sort(Comparator.comparingDouble(Book::getGiaTien));  
    }  
}  
sortBooks: Cho phép người dùng sắp xếp danh sách sách theo tên hoặc giá tiền.
    */
