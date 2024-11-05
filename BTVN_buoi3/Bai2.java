import java.util.*;
public class Bai2 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        List<Student> students = new ArrayList<>();  
        int choice;  

        do {  
            System.out.println("Menu:");  
            System.out.println("1. Nhập thông tin cho sinh viên");  
            System.out.println("2. Hiển thị thông tin sinh viên");  
            System.out.println("0. Thoát");  
            System.out.print("Chọn chức năng: ");  
            choice = scanner.nextInt();  
            scanner.nextLine();

            switch (choice) {  
                case 1:  
                    System.out.print("Nhập mã sinh viên: ");  
                    String studentCode = scanner.nextLine();  
                    System.out.print("Nhập họ tên đầy đủ: ");  
                    String fullName = scanner.nextLine();  
                    System.out.print("Nhập tuổi: ");  
                    int age = scanner.nextInt();  
                    scanner.nextLine();
                    System.out.print("Nhập số điện thoại: ");  
                    String phoneNumber = scanner.nextLine();  
                    System.out.print("Nhập địa chỉ email: ");  
                    String email = scanner.nextLine();  
                    
                    Student student = new Student(studentCode, fullName, age, phoneNumber, email);  
                    students.add(student);  
                    System.out.println("Thông tin sinh viên đã được thêm thành công"); 
                    break;  

                case 2:  
                    if (students.isEmpty()) {  
                        System.out.println("Chưa có thông tin sinh viên nào"); 
                    } else {  
                        System.out.printf("| %-12s | %-30s | %-4s | %-15s | %-25s |\n",  
                                "Mã SV", "Họ Tên", "Tuổi", "SĐT", "Email");  
                        System.out.println("---------------------------------------------------------------");  
                        for (Student s : students) {  
                            s.display();  
                        }  
                    }  
                    break;  

                case 0:  
                    System.out.println("Thoát chương trình.");  
                    break;  

                default:  
                    System.out.println("Chọn không hợp lệ! Vui lòng chọn lại.");  
            }  
        } while (choice != 0);  

        scanner.close();  
    }  
}