import java.util.Scanner;
package Bai2.Service.Impl; 
  

public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        AuthService authService = new AuthServiceImpl("user1", "password123");  

        System.out.println("------ Chương Trình Đăng Nhập ------");  
        
        authService.login(scanner);  
        
        System.out.print("Bạn có muốn đổi mật khẩu không? (yes/no): ");  
        String decision = scanner.nextLine();  
        if (decision.equalsIgnoreCase("yes")) {  
            System.out.print("Nhập mật khẩu cũ: ");  
            String oldPassword = scanner.nextLine();  
            System.out.print("Nhập mật khẩu mới: ");  
            String newPassword = scanner.nextLine();  
            authService.changePassword("user1", oldPassword, newPassword);  
        }  

        authService.logout();  
        scanner.close();  
    }  
}