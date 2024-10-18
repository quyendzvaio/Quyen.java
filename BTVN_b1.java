public class HelloWorld {  
    public static void main(String[] args) {  
        System.out.println("Hello, world!");  
    }  
}

/*Cách chạy mã Java
Lưu đoạn mã trên vào file có tên HelloWorld.java.
Mở terminal và chuyển đến thư mục chứa file này.
Biên dịch mã nguồn bằng câu lệnh:
bash
javac HelloWorld.java  
Lệnh này sẽ tạo ra file HelloWorld.class.
Chạy chương trình với câu lệnh:
bash
java HelloWorld  
Kết quả xuất ra sẽ là:

Hello, world!  
Phân biệt JDK, JRE và JVM
JDK (Java Development Kit):

JDK là bộ công cụ phát triển Java, bao gồm tất cả các công cụ cần thiết để phát triển, biên dịch, chạy, và gỡ lỗi ứng dụng Java.
Kết cấu của JDK bao gồm:
Compiler (javac): Biên dịch mã nguồn Java thành bytecode.
JRE (Xem phần bên dưới): Để chạy các ứng dụng Java.
Công cụ phát triển khác: Bao gồm debuggers, tài liệu (Javadoc), công cụ quản lý gói (JAR), và nhiều công cụ hỗ trợ khác.
JDK được sử dụng bởi lập trình viên để phát triển các ứng dụng Java.
JRE (Java Runtime Environment):

JRE là môi trường chạy ứng dụng Java. Nó bao gồm các thư viện và các thành phần cần thiết để chạy các ứng dụng Java đã được biên dịch (tức là đã có file .class).
JRE không bao gồm các công cụ phát triển như compiler. Nó chủ yếu dùng để chạy các ứng dụng Java trên máy tính của bạn.
JRE chứa:
JVM (Xem phần bên dưới): Để thực thi bytecode.
Thư viện Java chính (Java Libraries).
JVM (Java Virtual Machine):

JVM là máy ảo Java, có nhiệm vụ thực thi bytecode Java. Nó chạy trên nhiều hệ điều hành khác nhau, cho phép mã Java thực thi trên bất kỳ nền tảng nào có cài đặt JVM.
JVM dịch bytecode thành mã máy cụ thể cho hệ điều hành và phần cứng mà nó đang chạy.
JVM cung cấp các chức năng như quản lý bộ nhớ, garbage collection, và xử lý các exception. */