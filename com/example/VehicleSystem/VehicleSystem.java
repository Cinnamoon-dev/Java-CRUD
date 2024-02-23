package com.example.VehicleSystem;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.Vehicle.Vehicle;

public class VehicleSystem {
    private ArrayList<Vehicle> database;

    public VehicleSystem() {
        this.database = new ArrayList<Vehicle>();
    }

    public VehicleSystem(ArrayList<Vehicle> database) {
        this.database = database;
    }

    public void createRecord() {
        Scanner s = new Scanner(System.in);
        String brand, model, plate;

        System.out.print("Type the brand name: ");
        brand = s.nextLine();

        System.out.print("Type the model name: ");
        model = s.nextLine();
        
        System.out.print("Type the plate name: ");
        plate = s.nextLine();
        
        this.database.add(new Vehicle(brand, model, plate));
    }

    public void readAllRecords() {
        if(this.database.size() == 0) {
            return;
        }

        System.out.println("---------------");
        for (int i = 0; i < this.database.size(); i++) {
            this.database.get(i).getAll();
            System.out.println("---------------");
        }
    }

    public void editModelRecord() {
        Scanner s = new Scanner(System.in);
        String model, plate;

        System.out.print("Type the plate of the model you want to edit: ");
        plate = s.nextLine();

        for (int index = 0; index < this.database.size(); index++) {
            if (this.database.get(index).getPlate().equals(plate)) {
                System.out.print("Type the new model of the vehicle: ");
                model = s.nextLine();

                this.database.get(index).setModel(model);
                return;
            }
        }

        System.out.println("Vehicle not found!");
   }

    public void editBrandRecord() {
        Scanner s = new Scanner(System.in);
        String brand, plate;

        System.out.print("Type the plate of the brand you want to edit: ");
        plate = s.nextLine();

        for (int index = 0; index < this.database.size(); index++) {
            if (this.database.get(index).getPlate().equals(plate)) {
                System.out.print("Type the name of the new brand: ");
                brand = s.nextLine();

                this.database.get(index).setBrand(brand);
                return;
            }
        }
        System.out.println("Vehicle not found!");
   }

    public void editPlateRecord() {
        Scanner s = new Scanner(System.in);
        String plate;

        System.out.print("Type the name of the plate you want to edit: ");
        plate = s.nextLine();

        for (int index = 0; index < this.database.size(); index++) {
            if (this.database.get(index).getPlate().equals(plate)) {
                System.out.print("Type the name of the new plate: ");
                plate = s.nextLine();

                this.database.get(index).setPlate(plate);
                return;
            }
        }
        
        System.out.println("Vehicle not found!");
   }

   public void deleteRecord() {
        Scanner s = new Scanner(System.in);
        String plate;

        System.out.print("Type the plate of the vehicle you want to delete: ");
        plate = s.nextLine();

        for (int index = 0; index < this.database.size(); index++) {
            System.out.println("current: " + this.database.get(index).getPlate());
            System.out.println("plate: " + plate);
            System.out.println("-----");
            if(this.database.get(index).getPlate().equals(plate) ) {
                this.database.remove(index);
                System.out.println("Deleted!");
                return;
            }
        }

        System.out.println("Vehicle not found!");
   }

   public void showOptions() {
       System.out.println("---------- OPTIONS ----------");
       System.out.println("1 - List All Users");
       System.out.println("2 - Create User");
       System.out.println("3 - Edit User");
       System.out.println("4 - Delete User");
       System.out.println("5 - Exit Program");
   }

   public void showEditOptions() {
       System.out.println("1 - Edit Brand");
       System.out.println("2 - Edit Model");
       System.out.println("3 - Edit Plate");
   }
}
