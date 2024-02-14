import java.util.ArrayList;
import java.util.Scanner;
import Packages.Database.DatabaseSystem;
import Packages.Person.Person;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Person> database = new ArrayList<Person>();
        DatabaseSystem SysDB = new DatabaseSystem(database);

        String option; 
        
        while(true) {
            showOptions();

            System.out.print("> ");
            option = s.nextLine();

            switch(option) {
                case "1":
                    SysDB.showAllRecords();
                    break;
                case "2":
                    SysDB.createRecord();
                    break;
                case "3":
                    System.out.println("3");
                    break;
                case "4":
                    System.out.println("4");
                    System.out.println("Digite o id do usuario que voce quer deletar: ");
                    int personId = s.nextInt();
                    SysDB.deleteRecord(personId);
                    break;
                case "5":
                    System.out.println("Exit");
                    s.close();
                    return;
                default:
                    System.out.println("Not an option");
                    break;
            }
        }
    }

    public static void showOptions() {
        System.out.println("---------- OPTIONS ----------");
        System.out.println("1 - List All Users");
        System.out.println("2 - Create User");
        System.out.println("3 - Edit User");
        System.out.println("4 - Delete User");
        System.out.println("5 - Exit Program");
    }
}