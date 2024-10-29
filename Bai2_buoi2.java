    import java.util.Scanner;  

    public class Bai2_buoi2 {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
         
        int n = scanner.nextInt();  
        int k = scanner.nextInt();  
        
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {  
            arr[i] = scanner.nextInt();  
        }  
          
        int maxSum = Integer.MIN_VALUE;  
        int currentSum = 0;
        for (int i = 0; i < n; i++) {  
            currentSum += arr[i]; 

            // Khi số lượng phần tử đã đủ k  
            if (i >= k - 1) {  
                maxSum = Math.max(maxSum, currentSum); 
                // Trừ đi phần tử bên trái khỏi currentSum khi đến số lượng k  
                currentSum -= arr[i - (k - 1)];  
            }  
        }  
        System.out.println(maxSum);  
        
        scanner.close();  
    }  
}

