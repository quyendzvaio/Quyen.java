package Bai2;

class Student extends Person {  
    private String program;  
    private int year;  
    private double score;  

    public Student(String name, String address, String program, int year, double score) {  
        super(name, address);  
        this.program = program;  
        this.year = year;  
        this.score = score;  
    }  

    public String getProgram() {  
        return program;  
    }  

    public void setProgram(String program) {  
        this.program = program;  
    }  

    public int getYear() {  
        return year;  
    }  

    public void setYear(int year) {  
        this.year = year;  
    }  

    public double getScore() {  
        return score;  
    }  

    public void setScore(double score) {  
        this.score = score;  
    }  

    public String getRating() {  
        if (score >= 90) {  
            return "A";  
        } else if (score >= 80) {  
            return "B";  
        } else if (score >= 70) {  
            return "C";  
        } else if (score >= 60) {  
            return "D";  
        } else {  
            return "F";  
        }  
    }  
}