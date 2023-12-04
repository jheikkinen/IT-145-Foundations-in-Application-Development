package Paint;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Paint1 {






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
	    		                 	   
	        do {
	            try{
	                		
	                System.out.println("Enter wall height (feet): ");
	    	        wallHeight = scnr.nextDouble();
	    	               
	                }
		    	                
	                	
	                 catch (InputMismatchException excpt) {
		    	 scnr.next();
		         wallHeight = 0;
		    	}	    	            
	             do{	
	                try {
	    	            System.out.println("Enter wall width (feet): ");
	    	            wallWidth = scnr.nextDouble();
	    	            if(wallWidth <= 0){
	    	                System.out.println("Invalid input. Type in number above 0.");
	    	                break;             
	    	                }  
	                        
	    	            if(wallHeight <= 0){
	    	                System.out.println("Invalid input. Type in number above 0.");    
	    	                break;
	    	            }
	    	            
	    	            }
	                    catch (InputMismatchException e) {
		    		 scnr.next();
		    		 System.out.println("Invalid input. Type in number above 0."); 
		    		 wallWidth = 0;
		    		 break;
		    	            }
	                	break;
	                	}
	                	while (wallWidth <= 0 || wallHeight <= 0);
	                    }
		                while (wallWidth <= 0 || wallHeight <= 0);
	                	 
	    	           	
	                     }
	    while (wallHeight <= 0 || wallWidth <= 0);
	        
	    // Implement a do-while loop to ensure input is valid
	    // Prompt user to input wall's width       
	     
	  


	        // Calculate and output wall area
	        wallArea = wallHeight * wallWidth;
	        System.out.println("Wall area: " + wallArea +  " square feet");

	        // Calculate and output the amount of paint (in gallons) needed to paint the wall
	        gallonsPaintNeeded = wallArea/squareFeetPerGallons;
	        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

	    
	    
	    }
}


