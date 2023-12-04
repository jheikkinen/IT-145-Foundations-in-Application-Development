package Cruise;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Driver {

   String shName = "null";
	// class variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	String menuSelection = "";
    	
        initializeShipList();       // initial ships
        initializeCruiseList();     // initial cruises
        initializePassengerList();  // initial passengers
        
        while (menuSelection != "x") {
        displayMenu(); //Display the Main Menu
        //printShipList("active");
        //printCruiseList("details");
        menuSelection = scanner.nextLine();
        
        switch(menuSelection) 
        {  //Menu selections that call methods
            case "1": 
            	Driver.addShip();
                break; 
            case "2": 
                Driver.editShip(); 
                break; 
            case "3": 
            	Driver.addCruise(); 
                break; 
            case "4": 
            	Driver.editCruise();
                break;
            case "5": 
            	Driver.addPassenger();
                break;
            case "6": 
            	Driver.editPassenger(); 
                break;     
            case "A": 
            	printShipList("name"); 
                break; 
            case "B": 
            	printShipList("active");
                break; 
            case "C": 
            	printShipList("full"); 
                break; 
            case "D": 
            	printCruiseList("details");
                break;
            case "E": 
            	printCruiseList("details"); 
                break;
            case "F": 
            	printPassengerList(); 
                break;   
            case "x": 
                menuSelection = "x";
                break;    
            default: 
                System.out.println("Menu option does not exist");
        }
        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed
    	}
    	

    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        //add("Candy Cane", 20, 40, 10, 60, true);
        //add("Peppermint Stick", 10, 20, 5, 40, true);
       // add("Bon Bon", 12, 18, 2, 24, false);
        //add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
    }

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(String tName, int tBalcony, int tOceanView,
                           int tSuite, int tInterior, boolean tInService) {
        Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }


    public static void printShipList(String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");
            
            for (int i = 0; i < shipList.size(); i++) {
                Ship sTrue = shipList.get(i);
            	
            	//if (sTrue == true){
            	System.out.println(sTrue);
                }
            }
            
            
            //Ship active = shipList.get(5);
           // for (Ship eachShip: shipList) {
             //   if(eachShip.getInService()){
                	
                            
            
           
            	
    
            
            
            
            
            
            // complete this code block
        

         
    else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (Ship eachShip: shipList)
                eachShip.printShipData();

        } else 
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i=0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println("\n-----------------------------------------------------------------------------------------");
            for (Cruise eachCruise: cruiseList)
                eachCruise.printCruiseDetails();
            
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (Passenger eachPassenger: passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {
        
    	
        
        // complete this method
    	Scanner newShipInput = new Scanner(System.in); //New ship name scanner
    	System.out.println("Enter Ship's Name: ");
        String newShip = newShipInput.nextLine(); //New ship name
        
        for (Ship eachShip: shipList) {
            if (eachShip.getShipName().equalsIgnoreCase(newShip)) {
                System.out.println("That ship is already in the system. Exiting to menu...");
                return; // quits addShip() method processing
            }
        }
        Scanner scnr = new Scanner(System.in);             //Scanner
    	System.out.println("Enter Ship's balcony #: ");    //Balcony input
    	int ShipBalcony = scnr.nextInt();
    	System.out.println("Enter Ship's ocean view #: "); //Ocean View input
    	int ShipOceanView = scnr.nextInt();
    	System.out.println("Enter Ship's suite #: ");      //Suite input
    	int ShipSuite = scnr.nextInt();
    	System.out.println("Enter Ship's interior #: ");   //Interior input
    	int ShipInterior = scnr.nextInt();
    	System.out.println("Enter Ship's service status (true or false): "); //Service status input
    	String ShipStatus = scnr.nextLine();
        boolean ShipInService = scnr.nextBoolean();

        
        add(newShip, ShipBalcony, ShipOceanView, ShipSuite, ShipInterior, ShipInService); //Adding Ship to list
    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {

        // complete this method

    	Scanner newCruiseInput = new Scanner(System.in);
    	System.out.println("Enter Cruise Name: ");
        String newCruise = newCruiseInput.nextLine();
  
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equals(newCruise)) {
                System.out.println("That ship is already in the system. Exiting to menu...");
                return; // quits addCruise() method processing
            }
        }
        Scanner shipInput = new Scanner(System.in);
    	System.out.println("Enter Ship's name: ");
    	String ShipName = shipInput.nextLine();
    	
    	// ensure Ship exists
        for (Ship eachShip: shipList) {
            if (eachShip.getShipName().equalsIgnoreCase(ShipName)) { 
            	// Copied if/else statement from passenger, however it does not work in passenger if a new cruise is added.
                // Also, just had one ship and this add cruise method went through.
            	 //Ship does exist
           }else {
                System.out.println("That ship does not exist in the system. Exiting to menu...");
               return; // quits addCruise() method processing
            }
        }
    
        //User Input: Ship destination, departure, and return ports.
        Scanner scanr = new Scanner(System.in);
    	System.out.println("Enter Ship's departure port: ");
    	String departure = scanr.nextLine();
    	System.out.println("Enter Ship's destination port: ");
    	String destination = scanr.nextLine();
    	System.out.println("Enter Ship's return port: ");
    	String Return = scanr.nextLine();
        
    	Cruise newCruise1 = new Cruise(newCruise, ShipName , departure, destination, Return);
    	cruiseList.add(newCruise1);
    	
    	

        
        //add(newCruise, ShipName, departure, destination, Return);
    }

    

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (Passenger eachPassenger: passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        String newCruiseName = newPassengerInput.nextLine();

        // ensure cruise exists
        for (Cruise eachCruise: cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                // cruise does exist
            } else {
                System.out.println("That cruise does not exist in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) ||
                (room.equalsIgnoreCase("STE")) || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }

}
