public class Buoi4 {  
    // public static final double PI = 3.14;  

    public class Person {  
        private String cccd;  
        private String name;  
        private int age;  
        private String address;  
        private String phonenumber;  

        public Person() {  
        }  

        public Person(String cccd, String name, int age, String address, String phonenumber) {  
            this.cccd = cccd;  
            this.name = name;  
            this.age = age;  
            this.address = address;  
            this.phonenumber = phonenumber;  
        }  

        public String getCccd() {  
            return cccd;  
        }   

        public String getName() {  
            return name;  
        }   

        public int getAge() {  
            return age;  
        }   

        public void display() {  
            System.out.printf("| %-12s | %-30s | %-4d |\n", cccd, name, age);  
        }  

        public String searchByName() {  
            return name;  
        }  

        public String searchByMaCCCD() {  
            return cccd;  
        }  
        
        public int sortAge() {  
            return age;  
        }  
    }  

    public static void main(String[] args) {  
        Buoi4 buoi4 = new Buoi4();  
        
        Person person = buoi4.new Person("01", "Quyen", 20, "BG", "1234");  

        person.display();  
        
        System.out.println("Search by Name: " + person.searchByName());  
        System.out.println("Search by CCCD: " + person.searchByMaCCCD());  
        System.out.println("Age: " + person.getAge());  
    }  
}