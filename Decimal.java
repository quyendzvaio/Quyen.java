public class Decimal {  
    import java.util.Scanner
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);  
    int number = scanner.nextInt();  
    int base = scanner.nextInt();  
   
    System.out.println("Hệ cơ số phải >=2 và <=16");  
    scanner.close();  
    return;  
    }  
   
    String result = convertToBase(number, base);  
    System.out.println("Output: " + result);  
    scanner.close();  
    }  
   
    public static String convertToBase(int number, int base) {  
    if (number ==0) {  
    return "0";
    }
    StringBuilder result = new StringBuilder();  
    while (number >0) {  
    int remainder = number % base;   
    result.append(remainder);   
    result.append((char) ('A' + (remainder -10)));
    number /= base;  
    }  
    return result.reverse().toString();
   }