import java.util.ArrayList;
import java.util.Scanner;

import com.example.Vehicle.Vehicle;
import com.example.VehicleSystem.VehicleSystem;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> database = new ArrayList<>();
        VehicleSystem SysDB = new VehicleSystem(database);

        String option;

        while(true) {
            Scanner s = new Scanner(System.in);
            SysDB.showOptions();
            System.out.print("> ");
            option = s.nextLine();

            switch(option) {
                case "1":
                    SysDB.readAllRecords();
                    break;
                case "2":
                    SysDB.createRecord();
                    break;
                case "3":
                    SysDB.showEditOptions();
                    System.out.print("> ");
                    option = s.nextLine();

                    switch (option) {
                        case "1":
                            SysDB.editBrandRecord();
                            break;
                        case "2":
                            SysDB.editModelRecord();
                            break;
                        case "3":
                            SysDB.editPlateRecord();
                            break; 
                        default:
                            System.out.println("Not an option!");
                            break;
                    }
                    break;
                case "4":
                    SysDB.deleteRecord();
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
}