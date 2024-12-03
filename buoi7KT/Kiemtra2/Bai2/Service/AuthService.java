package Bai2.Service;

import java.util.Scanner;
public interface AuthService {  
    void login(Scanner scanner);  
    void logout();  
    void changePassword(String username, String oldPassword, String newPassword);   
}
