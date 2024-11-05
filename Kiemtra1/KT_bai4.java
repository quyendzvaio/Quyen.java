    import java.util.Scanner;  

public class KT_bai4  {  

    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        int n = sc.nextInt();  
        int[] arr = new int[n];  

        for (int i = 0; i < n; i++) {  
            arr[i] = sc.nextInt();  
        }  

        int L = sc.nextInt();  
        int R = sc.nextInt();  

        if (L < 0 || R >= n || L > R) {  
            System.out.println("vi tri L va R khong hop le");  
        } else {  
            int sum = 0;  
            for (int i = L; i <= R; i++) {  
                sum += arr[i];  
            }  
            System.out.println(sum);  
        }  

        sc.close();  
    }  
}
