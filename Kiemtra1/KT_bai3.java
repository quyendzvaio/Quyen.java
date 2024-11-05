import java.util.Scanner;  

public class KT_bai3 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        
        while (true) {   
            System.out.print("nhap vao x: ");  
            Float x = sc.nextFloat();  
            
            if (x < -100 || x > 100) {  
                System.out.println("Gia tri nhap vao x sai");  
                continue;  
            }  
            
            System.out.print("nhap vao y: ");  
            int y = sc.nextInt();  
            
            if (y < -(Math.pow(2, 31)) || y > (Math.pow(2, 31) - 1)) {  
                System.out.println("Gia tri nhap vao y sai");  
                continue;  
            }  
            
            System.out.println("Result: " + Math.pow(x, y));  
            break;  
        }  
        
        sc.close();  
    }  
}