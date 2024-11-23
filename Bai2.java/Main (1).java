package Bai2;

import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("Nhập thông tin sinh viên:");  
        System.out.print("Tên: ");  
        String studentName = scanner.nextLine();  
        System.out.print("Địa chỉ: ");  
        String studentAddress = scanner.nextLine();  
        System.out.print("Chương trình: ");  
        String program = scanner.nextLine();  
        System.out.print("Năm: ");  
        int year = scanner.nextInt();  
        System.out.print("Điểm: ");  
        double score = scanner.nextDouble();  

        Student student = new Student(studentName, studentAddress, program, year, score);  
        System.out.println("Sinh viên: " + student.getName() + ", Điểm: " + student.getScore() + ", Xếp loại: " + student.getRating());  
        
        scanner.nextLine();  // Clear buffer  
        
        System.out.println("Nhập thông tin nhân viên:");  
        System.out.print("Tên: ");  
        String staffName = scanner.nextLine();  
        System.out.print("Địa chỉ: ");  
        String staffAddress = scanner.nextLine();  
        System.out.print("Trường: ");  
        String school = scanner.nextLine();  
        System.out.print("Lương: ");  
        double salary = scanner.nextDouble();  
        
        Staff staff = new Staff(staffName, staffAddress, school, salary);  
        System.out.print("Nhập phần trăm tăng lương: ");  
        int percent = scanner.nextInt();  
        double newSalary = staff.upToSalary(percent);  
        
        System.out.println("Nhân viên: " + staff.getName() + ", Lương mới: " + newSalary);  
        
        scanner.close();  
    }  
}
