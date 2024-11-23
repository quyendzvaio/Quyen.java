package Bai1;
import java.util.Scanner; 
public class Main {
	 public static void main(String[] args) {  
	        Scanner scanner = new Scanner(System.in);  
	        TamGiac tamGiac = new TamGiac();  

	        System.out.println("Nhập kích thước 3 cạnh của tam giác (cách nhau bằng dấu cách): ");  
	        int[] kichThuocCanh = new int[3];  
	        for (int i = 0; i < 3; i++) {  
	            kichThuocCanh[i] = scanner.nextInt();  
	        }  

	        tamGiac.setCanh(kichThuocCanh);  
	        tamGiac.inCanh();  

	        if (tamGiac.kiemTraHopLe()) {  
	            double chuVi = tamGiac.tinhChuVi();  
	            double dienTich = tamGiac.tinhDienTich();  
	            System.out.println("Chu vi của tam giác: " + chuVi);  
	            System.out.println("Diện tích của tam giác: " + dienTich);  
	        } else {  
	            System.out.println("Ba cạnh này không tạo thành một tam giác hợp lệ.");  
	        }  

	        scanner.close();  
	    }  
}
