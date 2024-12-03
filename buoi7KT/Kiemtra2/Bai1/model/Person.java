package model;
import model.Address;
public class Person {
    private String id;
    private String fullName;
    private int age;
    private Address address;
    private String birthday;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", age='" + getAge() + "'" +
            ", address='" + getAddress() + "'" +
            ", birthday='" + getBirthday() + "'" +
            "}";
    }
    
}
