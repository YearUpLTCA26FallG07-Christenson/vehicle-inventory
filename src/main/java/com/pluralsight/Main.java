package com.pluralsight;

public class Main {

    public static void main(String[] args){

        String mainMenuText = """
                
                
                === MAIN MENU ===
                
                What do you want to do?
                1 - List all vehicles
                2 - Search by make/model
                3 - Search by price range
                4 - Search by color
                5 - Add a vehicle
                6 - Quit
                Enter your command:""";
        
        int choice;
        do{
            choice = Console.promptForInt(mainMenuText);
            switch(choice){
                case 1 -> processListAllVehicles();
                case 2 -> processSearchByMakeModel();
                case 3 -> processSearchByPrice();
                case 4 -> processSearchByColor();
                case 5 -> processAddVehicle();
                default -> System.out.println("Invalid command, please try again...");
            }
        }  while (choice != 6);
        
    }

    private static void processListAllVehicles() {
        //todo list all vehicles
        System.out.println("list vehicles");
    }

    private static void processSearchByMakeModel() {
        //todo search make model
    }


    private static void processSearchByPrice() {
        //todo search price
    }

    private static void processSearchByColor() {
        //todo search color
    }

    private static void processAddVehicle() {
        //todo add vehicle
        System.out.println("add vehicle");
    }


}
