import java.util.ArrayList;

public class PersonDatabase {
    private ArrayList<Person> database;  

    PersonDatabase() {
        this.database = new ArrayList<Person>();
    }

    public void createPerson(String name, String address, int age) {
        Person newPerson = new Person(name, address, age);
        this.database.add(newPerson);
    }

    public void printAll() {
        for(Person person : this.database) {
            person.showInformation();
        }
    }
}
