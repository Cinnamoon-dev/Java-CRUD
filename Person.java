public class Person {
    private String name;
    private String address;
    private int age;

    Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    
    Person() {
        this.address = null;
        this.name = null;
        this.age = -1;
    }

    public void showInformation() {
        System.out.println("--------------------");
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
}
