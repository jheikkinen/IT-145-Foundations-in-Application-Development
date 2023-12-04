package Paint2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Paint2 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;
        
        final double squareFeetPerGallons = 350.0;
        
        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
    do {
    	
        try {
        	do {
            	System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();   
                  if(wallHeight <= 0){
                  System.out.println("Invalid input. Type in number above 0.");
                                     }
               }
        	   
        	while (wallHeight <= 0);  	
            }
            catch (InputMismatchException excpt) {
        	scnr.next();
            System.out.println("Invalid input. Type in number above 0.");           
                                                 }
       }
    while (wallHeight <= 0);
        
    // Implement a do-while loop to ensure input is valid
    // Prompt user to input wall's width       
     do{
        try {
        	do {
            
            System.out.println("Enter wall width (feet): ");
            wallWidth = scnr.nextDouble();
            if(wallWidth <= 0){
                System.out.println("Invalid input. Type in number above 0.");
                              }
               }
        	while (wallHeight <= 0);
            }
        
        catch (InputMismatchException excpt) {
        	scnr.next();
            System.out.println("Invalid input. Type in number above 0.");
                                             }
       }
        while (wallWidth <= 0 || wallHeight <= 0);
  


        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea +  " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");
        
        // Calculate and output the number of paint cans needed to paint the wall,
        // rounded up to nearest integer
        // Complete this code block
        System.out.println("Cans needed: " + Math.ceil(gallonsPaintNeeded) + "can(s)");

    }
    }

