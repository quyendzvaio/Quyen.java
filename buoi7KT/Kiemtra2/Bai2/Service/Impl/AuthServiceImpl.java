package Bai2.Service.impl;
import java.util.Scanner;
import Bai2.Service.AuthService;
import Bai2.Service.User;  

public class AuthServiceImpl implements AuthService {  
    private String storedUsername;  
    private String storedPassword;  
    private boolean isLoggedIn;  

    public AuthServiceImpl(String username, String password) {  
        this.storedUsername = username;  
        this.storedPassword = password;  
        this.isLoggedIn = false;  
    }  

    public void login(Scanner scanner) {  
        System.out.print("Nhập tên người dùng: ");  
        String username = scanner.nextLine();  
        System.out.print("Nhập mật khẩu: ");  
        String password = scanner.nextLine();  
        
        if (username.equals(storedUsername) && password.equals(storedPassword)) {  
            isLoggedIn = true;  
            System.out.println("Đăng nhập thành công!");  
        } else {  
            System.out.println("Tên người dùng hoặc mật khẩu không chính xác.");  
        }  
    }  

    public void logout() {  
        if (isLoggedIn) {  
            isLoggedIn = false;  
            System.out.println("Đăng xuất thành công!");  
        } else {  
            System.out.println("Bạn chưa đăng nhập.");  
        }  
    }  

    public void changePassword(String username, String oldPassword, String newPassword) {  
        if (username.equals(storedUsername) && oldPassword.equals(storedPassword)) {  
            storedPassword = newPassword;  
            System.out.println("Đổi mật khẩu thành công!");  
        } else {  
            System.out.println("Tên người dùng hoặc mật khẩu cũ không chính xác.");  
        }  
    }  
}
