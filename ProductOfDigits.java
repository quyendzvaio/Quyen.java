public class ProductOfDigits {  
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);   
    int number = scanner.nextInt();  
    int product = calculateOfDigits(Math.abs(number));  
    scanner.close();  
    }  
   
    public static int calculateOfDigits(int number) {  
    int product =1;  
    while (number >0) {  
    product *= number %10;  
    number /=10;  
    }  
    return product;  
    }  
   }  