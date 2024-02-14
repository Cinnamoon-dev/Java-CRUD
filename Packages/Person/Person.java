package Packages.Person;
import Packages.Database.DatabaseObject;

public class Person extends DatabaseObject {
    private int Id;
    private String name;
    private String address;
    private int age;

    public Person(int Id, String name, String address, int age) {
        this.Id = Id;
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    public Person() {
        this.Id = -1;
        this.address = null;
        this.name = null;
        this.age = -1;
    }

    public void showInformation() {
        System.out.println("--------------------");
        System.out.println("Id: " + this.Id);
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: " + this.address);
        System.out.println("--------------------");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
}
