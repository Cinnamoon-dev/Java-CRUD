package Packages.Database;

import java.util.ArrayList;
import java.util.Scanner;
import Packages.Person.Person;

public class DatabaseSystem {
    private ArrayList<Person> database;
    
    public DatabaseSystem(ArrayList<Person> database) {
       this.database = database; 
    }

    public DatabaseSystem() {
        this.database = new ArrayList<Person>();
    }

    public void createRecord() {
        Scanner s = new Scanner(System.in);
        String nome, endereco;
        int idade;

        System.out.println("Crie uma pessoa na base de dados:");
        System.out.print("Nome: ");
        nome = s.nextLine();

        System.out.print("Endereco: ");
        endereco = s.nextLine();

        System.out.print("idade: ");
        idade = s.nextInt();

        Person newPerson = new Person(this.database.size() + 1, nome, endereco, idade);   
        this.database.add(newPerson);
    }

    public void showAllRecords() {
        for(Person person : this.database) {
            person.showInformation();
        }
    }

    public void editName(int id, String name) {
        Person editedPerson;

        for(Person person : this.database) {
            if(person.id == id) {
                editedPerson = person;
                editedPerson.setName(name);     
                return;
            }
        }

        System.out.println("Record not found");
    }

    public void editAge(int id, int age) {
        Person editedPerson;

        for(Person person : this.database) {
            if(person.id == id) {
                editedPerson = person;
                editedPerson.setAge(age);
                return;
            }
        }

        System.out.println("Record not found");
    }

    public void editAddress(int id, String address) {
        Person editedPerson;

        for(Person person : this.database) {
            if(person.id == id) {
                editedPerson = person;
                editedPerson.setAddress(address);
                return;
            }
        }

        System.out.println("Record not found");
    }

    public void deleteRecord(int id) {
        for(int i = 0; i < this.database.size(); i++) {
            if(this.database.get(i).getId() == id) {
                this.database.remove(i);
                return;
            }
        }
    }
}
