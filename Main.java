import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PersonDatabase database = new PersonDatabase();

        String option; 
        
        while(true) {
            showOptions();

            System.out.print("> ");
            option = s.nextLine();

            switch(option) {
                case "1":
                    System.out.println("1");
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("3");
                    break;
                case "4":
                    System.out.println("4");
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