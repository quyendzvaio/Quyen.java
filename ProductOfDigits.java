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
//    str.length()

//    char ch = str.charAt(0); // 'H'

//    String str1 = "Java";  
//     String str2 = "java";  
//     boolean isEqual = str1.equals(str2); // false  
//     boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // true

//     int index = str.indexOf("World"); // 7  
//     int lastIndex = str.lastIndexOf("o"); // 8

//     String subString = str.substring(7, 12); // "World"

//     String replaced = str.replace("World", "Java"); // "Hello, Java!"

//     String upper = str.toUpperCase(); // "HELLO, WORLD!"  
//     String lower = str.toLowerCase(); // "hello, world!"

//     String trimmed = "   Hello, World!   ".trim(); // "Hello, World!"

//     String[] parts = str.split(", "); // ["Hello", "World!"]

//     boolean contains = str.contains("Hello"); // chuoi co chua chuoi "Hello" khong

