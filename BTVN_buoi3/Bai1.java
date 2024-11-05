public class Bai1 {
    public class Student {  
        private String studentCode;  
        private String fullName;  
        private int age;  
        private String phoneNumber;  
        private String email;  
    
        public Student() {  
        }  
    
        public Student(String studentCode, String fullName, int age, String phoneNumber, String email) {  
            this.studentCode = studentCode;  
            this.fullName = fullName;  
            this.age = age;  
            this.phoneNumber = phoneNumber;  
            this.email = email;  
        }  
    
        public String getStudentCode() {  
            return studentCode;  
        }  
    
        public void setStudentCode(String studentCode) {  
            this.studentCode = studentCode;  
        }  
    
        public String getFullName() {  
            return fullName;  
        }  
    
        public void setFullName(String fullName) {  
            this.fullName = fullName;  
        }  
    
        public int getAge() {  
            return age;  
        }  
    
        public void setAge(int age) {  
            this.age = age;  
        }  
    
        public String getPhoneNumber() {  
            return phoneNumber;  
        }  
    
        public void setPhoneNumber(String phoneNumber) {  
            this.phoneNumber = phoneNumber;  
        }  
    
        public String getEmail() {  
            return email;  
        }  
    
        public void setEmail(String email) {  
            this.email = email;  
        }  
    
        public void display() {  
            System.out.printf("| %-12s | %-30s | %-4d | %-15s | %-25s |\n",  
                    studentCode, fullName, age, phoneNumber, email);  
        }  
    }
}
