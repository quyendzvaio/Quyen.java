    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.List;  
    import java.util.Scanner;  
public class Bai2 {
    public class Main {  
    
        private static final Scanner scanner = new Scanner(System.in);  
        private static final List<Book> books = new ArrayList<>();  
    
        public static void main(String[] args) {  
            initializeBooks();  
            int choice;  
            do {  
                choice = showMenu();  
                handleMenuChoice(choice);  
            } while (choice != 7);  
        }  
    
        private static void initializeBooks() {  
            books.add(new Book(1, "Java Programming", "Quyen", 2022, "introduction to Java programming.", 29.99));  
            books.add(new Book(2, "C++ Programming", "qua", 2020, "Learn C++ from scratch.", 19.99));  
            books.add(new Book(3, "Python Basics", "la", 2021, "comprehensive guide to Python.", 25.00));  
            books.add(new Book(4, "Data Structures", "dz", 2019, "Understanding data structures.", 34.50));  
            books.add(new Book(5, "Algorithms Unlocked", "di", 2018, "Introduction to algorithms.", 22.30));  
        }  
    
        private static int showMenu() {  
            System.out.println("Menu:");  
            System.out.println("1. Thêm sách mới");  
            System.out.println("2. Chỉnh sửa thông tin sách");  
            System.out.println("3. In ra danh sách các cuốn sách");  
            System.out.println("4. In ra cuốn sách lâu đời nhất");  
            System.out.println("5. In ra cuốn sách phù hợp với giá yêu cầu");  
            System.out.println("6. Sắp xếp danh sách sách");  
            System.out.println("7. Thoát");  
            System.out.print("Chọn chức năng (1-7): ");  
            return scanner.nextInt();  
        }  
    
        private static void handleMenuChoice(int choice) {  
            scanner.nextLine(); 
            switch (choice) {  
                case 1: addBook(); break;  
                case 2: editBook(); break;  
                case 3: printBooks(); break;  
                case 4: printOldestBook(); break;  
                case 5: printBooksByPrice(); break;  
                case 6: sortBooks(); break;  
                case 7: System.out.println("Thoát chương trình."); break;  
                default: System.out.println("Lựa chọn không hợp lệ.");  
            }  
        }  
    
        private static void addBook() {  
            System.out.print("Nhập mã sách: ");  
            int maSach = scanner.nextInt();  
            scanner.nextLine();
            System.out.print("Nhập tên sách: ");  
            String tenSach = scanner.nextLine();  
            System.out.print("Nhập tên tác giả: ");  
            String tenTacGia = scanner.nextLine();  
            System.out.print("Nhập năm sản xuất: ");  
            int namSanXuat = scanner.nextInt();  
            scanner.nextLine(); 
            System.out.print("Nhập tóm tắt nội dung: ");  
            String tomTatNoiDung = scanner.nextLine();  
            System.out.print("Nhập giá tiền: ");  
            double giaTien = scanner.nextDouble();  
    
            books.add(new Book(maSach, tenSach, tenTacGia, namSanXuat, tomTatNoiDung, giaTien));  
            System.out.println("Đã thêm sách mới!");  
        }  
    
        private static void editBook() {  
            System.out.print("Nhập mã sách cần chỉnh sửa: ");  
            int editMaSach = scanner.nextInt();  
            Book bookToEdit = books.stream().filter(book -> book.getMaSach() == editMaSach).findFirst().orElse(null);  
            if (bookToEdit != null) {  
                System.out.print("Nhập tên sách mới: ");  
                bookToEdit.setTenSach(scanner.nextLine());  
                System.out.print("Nhập tên tác giả mới: ");  
                bookToEdit.setTenTacGia(scanner.nextLine());  
                System.out.print("Nhập năm sản xuất mới: ");  
                bookToEdit.setNamSanXuat(scanner.nextInt());  
                scanner.nextLine(); 
                System.out.print("Nhập tóm tắt nội dung mới: ");  
                bookToEdit.setTomTatNoiDung(scanner.nextLine());  
                System.out.print("Nhập giá tiền mới: ");  
                bookToEdit.setGiaTien(scanner.nextDouble());  
                System.out.println("Đã chỉnh sửa thông tin sách!");  
            } else {  
                System.out.println("Không tìm thấy sách với mã này.");  
            }  
        }  
    
        private static void printBooks() {  
            System.out.println("Danh sách các cuốn sách:");  
            books.forEach(Book::display);  
        }  
    
        private static void printOldestBook() {  
            books.stream().min(Comparator.comparingInt(Book::getNamSanXuat))  
                .ifPresentOrElse(book -> {  
                    System.out.println("Cuốn sách lâu đời nhất:");  
                    book.display();  
                }, () -> System.out.println("Danh sách sách rỗng."));  
        }  
    
        private static void printBooksByPrice() {  
            System.out.print("Nhập giá tiền bạn muốn: ");  
            double targetPrice = scanner.nextDouble();  
            books.stream().filter(book -> book.getGiaTien() <= targetPrice)  
                .forEach(Book::display);  
        }  
    
        private static void sortBooks() {  
            System.out.println("Sắp xếp theo:");  
            System.out.println("1. Tên sách");  
            System.out.println("2. Giá tiền");  
            int sortChoice = scanner.nextInt();  
            if (sortChoice == 1) {  
                books.sort(Comparator.comparing(Book::getTenSach));  
            } else if (sortChoice == 2) {  
                books.sort(Comparator.comparingDouble(Book::getGiaTien));  
            }  
            System.out.println("Đã sắp xếp danh sách sách!");  
        }  
    }
}
